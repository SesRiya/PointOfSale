package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			stage = primaryStage;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void next(Event e) {
		try {
			SecondScreen secondScreen = new SecondScreen();
			secondScreen.start(stage);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		System.out.println("Test Push");
		System.out.println("Github");
		launch(args);
	}
}
