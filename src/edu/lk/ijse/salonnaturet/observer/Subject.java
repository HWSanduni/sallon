/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.observer;

import java.rmi.Remote;

/**
 *
 * @author Sandu
 */
public interface Subject extends Remote{
    public void registerObserver(Observer observer)throws Exception;
    
    public void unregisterObserver(Observer observer)throws Exception;
    
    public void notifyAllObserver(String txt)throws Exception;
}
