package seu.bd.edu.labfinal;

import javafx.collections.ObservableList;

public interface AreaOperations {
    double calculate(double height, double width);
    ObservableList<AreaModel> getList();
}
