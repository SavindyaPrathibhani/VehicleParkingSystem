package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManagementFormController implements Initializable {

    public ComboBox cbxSelectTable;
    public AnchorPane anchorPane1;

    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list = FXCollections.observableArrayList("In Parking", "On Delivery");
        cbxSelectTable.setItems(list);

    }

    public void btnAddVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehiclesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Vehicle");
        stage.show();
    }

    public void btnAddDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Driver");
        stage.show();
    }



    public void cbxOnAction(ActionEvent actionEvent) throws IOException {
        String selectedTable = cbxSelectTable.getSelectionModel().getSelectedItem().toString();

        if(selectedTable.equals("In Parking")){
            Parent load= FXMLLoader.load(getClass().getResource("/View/InParkingTableForm.fxml"));
            anchorPane1.getChildren().add(load);

        }else if(selectedTable.equals("On Delivery")){
            Parent load= FXMLLoader.load(getClass().getResource("/View/OnDeliveryTableForm.fxml"));
            anchorPane1.getChildren().add(load);

        }
    }

    public void goHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ParkingControllerForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Parking System");
        stage.show();

    }

    public void vehicleDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/VehicleDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Vehicle Details");
        stage.show();
    }

    public void driverDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DriverDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Driver Details");
        stage.show();
    }
}
