package bd.edu.seu.sis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {
    @FXML
    public Label bioLabel;

    @FXML
    public Label genderLabel;

    @FXML
    public Label idLabel;

    @FXML
    public Label nameLabel;

    @FXML
    public Label programLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idLabel.setText(AdmissionController.admittedStudentId);
        nameLabel.setText(AdmissionController.admittedStudentName);
        programLabel.setText(AdmissionController.admittedStudentProgram);
        genderLabel.setText(AdmissionController.admittedStudentGender);
        bioLabel.setText(AdmissionController.admittedStudentBiography);
    }

    @FXML
    public void backEvent(ActionEvent event) {
       HelloApplication.changeScene("admission");
    }

}