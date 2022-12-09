

	import javafx.application.Application;
	import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.scene.control.Alert;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.scene.control.Alert.AlertType;
	import javafx.scene.layout.GridPane;
	import javafx.scene.paint.Color;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;

	public class ATM extends Application {

		

		@Override
		public void start(Stage primaryStage) throws Exception {
			
			
			customersData cus = new customersData("Larry","smith",10000,true,"Smith234","9800");
			customersData cus1 = new customersData("Amy","smith",5000,false,"Amy987","0076");
			customersData cus2 = new customersData("John","Doe",8000,true,"jh234","1267");
			
			Group root = new Group();
			Scene scene = new Scene(root, 800,600, Color.AZURE);
			GridPane grid = new GridPane();
			
			Label text = new Label("User name ");
			TextField textfield = new TextField();
			Label text1 = new Label ("Password");
			PasswordField pin = new PasswordField();
			Button btn = new Button ("Sign in");
			
			grid.add(text, 0, 0);
			grid.add(textfield, 0, 5);
			grid.add(text1, 3, 0);
			grid.add(pin, 3, 5);
			grid.add(btn, 9, 20);
			
			grid.setVgap(5);
			grid.setHgap(5);
			
			root.getChildren().addAll(grid);
			
			
			btn.setOnAction(e -> {
				
				
				if(textfield.getText().equals(cus.getUsername()) && pin.getText().equals(cus.getPassword())) {
					
					Alert alert = new Alert(AlertType.CONFIRMATION);
					
					alert.setContentText("login success");
					
					alert.show();
					
				}
				
				else if (textfield.getText().equals(cus1.getUsername()) && pin.getText().equals(cus1.getPassword())) {
					
					
					Alert alert = new Alert(AlertType.CONFIRMATION);
					
					alert.setContentText("login success");
					
					alert.show();
					
					
					
				}
				
				else if (textfield.getText().equals(cus2.getUsername()) && pin.getText().equals(cus2.getPassword())) {
					
					Alert alert = new Alert(AlertType.CONFIRMATION);
					
					alert.setContentText("login success");
					
					alert.show();
					
					
					
				}
				
				else {
					Alert alert = new Alert(AlertType.ERROR);
					
					alert.setContentText("invalid login");
					
					alert.show();
					
				}
				
				
					});
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
			primaryStage.setTitle("ATM machine");
			
			
		}


	public static void main(String[] args) {
		
		launch(args);
		
	}

	}



	