/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.AppoimenDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface AppoimentService2  extends SuperService{
    
    public boolean addAppoiment2 (AppoimenDTO appoiment)throws Exception;
    
    public boolean updateAppoiment2 (AppoimenDTO appoiment)throws Exception;
    
    public boolean deleteAppoiment2 (String id)throws Exception;
    
    public AppoimenDTO saerchAppoiment2 (String id)throws Exception;
    
    public ArrayList<AppoimenDTO>getAllAppoiment2 ()throws Exception;
    
    
}
