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
public interface Observer extends Remote{
    public void update()throws Exception;
}
