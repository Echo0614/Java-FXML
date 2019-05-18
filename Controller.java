package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
	public Button someButton; //refers to the id in sample.fxml
	
	//method that tied to item in FXML (button, label, etc)
	public void handleButtonClicked()
	{
		System.out.println("Print out in terminal");
		someButton.setText("Stop clicking me!");
	}
	
	//initialize is a method that runs right after the view is loaded
	public void initialize(URL location, ResourceBundle resources)
	{
		system.out.println("Loading user data...");
	}
}
