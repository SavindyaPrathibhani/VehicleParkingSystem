package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Driver;

import view.tm.DriverTM;


import static controller.ParkingControllerFormController.driverArrayList;


public class DriverDetailsFormController {
    public TableView tblDriverDetails;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colLicenseNo;
    public TableColumn colAddress;
    public TableColumn colContactNo;

    public void initialize(){

        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colNic.setCellValueFactory(new PropertyValueFactory("NIC"));
        colLicenseNo.setCellValueFactory(new PropertyValueFactory("drivingLicenseNo"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colContactNo.setCellValueFactory(new PropertyValueFactory("contact"));
        loadAllDrivers();


    }

    private void loadAllDrivers() {
        ObservableList<DriverTM> obList = FXCollections.observableArrayList();

        for (Driver a: driverArrayList
        ) {
          DriverTM tm = new DriverTM(a.getName(), a.getNIC(), a.getDrivingLicenseNo(),a.getAddress(),a.getContact());
            obList.add(tm);

        }
        tblDriverDetails.setItems(obList);


    }
}
