/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.dto;

/**
 *
 * @author Sandu
 */
public class ServiceDTO extends SuperDTO{
    private String service_Id;
    private String service_Duration;
    private String service_Name;
    private double service_price;
    

    public ServiceDTO() {
    }

    public ServiceDTO( String service_Name, String service_Duration,double service_price) {
        
        this.service_Name = service_Name;
        this.service_Duration = service_Duration;
        this.service_price = service_price;
    }

    public ServiceDTO(String service_Id, String service_Duration, String service_Name, double service_price) {
        this.service_Id = service_Id;
        this.service_Duration = service_Duration;
        this.service_Name = service_Name;
        this.service_price = service_price;
        
    }
    

    /**
     * @return the service_Id
     */
    public String getService_Id() {
        return service_Id;
    }

    /**
     * @param service_Id the service_Id to set
     */
    public void setService_Id(String service_Id) {
        this.service_Id = service_Id;
    }

    /**
     * @return the service_Name
     */
    public String getService_Name() {
        return service_Name;
    }

    /**
     * @param service_Name the service_Name to set
     */
    public void setService_Name(String service_Name) {
        this.service_Name = service_Name;
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
     * @return the service_Duration
     */
    public String getService_Duration() {
        return service_Duration;
    }

    /**
     * @param service_Duration the service_Duration to set
     */
    public void setService_Duration(String service_Duration) {
        this.service_Duration = service_Duration;
    }

    @Override
    public String toString() {
        return "ServiceDTO{" + "service_Id=" + service_Id + ", service_Name=" + service_Name + ", service_price=" + service_price + ", service_Duration=" + service_Duration + '}';
    }

    
    
}
