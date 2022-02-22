package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import model.Driver;
import model.Vehicle;
import view.tm.DriverTM;
import view.tm.VehicleTM;

import static controller.ParkingControllerFormController.vehicleArrayList;

public class AddVehiclesFormController {
    public TextField txtVNumber;
    public ComboBox cbxVType;
    public TextField txtMWeight;
    public TextField txtNoOfPassengers;
    public Button btnAddVehicle;

    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("Van", "Bus","Cargo Lorry");
        cbxVType.setItems(list);

    }

    public void addVehicleOnAction(ActionEvent actionEvent) {
        if(txtVNumber.getText().equals("") || cbxVType.getValue().toString().equals("") || txtMWeight.getText().equals("") || txtNoOfPassengers.getText().equals("") ) {
            new Alert(Alert.AlertType.WARNING, "Please fill all data Correctly", ButtonType.CLOSE).show();
        }else{
            Vehicle vehicle = new Vehicle(txtVNumber.getText(), cbxVType.getValue().toString(), txtMWeight.getText(), txtNoOfPassengers.getText());
            System.out.println(cbxVType.getValue());
            txtVNumber.clear();
            txtMWeight.clear();
            txtNoOfPassengers.clear();
            vehicleArrayList.add(vehicle);

            loadAllVehicles();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();

        }
    }
    public void loadAllVehicles(){
        ObservableList<VehicleTM> vehicleTM= FXCollections.observableArrayList();
        for (Vehicle temp:vehicleArrayList) {

            vehicleTM.add(new VehicleTM(temp.getVehicleNumber(),temp.getVehicleType(),temp.getMaxWeight(),temp.getNoOfPassengers()));

        }

    }
}
