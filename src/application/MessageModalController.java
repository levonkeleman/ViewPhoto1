package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MessageModalController extends Application{

    @FXML
    private Label lbl_message;

    @FXML
    private Button btn_ok;
    
    public MessageModalController() {
    	
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//Tekst labele treba if-ati u tri slucaja: deleting pic, deleting folders and deleting albums
		lbl_message.setText("You have successfully deleted the picture!");
		
	}

}

