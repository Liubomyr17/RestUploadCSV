package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "orderNumber")
    private String orderNumber;

    @Column(name = "orderDate")
    private String orderDate;

    @Column(name = "clientEmail")
    private String clientEmail;

    @Column(name = "clientCompany")
    private String clientCompany;

    @Column(name = "clientPhone")
    private String clientPhone;

    @Column(name = "clientZip")
    private String clientZip;

    @Column(name = "clientOrderDescription")
    private String clientOrderDescription;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "weight")
    private double weight;

    @Column(name = "unitWeight")
    private double unitWeight;

    @Column(name = "deliveryType")
    private String deliveryType;

    @Column(name = "recipient")
    private String recipient;

    @Column(name = "deliveryAddress")
    private String deliveryAddress;

    @Column(name = "clientId")
    private String clientId;

    @Column(name = "deliveryCity")
    private String deliveryCity;

    @Column(name = "deliveryState")
    private String deliveryState;

    @Column(name = "deliveryZip")
    private int deliveryZip;

    @Column(name = "deliveryCountry")
    private String deliveryCountry;

    @Column(name = "deliveryPhone")
    private String deliveryPhone;

    @Column(name = "zeroIndex1")
    private int zeroIndex1;

    @Column(name = "zeroIndex2")
    private int zeroIndex2;

    @Column(name = "senderWarehouse")
    private String senderWarehouse;

    @Column(name = "packages")
    private int packages;

    @Column(name = "totalSize")
    private double totalSize;

    @Column(name = "unitSize")
    private double unitSize;


    public Customer() {
    }


    public Customer(long id, String orderNumber, String orderDate, String clientEmail,
                    String clientCompany, String clientPhone, String clientZip,
                    String clientOrderDescription, int quantity, double weight,
                    double unitWeight, String deliveryType, String recipient,
                    String deliveryAddress, String clientId, String deliveryCity,
                    String deliveryState, int deliveryZip, String deliveryCountry,
                    String deliveryPhone, int zeroIndex1, int zeroIndex2,
                    String senderWarehouse, int packages, double totalSize,
                    double unitSize) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.clientEmail = clientEmail;
        this.clientCompany = clientCompany;
        this.clientPhone = clientPhone;
        this.clientZip = clientZip;
        this.clientOrderDescription = clientOrderDescription;
        this.quantity = quantity;
        this.weight = weight;
        this.unitWeight = unitWeight;
        this.deliveryType = deliveryType;
        this.recipient = recipient;
        this.deliveryAddress = deliveryAddress;
        this.clientId = clientId;
        this.deliveryCity = deliveryCity;
        this.deliveryState = deliveryState;
        this.deliveryZip = deliveryZip;
        this.deliveryCountry = deliveryCountry;
        this.deliveryPhone = deliveryPhone;
        this.zeroIndex1 = zeroIndex1;
        this.zeroIndex2 = zeroIndex2;
        this.senderWarehouse = senderWarehouse;
        this.packages = packages;
        this.totalSize = totalSize;
        this.unitSize = unitSize;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(String clientCompany) {
        this.clientCompany = clientCompany;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientZip() {
        return clientZip;
    }

    public void setClientZip(String clientZip) {
        this.clientZip = clientZip;
    }

    public String getClientOrderDescription() {
        return clientOrderDescription;
    }

    public void setClientOrderDescription(String clientOrderDescription) {
        this.clientOrderDescription = clientOrderDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public int getDeliveryZip() {
        return deliveryZip;
    }

    public void setDeliveryZip(int deliveryZip) {
        this.deliveryZip = deliveryZip;
    }

    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    public int getZeroIndex1() {
        return zeroIndex1;
    }

    public void setZeroIndex1(int zeroIndex1) {
        this.zeroIndex1 = zeroIndex1;
    }

    public int getZeroIndex2() {
        return zeroIndex2;
    }

    public void setZeroIndex2(int zeroIndex2) {
        this.zeroIndex2 = zeroIndex2;
    }

    public String getSenderWarehouse() {
        return senderWarehouse;
    }

    public void setSenderWarehouse(String senderWarehouse) {
        this.senderWarehouse = senderWarehouse;
    }

    public int getPackages() {
        return packages;
    }

    public void setPackages(int packages) {
        this.packages = packages;
    }

    public double getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(double totalSize) {
        this.totalSize = totalSize;
    }

    public double getUnitSize() {
        return unitSize;
    }

    public void setUnitSize(double unitSize) {
        this.unitSize = unitSize;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientCompany='" + clientCompany + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientZip='" + clientZip + '\'' +
                ", clientOrderDescription='" + clientOrderDescription + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", unitWeight=" + unitWeight +
                ", deliveryType='" + deliveryType + '\'' +
                ", recipient='" + recipient + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", clientId='" + clientId + '\'' +
                ", deliveryCity='" + deliveryCity + '\'' +
                ", deliveryState='" + deliveryState + '\'' +
                ", deliveryZip=" + deliveryZip +
                ", deliveryCountry='" + deliveryCountry + '\'' +
                ", deliveryPhone='" + deliveryPhone + '\'' +
                ", zeroIndex1=" + zeroIndex1 +
                ", zeroIndex2=" + zeroIndex2 +
                ", senderWarehouse='" + senderWarehouse + '\'' +
                ", packages=" + packages +
                ", totalSize=" + totalSize +
                ", unitSize=" + unitSize +
                '}';
    }
}