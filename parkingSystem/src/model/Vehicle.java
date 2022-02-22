package model;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private String maxWeight;
    private String noOfPassengers;

    private String status;

    public Vehicle(String vehicleNumber, String vehicleType, String maxWeight, String noOfPassengers) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.maxWeight = maxWeight;
        this.noOfPassengers = noOfPassengers;
    }

    public Vehicle(String status) {
        this.status = status;
    }

    public Vehicle() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
