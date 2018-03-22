/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service;

import java.rmi.Remote;

/**
 *
 * @author Sandu
 */
public interface ServiceFactory extends Remote{
    
    public enum ServiceType{
        CUSTOMER,BEAUTICIAN,SERVICE,APPOIMENT,APPOIMENT_DETAILS,BEAUTICIAN_LOGIN,PAYEMENT,RECEPTION,RECEPTION_LOGIN,SUBMIT_APPOIMENT,REPORTS,APPOIMENT2
    }
    public SuperService getService(ServiceType type)throws Exception;
}
