package view.tm;

public class ParkingDataTM {
     private String vehicleNo;
     private String vehicleType;
     private String parkingSlot;
     private String parkingTime;

    public ParkingDataTM(String vehicleNo, String vehicleType, String parkingSlot, String parkingTime) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
        this.parkingTime = parkingTime;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(String parkingTime) {
        this.parkingTime = parkingTime;
    }

    @Override
    public String toString() {
        return "ParkingDataTM{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", parkingSlot='" + parkingSlot + '\'' +
                ", parkingTime='" + parkingTime + '\'' +
                '}';
    }
}
