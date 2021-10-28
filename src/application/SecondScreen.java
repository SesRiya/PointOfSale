package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SecondScreen extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		Parent root = loader.load(getClass().getResource("SecondLayout.fxml"));
		Scene scene = new Scene(root, 650,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
