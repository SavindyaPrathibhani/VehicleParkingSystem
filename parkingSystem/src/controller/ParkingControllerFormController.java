package controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ParkingControllerFormController {

    public AnchorPane ParkingMain;

    public ComboBox cbxSelectVehicle;
    public ComboBox cbxSelectDriver;
    public Label lblVehicleType;
    public Label lblParkingSlot;
    public Label lblDateAndTime;
    public Label lblTime;
    public Button btnManagement;
    public Label lblPSlotName;
    public Button btnParkVehicle;
    public Button btnOnDelivery;
    public AnchorPane anchorPane1;

    int slot;
    String check = null;
    String vd;
    String time;
    static int[] arrayInt= new int[14];
    public static ArrayList<Data> outputArrayList=new ArrayList();

    public static ArrayList<Vehicle> vehicleArrayList=new ArrayList();
    public static ArrayList<Driver> driverArrayList=new ArrayList();

    static {
        vehicleArrayList.add(new Vehicle("NA-3434","Bus","3500","60"));
        vehicleArrayList.add(new Vehicle("KA-4563","Van","1000","7"));
        vehicleArrayList.add(new Vehicle("58-3567","Van","1500","4"));
        vehicleArrayList.add(new Vehicle("GF-4358","Van","800","4"));
        vehicleArrayList.add(new Vehicle("CCB-3568","Van","1800","8"));
        vehicleArrayList.add(new Vehicle("LM-6679","Van","1500","4"));
        vehicleArrayList.add(new Vehicle("QA-3369","Van","1800","6"));
        vehicleArrayList.add(new Vehicle("KB-3668","Cargo Lorry","2500","2"));
        vehicleArrayList.add(new Vehicle("JJ-9878","Cargo Lorry","3000","2"));
        vehicleArrayList.add(new Vehicle("GH-5772","Cargo Lorry","4000","3"));
        vehicleArrayList.add(new Vehicle("XY-4456","Cargo Lorry","3500","2"));
        vehicleArrayList.add(new Vehicle("YQ-3536","Cargo Lorry","2000","2"));
        vehicleArrayList.add(new Vehicle("CBB-3566","Cargo Lorry","2500","2"));
        vehicleArrayList.add(new Vehicle("QH-3444","Cargo Lorry","5000","4"));


        driverArrayList.add(new Driver("Sumith Kumara","7835348345V","B6474845","Panadura","0725637456"));
        driverArrayList.add(new Driver("Amila Pathirana","8826253734V","B3354674","Galle","0717573583"));
        driverArrayList.add(new Driver("Jthmal Perera","9283289272V","B3674589","Horana","0772452457"));
        driverArrayList.add(new Driver("Sumith Dissanayaka","9425245373V","B8366399","Kaluthara","0782686390"));
        driverArrayList.add(new Driver("Sumanasiri Herath","8976544373V","B3537538","Beruwala","0772686390"));
        driverArrayList.add(new Driver("Charith Sudara","9573536833V","B6835836","Baththaramulla","0771536662"));
        driverArrayList.add(new Driver("Prashan Dineth ","9362426738V","B2683536","Wadduwa","0715353434"));
        driverArrayList.add(new Driver("Chethiya Dilan ","9162353436V","B6836836","Panadura","0772436737"));
        driverArrayList.add(new Driver("Dushantha Perera ","9255556343V","B3334435","Matara","0777245343"));
        driverArrayList.add(new Driver("Dinesh Udara  ","9026344373V","B5343783","Hettimulla","0713456878"));
        driverArrayList.add(new Driver("Udana Chathuranga ","9692653338V ","B7888632","Kottawa","0772442444"));
        driverArrayList.add(new Driver("Mohommad Riaz","9124537733V ","B3638537 ","Kaluthara","0777544222"));
        driverArrayList.add(new Driver("Sandun Kumara ","9563524267V ","B2263333 ","Panadura","0772325544"));
        driverArrayList.add(new Driver("Priyanga Perera  ","9135343537V  ","B3853753  ","Matara ","0723344562"));

    }

    public void btnParkOnAction(ActionEvent actionEvent) {
        for (Vehicle v:vehicleArrayList) {
            if(check==v.getVehicleNumber()){
                v.setStatus("parked");
               System.out.println(v.getStatus());
            }
        }

        checkSlot();

        time=lblDateAndTime.getText()+lblTime.getText();
        L1: for (Data o:outputArrayList) {
            if(cbxSelectVehicle.getValue()==o.getVehicleNo()){
                outputArrayList.remove(o);
                break L1;
            }
        }
        outputArrayList.add(new Data((String)cbxSelectVehicle.getValue(),(String) lblVehicleType.getText(),(String)cbxSelectDriver.getValue(),(String) lblParkingSlot.getText(),time,false));
        System.out.println(lblVehicleType.getText());
        autoRunAnchor();
    }

    public void btnDeliveryOnAction(ActionEvent actionEvent) {
        if(lblParkingSlot.getText().equals("")){
            new Alert(Alert.AlertType.ERROR, "The vehicle is not at park", ButtonType.CLOSE).show();
        }else {
            time = lblDateAndTime.getText() + lblTime.getText();
            if (cbxSelectDriver.getValue() != null) {
                for (Vehicle v : vehicleArrayList) {
                    if (check == v.getVehicleNumber()) {
                        v.setStatus("delivery");
                        System.out.println(v.getStatus());
                    }
                }

                L1:
                for (Data o : outputArrayList) {
                    if (cbxSelectVehicle.getValue() == o.getVehicleNo()) {
                        outputArrayList.remove(o);
                        break L1;
                    }
                }

                outputArrayList.add(new Data((String) cbxSelectVehicle.getValue(), (String) lblVehicleType.getText(), (String) cbxSelectDriver.getValue(), lblParkingSlot.getText(), time, true));
                System.out.println(lblVehicleType.getText());
            } else {
                new Alert(Alert.AlertType.ERROR, "Select Your name", ButtonType.CLOSE).show();
                return;
            }


            autoRunAnchor();
        }
    }

    public void btnManagementOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Log In");

        stage.show();



    }
    public void initialize() {
        {
           Thread clock=new Thread(){
               public void run(){
                  try {
                      while (true) {
                            SimpleDateFormat formatter1 = new SimpleDateFormat("   dd/MM/yyyy  ");
                            SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm a");
                            Date date = new Date();

                            Platform.runLater(() -> {
                                lblDateAndTime.setText(formatter1.format(date));
                                lblTime.setText(formatter2.format(date));
                            });
                        sleep(1000);
                      }
                   } catch (InterruptedException e) {
                     e.printStackTrace();
                   }
              }
           };
          clock.start();

       }
       autoRunAnchor();

    }

    public void autoRunAnchor() {

        ObservableList<String> obList1= FXCollections.observableArrayList();
        for (Vehicle temp:vehicleArrayList) {

            obList1.add(temp.getVehicleNumber());
        }
        cbxSelectVehicle.setItems(obList1);

        ObservableList<String> obList2= FXCollections.observableArrayList();
        for (Driver temp:driverArrayList) {
            obList2.add(temp.getName());
        }
        cbxSelectDriver.setItems(obList2);

        cbxSelectVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            check = (String) cbxSelectVehicle.getSelectionModel().getSelectedItem();
            for (Vehicle temp : vehicleArrayList) {
                if (newValue == temp.getVehicleNumber()) {
                    lblVehicleType.setText(temp.getVehicleType());



                    if(temp.getStatus()=="delivery"){
                        lblPSlotName.setVisible(false);
                        lblParkingSlot.setVisible(false);
                        checkSlot2();
                        btnParkVehicle.setDisable(false);
                        btnOnDelivery.setDisable(true);
                        L1:for (Data output:outputArrayList) {
                            if(temp.getVehicleNumber()==output.getVehicleNo()){
                                cbxSelectDriver.setValue(output.getName());

                                break L1;
                            }else{
                                continue L1;
                            }
                        }
                    }else if(temp.getStatus()=="parked"){

                        L1:for (Data output:outputArrayList) {
                            if(temp.getVehicleNumber()==output.getVehicleNo()){
                                cbxSelectDriver.setValue(output.getName());
                                lblParkingSlot.setText(output.getSlotNo());
                                break L1;
                            }else{
                                continue L1;
                            }
                        }

                        btnOnDelivery.setDisable(false);
                        btnParkVehicle.setDisable(true);
                        lblPSlotName.setVisible(true);
                        lblParkingSlot.setVisible(true);
                    }else{
                        btnOnDelivery.setDisable(false);
                        btnParkVehicle.setDisable(false);
                        lblParkingSlot.setText("");
                        lblPSlotName.setDisable(false);
                    }


                }


            }
        });
    }

    public void checkSlot2() {

       String no = lblParkingSlot.getText().toString();
       int number = Integer.parseInt(no);
       if(number==1){
           arrayInt[0]=0;
       }else if(number==2){
           arrayInt[1]=0;
       }else if(number==3){
           arrayInt[2]=0;
       }else if(number==4){
           arrayInt[3]=0;
       }else if(number==5){
           arrayInt[4]=0;
       }else if(number==6){
           arrayInt[5]=0;
       }else if(number==7){
           arrayInt[6]=0;
       }else if(number==8){
           arrayInt[7]=0;
       }else if(number==9){
           arrayInt[8]=0;
       }else if(number==10){
           arrayInt[9]=0;
       }else if(number==11){
           arrayInt[10]=0;
       }else if(number==12){
           arrayInt[11]=0;
       }else if(number==13){
           arrayInt[12]=0;
       }else if(number==14){
           arrayInt[13]=0;
       }else{
           btnOnDelivery.setDisable(false);
       }
    }

    public void checkSlot(){
        if(lblVehicleType.getText()=="Van"){
            if(arrayInt[0]==0){
                lblParkingSlot.setText(1+"");
                arrayInt[0]=1;
            }else if(arrayInt[1]==0){
                lblParkingSlot.setText(2+"");
                arrayInt[1]=2;
            }else if(arrayInt[2]==0){
                lblParkingSlot.setText(3+"");
                arrayInt[2]=3;
            }else if(arrayInt[3]==0){
                lblParkingSlot.setText(4+"");
                arrayInt[3]=4;
            }else if (arrayInt[11]==0){
                lblParkingSlot.setText(12+"");
                arrayInt[11]=12;
            }else if (arrayInt[12]==0){
                lblParkingSlot.setText(13+"");
                arrayInt[12]=13;
            }
        }else if(lblVehicleType.getText().equals("Cargo Lorry")){
            if(arrayInt[4]==0){
                lblParkingSlot.setText(5+"");
                arrayInt[4]=5;
            }else if(arrayInt[5]==0){
                lblParkingSlot.setText(6+"");
                arrayInt[5]=6;
            }else if(arrayInt[6]==0){
                lblParkingSlot.setText(7+"");
                arrayInt[6]=7;
            }else if(arrayInt[7]==0){
                lblParkingSlot.setText(8+"");
                arrayInt[7]=8;
            }else if(arrayInt[8]==0){
                lblParkingSlot.setText(9+"");
                arrayInt[8]=9;
            }else if(arrayInt[9]==0){
                lblParkingSlot.setText(10+"");
                arrayInt[9]=10;
            }else if(arrayInt[10]==0){
                lblParkingSlot.setText(11+"");
                arrayInt[10]=11;
            }
        }else if(lblVehicleType.getText()=="Bus"){
            if(arrayInt[13]==0){
                lblParkingSlot.setText(14+"");
                arrayInt[13]=14;
            }
        }else{
            lblParkingSlot.setText("");
        }



    }



   public void btnRefreshOnAction(ActionEvent actionEvent) {
        ObservableList<String> obList1= FXCollections.observableArrayList();
        for (Vehicle temp:vehicleArrayList) {

            obList1.add(temp.getVehicleNumber());
        }
        cbxSelectVehicle.setItems(obList1);

        ObservableList<String> obList2= FXCollections.observableArrayList();
        for (Driver temp:driverArrayList) {
            obList2.add(temp.getName());
        }
        cbxSelectDriver.setItems(obList2);
    }


}
