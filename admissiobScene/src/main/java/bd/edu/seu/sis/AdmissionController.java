package bd.edu.seu.sis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class AdmissionController implements Initializable {

    public static String admittedStudentId = "";
    public static String admittedStudentName = "";
    public static String admittedStudentProgram = "";
    public static String admittedStudentGender = "";
    public static String admittedStudentBiography = "";


    @FXML
    public CheckBox agreeCheckBox;

    @FXML
    public TextArea bioTextArea;

    @FXML
    public ToggleGroup genderToggle;

    @FXML
    public TextField idField;

    @FXML
    public TextField nameField;

    @FXML
    public PasswordField passwordField;

    @FXML
    public ChoiceBox<String> programChoiceBox;

    @FXML
    public void admitEvent(ActionEvent event) {
        String id = idField.getText();
        String name = nameField.getText();
        String password = passwordField.getText();
        String bio = bioTextArea.getText();
        String program = programChoiceBox.getValue();
        boolean agree = agreeCheckBox.isSelected();

        RadioButton selectedGender = (RadioButton) genderToggle.getSelectedToggle();
        String gender = selectedGender.getText();

        if (id.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setContentText("You must provide an ID");
            alert.showAndWait();
            return;
        }

        if (agree) {
            System.out.println("Id: " + id);
            System.out.println("Name: " + name);
            System.out.println("Program: " + program);
            System.out.println("Gender: " + gender);
            System.out.println("Password: " + password);
            System.out.println("Bio: " + bio);
            System.out.println("Agree: " + agree);

            admittedStudentId = id;
            admittedStudentName = name;
            admittedStudentProgram = program;
            admittedStudentGender = gender;
            admittedStudentBiography = bio;

            HelloApplication.changeScene("profile");
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setContentText("You must agree");
            alert.showAndWait();
        }


    }

    @FXML
    public void newButtonEvent(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am from initialize method");

        ObservableList<String> programObservableList = FXCollections.observableArrayList();
        programObservableList.add("CSE");
        programObservableList.add("EEE");
        programObservableList.add("BBA");

        programChoiceBox.setItems(programObservableList);
    }
}