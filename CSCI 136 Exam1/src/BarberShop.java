



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BarberShop extends Application{
	TextField field1;
	TextField field2;
	TextField field3;
	Text myText;
	String finalStuff;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	
	}
	int wait = 0;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		field1 = new TextField("First Name");
		field1.setLayoutX(200);
		field1.setLayoutY(100);
		
		
		
		field2 = new TextField("Last Name");
		field2.setLayoutX(200);
		field2.setLayoutY(150);
		
		field3 = new TextField("Phone #");
		field3.setLayoutX(200);
		field3.setLayoutY(200);
		
		Button button = new Button("Submit");
		button.setLayoutX(200);
		button.setLayoutY(250);
		button.setOnAction(this::action);
		
		
		
		Text text = new Text(200,300, "Waiting List:");
		
		myText = new Text(200,350," ");
		
		
		Group root = new Group(field1,field2,field3,myText, text,button);
		Scene scene = new Scene(root, 500,600, Color.WHITE);
		primaryStage.setTitle("Barber Shop");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		public void action(ActionEvent args) {
			
			String fName = field1.getText();
			String lName = field2.getText();
			String num = field3.getText();
			wait += 15;
			Customer customer = new Customer(fName,lName,num);
			customer.setWait(wait);
			finalStuff += customer.toString();
			myText.setText(finalStuff);
			
			
		}
	

}
