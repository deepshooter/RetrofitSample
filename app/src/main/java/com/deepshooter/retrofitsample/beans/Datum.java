
package com.deepshooter.retrofitsample.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("modificationDate")
    @Expose
    private String modificationDate;
    @SerializedName("deliveryServiceVisitorUserTraceId")
    @Expose
    private String deliveryServiceVisitorUserTraceId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("deliveryServiceCompRelId")
    @Expose
    private String deliveryServiceCompRelId;
    @SerializedName("deliveryStaffId")
    @Expose
    private Object deliveryStaffId;
    @SerializedName("numberOfDaysAllowed")
    @Expose
    private Object numberOfDaysAllowed;
    @SerializedName("otp")
    @Expose
    private Object otp;
    @SerializedName("otpExpiryTime")
    @Expose
    private Object otpExpiryTime;
    @SerializedName("specifiedTimeRange")
    @Expose
    private Object specifiedTimeRange;
    @SerializedName("allowTimeIn")
    @Expose
    private String allowTimeIn;
    @SerializedName("allowTimeInTime")
    @Expose
    private String allowTimeInTime;
    @SerializedName("allowTimeOut")
    @Expose
    private String allowTimeOut;
    @SerializedName("residentMessage")
    @Expose
    private String residentMessage;
    @SerializedName("actualCheckIn")
    @Expose
    private Object actualCheckIn;
    @SerializedName("actualCheckOut")
    @Expose
    private Object actualCheckOut;
    @SerializedName("deliveryServicestatus")
    @Expose
    private Integer deliveryServicestatus;
    @SerializedName("securityMessage")
    @Expose
    private Object securityMessage;
    @SerializedName("associationId")
    @Expose
    private String associationId;
    @SerializedName("residentName")
    @Expose
    private String residentName;
    @SerializedName("deliveryCompanyName")
    @Expose
    private String deliveryCompanyName;
    @SerializedName("deliveryStaffName")
    @Expose
    private Object deliveryStaffName;
    @SerializedName("deliveryStaffPhone")
    @Expose
    private String deliveryStaffPhone;
    @SerializedName("deliveryCompany")
    @Expose
    private Object deliveryCompany;
    @SerializedName("deliveryStaff")
    @Expose
    private Object deliveryStaff;
    @SerializedName("resident")
    @Expose
    private Object resident;
    @SerializedName("unitNo")
    @Expose
    private String unitNo;
    @SerializedName("residentPhone")
    @Expose
    private String residentPhone;

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getDeliveryServiceVisitorUserTraceId() {
        return deliveryServiceVisitorUserTraceId;
    }

    public void setDeliveryServiceVisitorUserTraceId(String deliveryServiceVisitorUserTraceId) {
        this.deliveryServiceVisitorUserTraceId = deliveryServiceVisitorUserTraceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeliveryServiceCompRelId() {
        return deliveryServiceCompRelId;
    }

    public void setDeliveryServiceCompRelId(String deliveryServiceCompRelId) {
        this.deliveryServiceCompRelId = deliveryServiceCompRelId;
    }

    public Object getDeliveryStaffId() {
        return deliveryStaffId;
    }

    public void setDeliveryStaffId(Object deliveryStaffId) {
        this.deliveryStaffId = deliveryStaffId;
    }

    public Object getNumberOfDaysAllowed() {
        return numberOfDaysAllowed;
    }

    public void setNumberOfDaysAllowed(Object numberOfDaysAllowed) {
        this.numberOfDaysAllowed = numberOfDaysAllowed;
    }

    public Object getOtp() {
        return otp;
    }

    public void setOtp(Object otp) {
        this.otp = otp;
    }

    public Object getOtpExpiryTime() {
        return otpExpiryTime;
    }

    public void setOtpExpiryTime(Object otpExpiryTime) {
        this.otpExpiryTime = otpExpiryTime;
    }

    public Object getSpecifiedTimeRange() {
        return specifiedTimeRange;
    }

    public void setSpecifiedTimeRange(Object specifiedTimeRange) {
        this.specifiedTimeRange = specifiedTimeRange;
    }

    public String getAllowTimeIn() {
        return allowTimeIn;
    }

    public void setAllowTimeIn(String allowTimeIn) {
        this.allowTimeIn = allowTimeIn;
    }

    public String getAllowTimeInTime() {
        return allowTimeInTime;
    }

    public void setAllowTimeInTime(String allowTimeInTime) {
        this.allowTimeInTime = allowTimeInTime;
    }

    public String getAllowTimeOut() {
        return allowTimeOut;
    }

    public void setAllowTimeOut(String allowTimeOut) {
        this.allowTimeOut = allowTimeOut;
    }

    public String getResidentMessage() {
        return residentMessage;
    }

    public void setResidentMessage(String residentMessage) {
        this.residentMessage = residentMessage;
    }

    public Object getActualCheckIn() {
        return actualCheckIn;
    }

    public void setActualCheckIn(Object actualCheckIn) {
        this.actualCheckIn = actualCheckIn;
    }

    public Object getActualCheckOut() {
        return actualCheckOut;
    }

    public void setActualCheckOut(Object actualCheckOut) {
        this.actualCheckOut = actualCheckOut;
    }

    public Integer getDeliveryServicestatus() {
        return deliveryServicestatus;
    }

    public void setDeliveryServicestatus(Integer deliveryServicestatus) {
        this.deliveryServicestatus = deliveryServicestatus;
    }

    public Object getSecurityMessage() {
        return securityMessage;
    }

    public void setSecurityMessage(Object securityMessage) {
        this.securityMessage = securityMessage;
    }

    public String getAssociationId() {
        return associationId;
    }

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public Object getDeliveryStaffName() {
        return deliveryStaffName;
    }

    public void setDeliveryStaffName(Object deliveryStaffName) {
        this.deliveryStaffName = deliveryStaffName;
    }

    public String getDeliveryStaffPhone() {
        return deliveryStaffPhone;
    }

    public void setDeliveryStaffPhone(String deliveryStaffPhone) {
        this.deliveryStaffPhone = deliveryStaffPhone;
    }

    public Object getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(Object deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public Object getDeliveryStaff() {
        return deliveryStaff;
    }

    public void setDeliveryStaff(Object deliveryStaff) {
        this.deliveryStaff = deliveryStaff;
    }

    public Object getResident() {
        return resident;
    }

    public void setResident(Object resident) {
        this.resident = resident;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getResidentPhone() {
        return residentPhone;
    }

    public void setResidentPhone(String residentPhone) {
        this.residentPhone = residentPhone;
    }

}
