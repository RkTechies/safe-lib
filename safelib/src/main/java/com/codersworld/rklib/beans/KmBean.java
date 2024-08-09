package com.codersworld.rklib.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class KmBean implements Serializable {


    @SerializedName("lat")
    private String strkmlat;
    @SerializedName("lng")
    private String strkmlng;
    @SerializedName("tme")
    private String strkmtime;
    @SerializedName("speed")
    private String strkmspeed;
    @SerializedName("address")
    private String strkmaddress;
    @SerializedName("idletime")
    private String strkmidletime;
    @SerializedName("accstatus")
    private String strkmaccstatus;
    @SerializedName("destination")
    private String strkmdestination;
    @SerializedName("distance")
    private String strkmdistance;

    @SerializedName("vehiclenumber")
    private String strkmvehiclenumber;
    @SerializedName("PhoneNo")
    private String strkmphoneNo;
    @SerializedName("Status")
    private String strstatus;
    @SerializedName("DriverName")
    private String strkmdrivername;
    @SerializedName("DistanceSinceMorning")
    private String strkmDistanceSinceMorning;

    @SerializedName("Val1")
    private String strkmVal1;
    @SerializedName("Val2")
    private String strkmVal2;
    @SerializedName("Val3")
    private String strkmVal3;
    @SerializedName("Val4")
    private String strkmVal4;



    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("tme")
    @Expose
    private String tme;
    @SerializedName("speed")
    @Expose
    private String speed;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("idletime")
    @Expose
    private String idletime;
    @SerializedName("accstatus")
    @Expose
    private String accstatus;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("distance")
    @Expose
    private Object distance;
    @SerializedName("vehiclenumber")
    @Expose
    private String vehiclenumber;
    @SerializedName("PhoneNo")
    @Expose
    private String phoneNo;
    @SerializedName("DriverName")
    @Expose
    private String driverName;
    @SerializedName("DistanceSinceMorning")
    @Expose
    private String distanceSinceMorning;
    @SerializedName("Val1")
    @Expose
    private String val1;
    @SerializedName("Val2")
    @Expose
    private String val2;
    @SerializedName("Val3")
    @Expose
    private String val3;
    @SerializedName("Val4")
    @Expose
    private String val4;
    @SerializedName("PhoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("VehicleType")
    @Expose
    private String vehicleType;
    @SerializedName("PowerCutTime")
    @Expose
    private String powerCutTime;
    @SerializedName("VoltageLevel")
    @Expose
    private String voltageLevel;
    @SerializedName("GSMSignal")
    @Expose
    private String gSMSignal;
    @SerializedName("LockType")
    @Expose
    private String lockType;
    @SerializedName("GateOpenTime")
    @Expose
    private String gateOpenTime;
    @SerializedName("GateClosedTime")
    @Expose
    private String gateClosedTime;
    @SerializedName("LockOpenTime")
    @Expose
    private String lockOpenTime;
    @SerializedName("LockClosedTime")
    @Expose
    private String lockClosedTime;
    @SerializedName("InstallDate")
    @Expose
    private String installDate;
    @SerializedName("Origin")
    @Expose
    private String origin;
    @SerializedName("VendorName")
    @Expose
    private String vendorName;
    @SerializedName("CompanyName")
    @Expose
    private String companyName;
    @SerializedName("NFCLockNumber")
    @Expose
    private String nFCLockNumber;
    @SerializedName("PadLockNumber")
    @Expose
    private String padLockNumber;
    @SerializedName("PhoneType")
    @Expose
    private String phoneType;
    @SerializedName("LockStatus")
    @Expose
    private String lockStatus;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getTme() {
        return tme;
    }

    public void setTme(String tme) {
        this.tme = tme;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdletime() {
        return idletime;
    }

    public void setIdletime(String idletime) {
        this.idletime = idletime;
    }

    public String getAccstatus() {
        return accstatus;
    }

    public void setAccstatus(String accstatus) {
        this.accstatus = accstatus;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Object getDistance() {
        return distance;
    }

    public void setDistance(Object distance) {
        this.distance = distance;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDistanceSinceMorning() {
        return distanceSinceMorning;
    }

    public void setDistanceSinceMorning(String distanceSinceMorning) {
        this.distanceSinceMorning = distanceSinceMorning;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public String getVal3() {
        return val3;
    }

    public void setVal3(String val3) {
        this.val3 = val3;
    }

    public String getVal4() {
        return val4;
    }

    public void setVal4(String val4) {
        this.val4 = val4;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPowerCutTime() {
        return powerCutTime;
    }

    public void setPowerCutTime(String powerCutTime) {
        this.powerCutTime = powerCutTime;
    }

    public String getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(String voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public String getgSMSignal() {
        return gSMSignal;
    }

    public void setgSMSignal(String gSMSignal) {
        this.gSMSignal = gSMSignal;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public String getGateOpenTime() {
        return gateOpenTime;
    }

    public void setGateOpenTime(String gateOpenTime) {
        this.gateOpenTime = gateOpenTime;
    }

    public String getGateClosedTime() {
        return gateClosedTime;
    }

    public void setGateClosedTime(String gateClosedTime) {
        this.gateClosedTime = gateClosedTime;
    }

    public String getLockOpenTime() {
        return lockOpenTime;
    }

    public void setLockOpenTime(String lockOpenTime) {
        this.lockOpenTime = lockOpenTime;
    }

    public String getLockClosedTime() {
        return lockClosedTime;
    }

    public void setLockClosedTime(String lockClosedTime) {
        this.lockClosedTime = lockClosedTime;
    }

    public String getInstallDate() {
        return installDate;
    }

    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getnFCLockNumber() {
        return nFCLockNumber;
    }

    public void setnFCLockNumber(String nFCLockNumber) {
        this.nFCLockNumber = nFCLockNumber;
    }

    public String getPadLockNumber() {
        return padLockNumber;
    }

    public void setPadLockNumber(String padLockNumber) {
        this.padLockNumber = padLockNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getStrkmlat() {
        return strkmlat;
    }

    public void setStrkmlat(String strkmlat) {
        this.strkmlat = strkmlat;
    }

    public String getStrkmlng() {
        return strkmlng;
    }

    public void setStrkmlng(String strkmlng) {
        this.strkmlng = strkmlng;
    }

    public String getStrkmtime() {
        return strkmtime;
    }

    public void setStrkmtime(String strkmtime) {
        this.strkmtime = strkmtime;
    }

    public String getStrkmspeed() {
        return strkmspeed;
    }

    public void setStrkmspeed(String strkmspeed) {
        this.strkmspeed = strkmspeed;
    }

    public String getStrkmaddress() {
        return strkmaddress;
    }

    public void setStrkmaddress(String strkmaddress) {
        this.strkmaddress = strkmaddress;
    }

    public String getStrkmidletime() {
        return strkmidletime;
    }

    public void setStrkmidletime(String strkmidletime) {
        this.strkmidletime = strkmidletime;
    }

    public String getStrkmaccstatus() {
        return strkmaccstatus;
    }

    public void setStrkmaccstatus(String strkmaccstatus) {
        this.strkmaccstatus = strkmaccstatus;
    }

    public String getStrkmdestination() {
        return strkmdestination;
    }

    public void setStrkmdestination(String strkmdestination) {
        this.strkmdestination = strkmdestination;
    }

    public String getStrkmdistance() {
        return strkmdistance;
    }

    public void setStrkmdistance(String strkmdistance) {
        this.strkmdistance = strkmdistance;
    }

    public String getStrkmvehiclenumber() {
        return strkmvehiclenumber;
    }

    public void setStrkmvehiclenumber(String strkmvehiclenumber) {
        this.strkmvehiclenumber = strkmvehiclenumber;
    }

    public String getStrkmphoneNo() {
        return strkmphoneNo;
    }

    public void setStrkmphoneNo(String strkmphoneNo) {
        this.strkmphoneNo = strkmphoneNo;
    }

    public String getStrstatus() {
        return strstatus;
    }

    public void setStrstatus(String strstatus) {
        this.strstatus = strstatus;
    }

    public String getStrkmdrivername() {
        return strkmdrivername;
    }

    public void setStrkmdrivername(String strkmdrivername) {
        this.strkmdrivername = strkmdrivername;
    }



    public String getStrkmVal1() {
        return strkmVal1;
    }

    public void setStrkmVal1(String strkmVal1) {
        this.strkmVal1 = strkmVal1;
    }

    public String getStrkmVal2() {
        return strkmVal2;
    }

    public void setStrkmVal2(String strkmVal2) {
        this.strkmVal2 = strkmVal2;
    }

    public String getStrkmVal3() {
        return strkmVal3;
    }

    public void setStrkmVal3(String strkmVal3) {
        this.strkmVal3 = strkmVal3;
    }

    public String getStrkmVal4() {
        return strkmVal4;
    }

    public void setStrkmVal4(String strkmVal4) {
        this.strkmVal4 = strkmVal4;
    }


    public String getStrkmDistanceSinceMorning() {
        return strkmDistanceSinceMorning;
    }

    public void setStrkmDistanceSinceMorning(String strkmDistanceSinceMorning) {
        this.strkmDistanceSinceMorning = strkmDistanceSinceMorning;
    }
}
