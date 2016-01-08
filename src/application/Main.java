package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		//Ovo treba prebaciti u kontroler MessageModalController, ovdje je stavljeno samo za testiranje
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("MessageModal.fxml"));
			Scene scene = new Scene(root,350,150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			//Title treba if-ati u tri slucaja: deleting pic, deleting folders and deleting albums
			primaryStage.setTitle("TITLE");
			primaryStage.setMinWidth(350);
			primaryStage.setMinHeight(150);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
