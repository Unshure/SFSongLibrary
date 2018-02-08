package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	//Buttons to support the main add, delete, and edit operations
	Button button_Add;
	Button button_Delete;
	Button button_Edit;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Nicktunes");
			
			//Buttons
			button_Add = new Button();
			button_Add.setText("Add");
			
			button_Delete = new Button();
			button_Delete.setText("Delete");
			
			button_Edit = new Button();
			button_Edit.setText("Edit");
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1280,720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
