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
public class ReportsDTO extends SuperDTO{
    private String customerName;
    private List<CustomerDTO> customer;
    private List<AppoimenDTO> appoiment;
    private List<BeauticianDTO> beautician;
    private List<PayementDTO> payement;

    public ReportsDTO() {
    }

    public ReportsDTO(List<CustomerDTO> customer, List<AppoimenDTO> appoiment, List<BeauticianDTO> beautician, List<PayementDTO> payement) {
        this.customer = customer;
        this.appoiment = appoiment;
        this.beautician = beautician;
        this.payement = payement;
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
     * @return the payement
     */
    public List<PayementDTO> getPayement() {
        return payement;
    }

    /**
     * @param payement the payement to set
     */
    public void setPayement(List<PayementDTO> payement) {
        this.payement = payement;
    }

   
}
