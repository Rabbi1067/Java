module seu.bd.edu.labfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens seu.bd.edu.labfinal to javafx.fxml;
    exports seu.bd.edu.labfinal;
}