import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage; 


public class App extends Application 
{
	
	String numString = ""; 
	double op1, op2, number, result; 
	Boolean plus_pressed = false; 
	Boolean minus_pressed = false; 
	Boolean multi_pressed = false; 
	Boolean divi_pressed = false;  
	Boolean decimal_pressed = false;
	
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception
	{
		
		// Label for calculations 
		Label myLabel = new Label("");
		myLabel.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,26));
		myLabel.setStyle("-fx-border-color: blue;");
		myLabel.setAlignment(Pos.BASELINE_RIGHT); // align text to the right side of the label.
		myLabel.setLayoutX(10);       // set the x location of the label
		myLabel.setLayoutY(10);       // set the y location of the label
		myLabel.setPrefSize(250, 40); // set the width and height of the label
		myLabel.setText(Double.toString(0.0));
		
		// Create buttons for calculator 
		/* Buttons for numbers 0-9 & decimal */ 
		
		Button ZeroBtn = new Button("0");
		ZeroBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		ZeroBtn.setAlignment(Pos.CENTER);
		ZeroBtn.setLayoutX(10);
		ZeroBtn.setLayoutY(250);
		ZeroBtn.setPrefSize(135, 40);
		ZeroBtn.setOnAction(e -> {
			if (numString == "") {
				myLabel.setText("0.0");
				}
			else {
				numString = numString + "0";
				number = Double.parseDouble(numString);
				myLabel.setText(numString);
			}
		}); 
		
		
		Button OneBtn = new Button("1");
		OneBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		OneBtn.setAlignment(Pos.CENTER);
		OneBtn.setLayoutX(10);
		OneBtn.setLayoutY(200);
		OneBtn.setPrefSize(65, 40);
		OneBtn.setOnAction(e -> {
			numString = numString + "1";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 

		
		Button TwoBtn = new Button("2");
		TwoBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		TwoBtn.setAlignment(Pos.CENTER);
		TwoBtn.setLayoutX(80);
		TwoBtn.setLayoutY(200);
		TwoBtn.setPrefSize(65, 40);
		TwoBtn.setOnAction(e -> {
			numString = numString + "2";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button ThreeBtn = new Button("3");
		ThreeBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		ThreeBtn.setAlignment(Pos.CENTER);
		ThreeBtn.setLayoutX(150);
		ThreeBtn.setLayoutY(200);
		ThreeBtn.setPrefSize(65, 40);
		ThreeBtn.setOnAction(e -> {
			numString = numString + "3";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button FourBtn = new Button("4");
		FourBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		FourBtn.setAlignment(Pos.CENTER);
		FourBtn.setLayoutX(10);
		FourBtn.setLayoutY(155);
		FourBtn.setPrefSize(65, 40);
		FourBtn.setOnAction(e -> {
			numString = numString + "4";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button FiveBtn = new Button("5");
		FiveBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		FiveBtn.setAlignment(Pos.CENTER);
		FiveBtn.setLayoutX(80);
		FiveBtn.setLayoutY(155);
		FiveBtn.setPrefSize(65, 40);
		FiveBtn.setOnAction(e -> {
			numString = numString + "5";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button SixBtn = new Button("6");
		SixBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		SixBtn.setAlignment(Pos.CENTER);
		SixBtn.setLayoutX(150);
		SixBtn.setLayoutY(155);
		SixBtn.setPrefSize(65, 40);
		SixBtn.setOnAction(e -> {
			numString = numString + "6";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button SevenBtn = new Button("7");
		SevenBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		SevenBtn.setAlignment(Pos.CENTER);
		SevenBtn.setLayoutX(10);
		SevenBtn.setLayoutY(110);
		SevenBtn.setPrefSize(65, 40);
		SevenBtn.setOnAction(e -> {
			numString = numString + "7";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button EightBtn = new Button("8");
		EightBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		EightBtn.setAlignment(Pos.CENTER);
		EightBtn.setLayoutX(80);
		EightBtn.setLayoutY(110);
		EightBtn.setPrefSize(65, 40);
		EightBtn.setOnAction(e -> {
			numString = numString + "8";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button NineBtn = new Button("9");
		NineBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		NineBtn.setAlignment(Pos.CENTER);
		NineBtn.setLayoutX(150);
		NineBtn.setLayoutY(110);
		NineBtn.setPrefSize(65, 40);
		NineBtn.setOnAction(e -> {
			numString = numString + "9";
			number = Double.parseDouble(numString);
			myLabel.setText(numString);
		}); 
		
		
		Button DecimalBtn = new Button(".");
		DecimalBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		DecimalBtn.setAlignment(Pos.CENTER);
		DecimalBtn.setLayoutX(150);
		DecimalBtn.setLayoutY(250);
		DecimalBtn.setPrefSize(65, 40);
		DecimalBtn.setOnAction(e -> {
			if (decimal_pressed == false) {
				if (numString == "") {
					numString = numString + "0.";
				}
				else {
					numString = numString + ".";
				}
				number = Double.parseDouble(numString);
				myLabel.setText(numString);
			}
			else if (decimal_pressed == true) {
				number = Double.parseDouble(numString);
				myLabel.setText(numString);
			}
			decimal_pressed = true; 
		}); 
		
		/* Addition, subtraction, multiplication, division, 
		 * equal, and clear buttons 
		 * */
		
		Button ClearBtn = new Button("C");
		ClearBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		ClearBtn.setAlignment(Pos.CENTER);
		ClearBtn.setLayoutX(10);
		ClearBtn.setLayoutY(65);
		ClearBtn.setPrefSize(58.75, 40);
		ClearBtn.setOnAction(e -> {
			op1 = 0; 
			number = 0;
			myLabel.setText("0.0");
			numString = "";
			plus_pressed = false; 
			minus_pressed = false; 
			multi_pressed = false; 
			divi_pressed = false; 
			decimal_pressed = false;
		}); 
	
		Button DivBtn = new Button("/");
		DivBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		DivBtn.setAlignment(Pos.CENTER);
		DivBtn.setLayoutX(73.75);
		DivBtn.setLayoutY(65);
		DivBtn.setPrefSize(58.75, 40);
		DivBtn.setOnAction(e -> {
			op1 = number; 
			number = 0.0;
			myLabel.setText("/");
			numString = "";
			divi_pressed = true;
			decimal_pressed = false;
		}); 
		
		Button MultiBtn = new Button("x");
		MultiBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		MultiBtn.setAlignment(Pos.CENTER);
		MultiBtn.setLayoutX(137.5);
		MultiBtn.setLayoutY(65);
		MultiBtn.setPrefSize(58.75, 40);
		MultiBtn.setOnAction(e -> {
			op1 = number; 
			number = 0.0;
			myLabel.setText("x");
			numString = "";
			multi_pressed = true; 
			decimal_pressed = false;
		}); 
		
		Button SubBtn = new Button("-");
		SubBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		SubBtn.setAlignment(Pos.CENTER);
		SubBtn.setLayoutX(201.25);
		SubBtn.setLayoutY(65);
		SubBtn.setPrefSize(58.75, 40);
		SubBtn.setOnAction(e -> {
				op1 = number; 
				number = 0.0;
				myLabel.setText("-");
				numString = "";
				minus_pressed = true; 
				decimal_pressed = false;
			
		}); 
		
		Button AddBtn = new Button("+");
		AddBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		AddBtn.setAlignment(Pos.CENTER);
		AddBtn.setLayoutX(220);
		AddBtn.setLayoutY(110);
		AddBtn.setPrefSize(40, 90);
		AddBtn.setOnAction(e -> {
				op1 = number; 
				number = 0.0;
				myLabel.setText("+");
				numString = "";
				plus_pressed = true; 
				decimal_pressed = false;
		}); 
				
		Button EqualBtn = new Button("=");
		EqualBtn.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,18));
		EqualBtn.setAlignment(Pos.CENTER);
		EqualBtn.setLayoutX(220);
		EqualBtn.setLayoutY(200);
		EqualBtn.setPrefSize(40, 90);
		EqualBtn.setOnAction(e -> {
			op2 = number; 
			if (plus_pressed == true) {
				result = op1 + op2;
				myLabel.setText(Double.toString(result));
				plus_pressed = false;
				number = 0.0;
				numString = "";
			}
			else if (minus_pressed == true) {
				result = op1 - op2;
				myLabel.setText(Double.toString(result));
				minus_pressed = false;
				number = 0.0;
				numString = "";
			}
			else if (multi_pressed == true) {
				result = op1 * op2;
				myLabel.setText(Double.toString(result));
				multi_pressed = false;
				number = 0.0;
				numString = "";
			}
			else if (divi_pressed == true) {
				result = op1 / op2;
				myLabel.setText(Double.toString(result));
				divi_pressed = false;
				number = 0.0;
				numString = "";
			}
			decimal_pressed = false;
		}); 
		
		
		/* Create scene and add buttons */
		Pane pane = new Pane();
		pane.getChildren().addAll(OneBtn, TwoBtn, ThreeBtn, FourBtn,
				FiveBtn, SixBtn, SevenBtn, EightBtn, NineBtn, ZeroBtn,
				AddBtn, SubBtn, MultiBtn, DivBtn, EqualBtn, myLabel, 
				ClearBtn, DecimalBtn);
		
		Scene scene = new Scene(pane,270,300);
		primaryStage.setTitle("Standard Calculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}