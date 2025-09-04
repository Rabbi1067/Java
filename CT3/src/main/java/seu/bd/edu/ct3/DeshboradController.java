package seu.bd.edu.ct3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DeshboradController implements Initializable {
    @FXML
    public Label genrLabel;

    @FXML
    public Label nameLabel;

    @FXML
    public Label statusLabel;

    @FXML
    public void backEvent() {
        HelloApplication.changeScene("registration.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        genrLabel.setText(RegistrationController.genre1);
        nameLabel.setText(RegistrationController.name1);
        statusLabel.setText(RegistrationController.status1);
    }
}
