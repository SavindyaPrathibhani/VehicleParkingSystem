package view.tm;

import javafx.scene.control.Button;

public class VehicleTM {
    private String vehicleNumber;
    private String vehicleType;
    private String maxWeight;
    private String noOfPassengers;



    public VehicleTM(String vehicleNumber, String vehicleType, String maxWeight, String noOfPassengers) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.maxWeight = maxWeight;
        this.noOfPassengers = noOfPassengers;

    }

    public VehicleTM() {
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(String noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }



    @Override
    public String toString() {
        return "VehicleTM{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", maxWeight='" + maxWeight + '\'' +
                ", noOfPassengers='" + noOfPassengers + '\'' +
                '}';
    }
}
