package view.tm;

public class DeliverDataTM {
    private String vehicleNo;
    private String vehicleType;
    private String driverName;
    private String deliveryTime;

    public DeliverDataTM(String vehicleNo, String vehicleType, String driverName, String deliveryTime) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.deliveryTime = deliveryTime;
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "DeliverDataTM{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", driverName='" + driverName + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                '}';
    }
}
