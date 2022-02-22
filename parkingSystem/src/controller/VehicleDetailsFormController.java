package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Vehicle;

import view.tm.VehicleTM;



import static controller.ParkingControllerFormController.vehicleArrayList;

public class VehicleDetailsFormController {



    public TableView<VehicleTM> tblVehicleDetails;
    public TableColumn colVNumber;
    public TableColumn colVType;
    public TableColumn colMWeight;
    public TableColumn colNoOfPassengers;

    public void initialize(){

        colVNumber.setCellValueFactory(new PropertyValueFactory("vehicleNumber"));
        colVType.setCellValueFactory(new PropertyValueFactory("vehicleType"));
        colMWeight.setCellValueFactory(new PropertyValueFactory("maxWeight"));
        colNoOfPassengers.setCellValueFactory(new PropertyValueFactory("noOfPassengers"));
        loadAllVehicles();


    }

    private void loadAllVehicles() {
        ObservableList<VehicleTM> obList = FXCollections.observableArrayList();

        for (Vehicle a: vehicleArrayList
        ) {
            VehicleTM tm = new VehicleTM(a.getVehicleNumber(), a.getVehicleType(), a.getMaxWeight(),a.getNoOfPassengers());
            obList.add(tm);

        }
        tblVehicleDetails.setItems(obList);


    }
}
