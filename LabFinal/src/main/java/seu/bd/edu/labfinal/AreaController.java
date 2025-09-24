package seu.bd.edu.labfinal;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AreaController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField widthField;

    @FXML
    private TableView<AreaModel> tableView;

    @FXML
    private TableColumn<AreaModel, Double> heightCol;

    @FXML
    private TableColumn<AreaModel, Double> widthCol;

    @FXML
    private TableColumn<AreaModel, Double> areaCol;

    private final AreaOperations service = new AreaService();

    @FXML
    public void initialize() {
        heightCol.setCellValueFactory(new PropertyValueFactory<>("height"));
        widthCol.setCellValueFactory(new PropertyValueFactory<>("width"));
        areaCol.setCellValueFactory(new PropertyValueFactory<>("area"));

        // Center align for all columns
    heightCol.setStyle("-fx-alignment: CENTER;");
    widthCol.setStyle("-fx-alignment: CENTER;");
    areaCol.setStyle("-fx-alignment: CENTER;");
        
        loadTable();
    }

    @FXML
    public void handleCalculate() {
        String heightText = heightField.getText().trim();
        String widthText = widthField.getText().trim();


        if (heightText.isEmpty() && widthText.isEmpty()) {
            showAlert("Both fields are empty", "Please enter height and width.");
            return;
        } else if (heightText.isEmpty()) {
            showAlert("Height is empty", "Please enter height.");
            return;
        } else if (widthText.isEmpty()) {
            showAlert("Width is empty", "Please enter width.");
            return;
        }

        try {
            double height = Double.parseDouble(heightText);
            double width = Double.parseDouble(widthText);

            service.calculate(height, width);
            loadTable();

            heightField.clear();
            widthField.clear();
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Height and Width must be numbers.");
        }
    }

    private void loadTable() {
        ObservableList<AreaModel> list = service.getList();
        tableView.setItems(list);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("⚠ Warning");
        alert.setHeaderText(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

