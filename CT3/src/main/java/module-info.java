module seu.bd.edu.ct3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens seu.bd.edu.ct3 to javafx.fxml;
    exports seu.bd.edu.ct3;
}