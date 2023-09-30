import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    private String numString = "";
    private double op1, op2, number, result;
    private boolean plusPressed = false;
    private boolean minusPressed = false;
    private boolean multiplyPressed = false;
    private boolean dividePressed = false;
    private boolean decimalPressed = false;
    
    private Label displayLabel = new Label("0.0");
    
    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        displayLabel.setFont(Font.font("Courier", 26));
        displayLabel.setStyle("-fx-border-color: blue;");
        
        GridPane buttonGrid = createButtonGrid();
        
        // Create the clear button
        Button clearButton = createButton("C", 58.75, 40);
        clearButton.setOnAction(e -> clear());
        
        // Create the operations buttons
        Button divideButton = createOperationButton("/", 58.75, 40, () -> dividePressed = true);
        Button multiplyButton = createOperationButton("x", 58.75, 40, () -> multiplyPressed = true);
        Button subtractButton = createOperationButton("-", 58.75, 40, () -> minusPressed = true);
        Button addButton = createOperationButton("+", 40, 90, () -> plusPressed = true);
        Button equalsButton = createButton("=", 40, 90);
        equalsButton.setOnAction(e -> calculateResult());
        
        // Create the decimal button
        Button decimalButton = createButton(".", 65, 40);
        decimalButton.setOnAction(e -> handleDecimal());
        
        // Layout
        HBox operationButtons = new HBox(divideButton, multiplyButton, subtractButton, addButton);
        HBox numberButtons = new HBox(clearButton, operationButtons, equalsButton);
        
        VBox root = new VBox(displayLabel, buttonGrid, numberButtons, decimalButton);
        
        Scene scene = new Scene(root, 270, 300);
        
        primaryStage.setTitle("Standard Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createButtonGrid() {
        GridPane buttonGrid = new GridPane();
        buttonGrid.setAlignment(Pos.CENTER);
        buttonGrid.setHgap(5);
        buttonGrid.setVgap(5);
        
        for (int i = 1; i <= 9; i++) {
            int number = i;
            Button button = createButton(String.valueOf(i), 65, 40);
            button.setOnAction(e -> handleNumber(number));
            int row = (i - 1) / 3;
            int col = (i - 1) % 3;
            buttonGrid.add(button, col, row);
        }
        
        // Add the zero button separately
        Button zeroButton = createButton("0", 135, 40);
        zeroButton.setOnAction(e -> handleNumber(0));
        buttonGrid.add(zeroButton, 0, 3, 2, 1);
        
        return buttonGrid;
    }

    private Button createButton(String label, double width, double height) {
        Button button = new Button(label);
        button.setFont(Font.font("Courier", 18));
        button.setAlignment(Pos.CENTER);
        button.setPrefSize(width, height);
        return button;
    }
    
    private Button createOperationButton(String label, double width, double height, Runnable action) {
        Button button = createButton(label, width, height);
        button.setOnAction(e -> {
            action.run();
            numString = "";
            decimalPressed = false;
            displayLabel.setText(label);
        });
        return button;
    }

    private void handleNumber(int number) {
        numString += number;
        this.number = Double.parseDouble(numString);
        displayLabel.setText(numString);
    }

    private void handleDecimal() {
        if (!decimalPressed) {
            if (numString.isEmpty()) {
                numString = "0.";
            } else {
                numString += ".";
            }
            this.number = Double.parseDouble(numString);
            displayLabel.setText(numString);
        }
        decimalPressed = true;
    }

    private void clear() {
        op1 = 0;
        number = 0;
        numString = "";
        plusPressed = false;
        minusPressed = false;
        multiplyPressed = false;
        dividePressed = false;
        decimalPressed = false;
        displayLabel.setText("0.0");
    }

    private void calculateResult() {
        op2 = number;
        if (plusPressed) {
            result = op1 + op2;
        } else if (minusPressed) {
            result = op1 - op2;
        } else if (multiplyPressed) {
            result = op1 * op2;
        } else if (dividePressed) {
            result = op1 / op2;
        }
        displayLabel.setText(Double.toString(result));
        plusPressed = false;
        minusPressed = false;
        multiplyPressed = false;
        dividePressed = false;
        numString = Double.toString(result);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
