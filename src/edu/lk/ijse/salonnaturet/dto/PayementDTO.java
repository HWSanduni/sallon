/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.dto;

import java.util.List;

/**
 *
 * @author Sandu
 */
public class PayementDTO extends SuperDTO{
    private String payement_Id;
    private String service;
    private String date;
    private String time;
    private double  payement;
    private String customerName;
    private String appimentId;
    private List<CustomerDTO> customer;
    private List<AppoimenDTO> appoiment;

    public PayementDTO() {
        
        
    }
public PayementDTO(String payement_Id, String service, String date, String time, double payement, String customerName, String appimentId) {
        this.payement_Id = payement_Id;
        this.service = service;
        this.date = date;
        this.time = time;
        this.payement = payement;
        this.customerName = customerName;
        this.appimentId = appimentId;
        
    }
    
    public PayementDTO(String payement_Id, String service, String date, String time, double payement, String customerName, String appimentId, List<CustomerDTO> customer, List<AppoimenDTO> appoiment) {
        this.payement_Id = payement_Id;
        this.service = service;
        this.date = date;
        this.time = time;
        this.payement = payement;
        this.customerName = customerName;
        this.appimentId = appimentId;
        this.customer = customer;
        this.appoiment = appoiment;
    }
    

    /**
     * @return the payement_Id
     */
    public String getPayement_Id() {
        return payement_Id;
    }

    /**
     * @param payement_Id the payement_Id to set
     */
    public void setPayement_Id(String payement_Id) {
        this.payement_Id = payement_Id;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the payement
     */
    public double getPayement() {
        return payement;
    }

    /**
     * @param payement the payement to set
     */
    public void setPayement(double payement) {
        this.payement = payement;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the appimentId
     */
    public String getAppimentId() {
        return appimentId;
    }

    /**
     * @param appimentId the appimentId to set
     */
    public void setAppimentId(String appimentId) {
        this.appimentId = appimentId;
    }

    /**
     * @return the customer
     */
    public List<CustomerDTO> getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(List<CustomerDTO> customer) {
        this.customer = customer;
    }

    /**
     * @return the appoiment
     */
    public List<AppoimenDTO> getAppoiment() {
        return appoiment;
    }

    /**
     * @param appoiment the appoiment to set
     */
    public void setAppoiment(List<AppoimenDTO> appoiment) {
        this.appoiment = appoiment;
    }

    @Override
    public String toString() {
        return "PayementDTO{" + "payement_Id=" + payement_Id + ", service=" + service + ", date=" + date + ", time=" + time + ", payement=" + payement + ", customerName=" + customerName + ", appimentId=" + appimentId + ", customer=" + customer + ", appoiment=" + appoiment + '}';
    }
    
   
     
}
