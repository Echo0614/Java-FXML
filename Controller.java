package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller
{
	public Button someButton; //refers to the id in sample.fxml
	
	//method that tied to item in FXML (button, label, etc)
	public void handleButtonClicked()
	{
		System.out.println("Print out in terminal");
		someButton.setText("Stop clicking me!");
	}
}
