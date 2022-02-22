package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import view.tm.DeliverDataTM;
import view.tm.ParkingDataTM;

import java.util.ArrayList;

public class OnDeliveryTableFormController {
    public static ArrayList<Data> outputArrayList2 = ParkingControllerFormController.outputArrayList;

    public TableView tblOnDelivery;
    public TableColumn colVNumber;
    public TableColumn colVType;
    public TableColumn colDName;
    public TableColumn colLeftTime;

    public void initialize() {

        colVNumber.setCellValueFactory(new PropertyValueFactory("vehicleNo"));
        colVType.setCellValueFactory(new PropertyValueFactory("vehicleType"));
        colDName.setCellValueFactory(new PropertyValueFactory("driverName"));
        colLeftTime.setCellValueFactory(new PropertyValueFactory("deliveryTime"));
        loadAllParked();


    }

    private void loadAllParked() {
        ObservableList<DeliverDataTM> outputObservableList = FXCollections.observableArrayList();

        L1:
        for (Data temp : outputArrayList2) {
            if (temp.getParkedOrDelivery() == true) {
                outputObservableList.add(new DeliverDataTM(temp.getVehicleNo(), temp.getVehicleType(), temp.getName(), temp.getTime()));

            } else {
                continue L1;
            }
        }
        tblOnDelivery.setItems(outputObservableList);

        for (DeliverDataTM temp : outputObservableList) {
            System.out.println(temp.getVehicleType());
        }

    }
}
