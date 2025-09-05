module seu.bd.edu.admissiobscene {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.sis to javafx.fxml;
    exports bd.edu.seu.sis;
}