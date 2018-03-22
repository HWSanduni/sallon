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
public class SubmitAppoimentDTO extends SuperDTO{
    private List<CustomerDTO> customer;
    private List<AppoimenDTO>appoiment_id;
    private String customername;
    private String appoimentId;
    private String beautician;
    private String service;
    private double service_price;
    private String date;
    private String time;
    private String submit;

    public SubmitAppoimentDTO() {
    }

    public SubmitAppoimentDTO(List<CustomerDTO> customer, List<AppoimenDTO> appoiment_id, String customername, String appoimentId, String beautician, String service, double service_price, String date, String time, String submit) {
        this.customer = customer;
        this.appoiment_id = appoiment_id;
        this.customername = customername;
        this.appoimentId = appoimentId;
        this.beautician = beautician;
        this.service = service;
        this.service_price = service_price;
        this.date = date;
        this.time = time;
        this.submit = submit;
    }
    public SubmitAppoimentDTO( String customername, String appoimentId, String beautician, String service, double service_price, String date, String time, String submit) {
        
        this.customername = customername;
        this.appoimentId = appoimentId;
        this.beautician = beautician;
        this.service = service;
        this.service_price = service_price;
        this.date = date;
        this.time = time;
        this.submit = submit;
    }

    public SubmitAppoimentDTO(String appoimentId, String beautician, String customername, String date, String service, String time, String submit) {
 this.customername = customername;
        this.appoimentId = appoimentId;
        this.beautician = beautician;
        this.date = date;
        this.time = time;
        this.submit = submit;
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
     * @return the appoiment_id
     */
    public List<AppoimenDTO> getAppoiment_id() {
        return appoiment_id;
    }

    /**
     * @param appoiment_id the appoiment_id to set
     */
    public void setAppoiment_id(List<AppoimenDTO> appoiment_id) {
        this.appoiment_id = appoiment_id;
    }

    /**
     * @return the customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * @param customername the customername to set
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
     * @return the appoimentId
     */
    public String getAppoimentId() {
        return appoimentId;
    }

    /**
     * @param appoimentId the appoimentId to set
     */
    public void setAppoimentId(String appoimentId) {
        this.appoimentId = appoimentId;
    }

    /**
     * @return the beautician
     */
    public String getBeautician() {
        return beautician;
    }

    /**
     * @param beautician the beautician to set
     */
    public void setBeautician(String beautician) {
        this.beautician = beautician;
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
     * @return the service_price
     */
    public double getService_price() {
        return service_price;
    }

    /**
     * @param service_price the service_price to set
     */
    public void setService_price(double service_price) {
        this.service_price = service_price;
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
     * @return the submit
     */
    public String getSubmit() {
        return submit;
    }

    /**
     * @param submit the submit to set
     */
    public void setSubmit(String submit) {
        this.submit = submit;
    }

    @Override
    public String toString() {
        return "SubmitAppoimentDTO{" + "customer=" + customer + ", appoiment_id=" + appoiment_id + ", customername=" + customername + ", appoimentId=" + appoimentId + ", beautician=" + beautician + ", service=" + service + ", service_price=" + service_price + ", date=" + date + ", time=" + time + ", submit=" + submit + '}';
    }

    
}
