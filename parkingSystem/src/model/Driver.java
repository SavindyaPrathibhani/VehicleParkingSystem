package model;

public class Driver {
    private String name;
    private String NIC;
    private String drivingLicenseNo;
    private String address;
    private String contact;

    public Driver(String name, String NIC, String drivingLicenseNo, String address, String contact) {
        this.name = name;
        this.NIC = NIC;
        this.drivingLicenseNo = drivingLicenseNo;
        this.address = address;
        this.contact = contact;
    }

    public Driver() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", NIC='" + NIC + '\'' +
                ", drivingLicenseNo='" + drivingLicenseNo + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
