package seu.bd.edu.labfinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AreaService implements AreaOperations {

    private final Connection conn = ConnectionSingleton.getConnection();

    @Override
    public double calculate(double height, double width) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO data(height, width) VALUES (?, ?)"
            );
            ps.setDouble(1, height);
            ps.setDouble(2, width);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return height * width;
    }

    @Override
    public ObservableList<AreaModel> getList() {
        ObservableList<AreaModel> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT height, width FROM data");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                double h = rs.getDouble("height");
                double w = rs.getDouble("width");
                list.add(new AreaModel(h, w));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
