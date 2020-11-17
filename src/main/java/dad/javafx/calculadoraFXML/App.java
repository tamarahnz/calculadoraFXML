package dad.javafx.calculadoraFXML;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller c;

	public void start(Stage primaryStage) throws Exception {
		c = new Controller();
		Scene scene = new Scene(c.getView(), 320, 200);
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}