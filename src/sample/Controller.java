package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text greetingText;

    @FXML
    private Button dogTag;

    public void chosenDog(ActionEvent actionEvent) {
        greetingText.setText("Woof");
    }

    @FXML
    private Button catTag;

    public void chosenCat(ActionEvent actionEvent) {
        greetingText.setText("Meow");

    }

    @FXML
    private Button cowTag;

    public void chosenCow(ActionEvent actionEvent) {
        greetingText.setText("Moo");


    }
}
