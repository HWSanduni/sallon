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
public class AppoimenDTO extends SuperDTO {

    private String appoiment_id;
    private String service;
    private String date;
    private String time;
    private String customer;
    private String apoimentFee;
    private String beautician_name;
    private List<BeauticianDTO> beautician;
    private List<CustomerDTO> customerList;

    public AppoimenDTO() {
    }

    public AppoimenDTO(String appoiment_id, String service, String date, String time, String customer, String apoimentFee, String beautician_name) {
        this.appoiment_id = appoiment_id;
        this.service = service;
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.apoimentFee = apoimentFee;
        this.beautician_name = beautician_name;
    }

    public AppoimenDTO(String appoiment_id, String service, String date, String time, String customer, String apoimentFee, String beautician_name, List<BeauticianDTO> beautician, List<CustomerDTO> customerList) {
        this.appoiment_id = appoiment_id;
        this.service = service;
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.apoimentFee = apoimentFee;
        this.beautician_name = beautician_name;
        this.beautician = beautician;
        this.customerList = customerList;
    }

    /**
     * @return the appoiment_id
     */
    public String getAppoiment_id() {
        return appoiment_id;
    }

    /**
     * @param appoiment_id the appoiment_id to set
     */
    public void setAppoiment_id(String appoiment_id) {
        this.appoiment_id = appoiment_id;
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
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the apoimentFee
     */
    public String getApoimentFee() {
        return apoimentFee;
    }

    /**
     * @param apoimentFee the apoimentFee to set
     */
    public void setApoimentFee(String apoimentFee) {
        this.apoimentFee = apoimentFee;
    }

    /**
     * @return the beautician_name
     */
    public String getBeautician_name() {
        return beautician_name;
    }

    /**
     * @param beautician_name the beautician_name to set
     */
    public void setBeautician_name(String beautician_name) {
        this.beautician_name = beautician_name;
    }

    /**
     * @return the beautician
     */
    public List<BeauticianDTO> getBeautician() {
        return beautician;
    }

    /**
     * @param beautician the beautician to set
     */
    public void setBeautician(List<BeauticianDTO> beautician) {
        this.beautician = beautician;
    }

    /**
     * @return the customerList
     */
    public List<CustomerDTO> getCustomerList() {
        return customerList;
    }

    /**
     * @param customerList the customerList to set
     */
    public void setCustomerList(List<CustomerDTO> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "AppoimenDTO{" + "appoiment_id=" + appoiment_id + ", service=" + service + ", date=" + date + ", time=" + time + ", customer=" + customer + ", apoimentFee=" + apoimentFee + ", beautician_name=" + beautician_name + ", beautician=" + beautician + ", customerList=" + customerList + '}';
    }

}
