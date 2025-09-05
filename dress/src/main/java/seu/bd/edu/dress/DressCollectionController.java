package seu.bd.edu.dress;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;

import static seu.bd.edu.dress.DressController.dressList;

public class DressCollectionController implements Initializable {

    @FXML
    public TableColumn<Dress, String> boostColumn;

    @FXML
    public Label boostingLabel;

    @FXML
    public TableColumn<Dress, String> colorColumn;

    @FXML
    public Label colorLabel;

    @FXML
    public Label customerLabel;

    @FXML
    public Label detailsLabel;

    @FXML
    public Label discountLabel;

    /*@FXML
    public PasswordField passwordText;

    @FXML
    public TextField discountField;

    @FXML
    public CheckBox checkBox;

     */

    @FXML
    public TableColumn<Dress, String> nameColumn;

    @FXML
    public Label nameLabel;

    @FXML
    public TableColumn<Dress, Integer> priceColumn;

    @FXML
    public Label priceLabel;

    @FXML
    public TableColumn<Dress, String> purchasColumn;

    @FXML
    public Label purchaseLavel;

    @FXML
    public TableColumn<Dress, Integer> quantityColumn;

    @FXML
    public Label quantityLabel;

    @FXML
    public TextField searchField;

    @FXML
    public Label sizeLabel;

    @FXML
    public TableColumn<Dress, String> typeColumn;

    @FXML
    public Label typeLabel;
    @FXML
    public TableView<Dress> dressTable;
    @FXML
    public Button toggleButton;
    @FXML
    public boolean isShowing = false;

    @FXML
    private PasswordField discountField;

    @FXML
    private TextField passwordText;


    //public boolean isDiscountVisible = false;

    @FXML
    void backEvent(ActionEvent event) {
        HelloApplication.changeScene("dress.fxml");
    }

    @FXML
    void showEvent(ActionEvent event) {
        if (!isShowing) {
            // Show password
            passwordText.setText(discountField.getText());
            passwordText.setVisible(true);
            discountField.setVisible(false);

            toggleButton.setText("Hide");
            isShowing = true;
        } else {
            discountField.setText(passwordText.getText());
            discountField.setVisible(true);
            passwordText.setVisible(false);

           // toggleButton.setText("Show");
            isShowing = false;
        }
    }

@Override
public void initialize(URL url, ResourceBundle resourceBundle) {

    try {
        RandomAccessFile raf = new RandomAccessFile("dress.txt", "r");
        dressList.clear();
        String line;
        while ((line = raf.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 11) {
                Dress d = new Dress(
                        parts[0], parts[1], parts[2], parts[3],
                        Integer.parseInt(parts[4]), parts[5], parts[6],
                        Integer.parseInt(parts[7]), parts[8], parts[9], parts[10]
                );
                dressList.add(d);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }


    nameColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getName()));
    typeColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getType()));
    colorColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getColor()));
    priceColumn.setCellValueFactory(cell -> new SimpleIntegerProperty(cell.getValue().getPrice()).asObject());
    purchasColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getPurchaseDate()));
    quantityColumn.setCellValueFactory(cell -> new SimpleIntegerProperty(cell.getValue().getQuantity()).asObject());
    boostColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getBoosting()));

    dressTable.setItems(dressList);


    searchField.textProperty().addListener((obs, oldVal, newVal) -> {
        if (newVal == null || newVal.isEmpty()) {
            dressTable.setItems(dressList); // show all
        } else {
            ObservableList<Dress> filteredList = FXCollections.observableArrayList();
            for (Dress d : dressList) {
                if (d.getName().toLowerCase().contains(newVal.toLowerCase()) ||
                        d.getType().toLowerCase().contains(newVal.toLowerCase()) ||
                        d.getColor().toLowerCase().contains(newVal.toLowerCase())) {
                    filteredList.add(d);
                }
            }
            dressTable.setItems(filteredList);
        }
    });




    dressTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
        if (newSelection != null) {
            nameLabel.setText(newSelection.getName());
            typeLabel.setText(newSelection.getType());
            sizeLabel.setText(newSelection.getSize());
            colorLabel.setText(newSelection.getColor());
            priceLabel.setText(String.valueOf(newSelection.getPrice()));
            detailsLabel.setText(newSelection.getDetails());
            purchaseLavel.setText(newSelection.getPurchaseDate());
            quantityLabel.setText(String.valueOf(newSelection.getQuantity()));


           discountField.setText(newSelection.getDiscount());
            //passwordText.setText(newSelection.getDiscount());
            //discountField.setVisible(true);
           // passwordText.setVisible(false);
           // checkBox.setSelected(false);

            customerLabel.setText(newSelection.getCustomer());
            boostingLabel.setText(newSelection.getBoosting());


            //discountLabel.setVisible(false);

            if (newSelection.getQuantity() <= 10) {
                quantityLabel.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
                quantityLabel.setText("Available Quantity:  " + newSelection.getQuantity());
            } else {
                quantityLabel.setStyle("-fx-text-fill: green; -fx-font-weight: normal;");
                quantityLabel.setText("Available Quantity:  " + newSelection.getQuantity());
            }

        }
    });
}



}

