package controller;

import model.Vehicle;

public class Data  {
    private String vehicleNo;
    private String vehicleType;
    private String name;
    private String slotNo;
    private String time;
    private Boolean parkedOrDelivery = false;

    public Data(String vehicleNo, String vehicleType, String name, String slotNo, String time, Boolean parkedOrDelivery) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.name = name;
        this.slotNo = slotNo;
        this.time = time;
        this.parkedOrDelivery = parkedOrDelivery;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(String slotNo) {
        this.slotNo = slotNo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getParkedOrDelivery() {
        return parkedOrDelivery;
    }

    public void setParkedOrDelivery(Boolean parkedOrDelivery) {
        this.parkedOrDelivery = parkedOrDelivery;
    }

    @Override
    public String toString() {
        return "Data{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", name='" + name + '\'' +
                ", slotNo='" + slotNo + '\'' +
                ", time='" + time + '\'' +
                ", parkedOrDelivery=" + parkedOrDelivery +
                '}';
    }
}
