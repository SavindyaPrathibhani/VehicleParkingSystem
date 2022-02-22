package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import model.Driver;
import view.tm.DriverTM;

import java.lang.reflect.Type;

import static controller.ParkingControllerFormController.driverArrayList;

public class AddDriverFormController {

    public TextField txtDName;
    public TextField txtDNic;
    public TextField txtDLicenseNo;
    public TextField txtAddress;
    public TextField txtContactNo;
    public Button btnAddDriver;


    public void addDriverOnAction(ActionEvent actionEvent) {
        if(txtDName.getText().equals("") || txtDNic.getText().equals("") || txtDLicenseNo.getText().equals("") || txtAddress.getText().equals("") || txtContactNo.getText().equals("")) {
            new Alert(Alert.AlertType.WARNING, "Please fill all data Correctly", ButtonType.CLOSE).show();
        }else{
            Driver driver = new Driver(txtDName.getText(), txtDNic.getText().toString(), txtDLicenseNo.getText(), txtAddress.getText(),txtContactNo.getText());
            System.out.println(txtDName.getText());
            txtDName.clear();
            txtDNic.clear();
            txtDLicenseNo.clear();
            txtAddress.clear();
            txtContactNo.clear();
            driverArrayList.add(driver);
            loadAllDrivers();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();

        }
    }
    public void loadAllDrivers(){
        ObservableList<DriverTM> driverTM= FXCollections.observableArrayList();
        for (Driver temp:driverArrayList) {

            driverTM.add(new DriverTM(temp.getName(),temp.getNIC(),temp.getDrivingLicenseNo(),temp.getAddress(),temp.getContact()));

        }


    }
}
