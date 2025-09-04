package seu.bd.edu.ct3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {
public static  String name1,genre1,status1;

    @FXML
    public TextField titleField;

@FXML
    public ChoiceBox<String> genreField;



    @FXML
    public ToggleGroup statusToggle;

    @FXML
    public void saveEvent() {
        String bookName = titleField.getText();
        String genre = genreField.getValue();
        Toggle selectedToggle = statusToggle.getSelectedToggle();
        if (selectedToggle == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Alert");
            alert.setHeaderText("Fill ALL");
            alert.setContentText("Please select a status");
            alert.showAndWait();
            return;
        }
        RadioButton rb = (RadioButton) selectedToggle;
        String status = rb.getText();

        try{
            RandomAccessFile raf=new RandomAccessFile("reg.txt","rw");
            raf.seek(raf.length());
            raf.writeBytes(bookName+","+genre+","+status+"\n");

        }catch(IOException e){
            System.out.println(e);
        }

        name1=bookName;
        genre1=genre;
        status1=status;
        HelloApplication.changeScene("deshboard.fxml");


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.add("Fiction");
        observableList.add("Novel");
        observableList.add("Poetry");
        genreField.setItems(observableList);
    }
}
