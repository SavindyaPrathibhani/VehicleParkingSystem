package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import view.tm.ParkingDataTM;

import java.util.ArrayList;

public class InParkingTableFormController {
    public static ArrayList<Data> outputArrayList2 = ParkingControllerFormController.outputArrayList;

    public TableView tblInParking;
    public TableColumn colVNumber;
    public TableColumn colVType;
    public TableColumn colPSlot;
    public TableColumn colPTime;

    public void initialize(){

                colVNumber.setCellValueFactory(new PropertyValueFactory("vehicleNo"));
                colVType.setCellValueFactory(new PropertyValueFactory("vehicleType"));
                colPSlot.setCellValueFactory(new PropertyValueFactory("parkingSlot"));
                colPTime.setCellValueFactory(new PropertyValueFactory("parkingTime"));
                loadAllParked();


            }

            private void loadAllParked() {
                ObservableList<ParkingDataTM> outputObservableList = FXCollections.observableArrayList();

                L1:  for (Data temp : outputArrayList2) {
                    if(temp.getParkedOrDelivery()==false){
                outputObservableList.add(new ParkingDataTM(temp.getVehicleNo(),temp.getVehicleType(),temp.getSlotNo(),temp.getTime()));

            }else{
                continue L1;
            }
        }
        tblInParking.setItems(outputObservableList);

        for (ParkingDataTM temp:outputObservableList) {
            System.out.println(temp.getVehicleType());
        }

    }
}
