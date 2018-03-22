/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.ReceptionDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface ReceptionService extends SuperService{
    public boolean addRecepton(ReceptionDTO reception )throws Exception;
    
    public ReceptionDTO searchLogin(String name)throws Exception;
    
    public ReceptionDTO findLogin (String name)throws Exception;
    
    public ArrayList<ReceptionDTO>getAllReception ()throws Exception;
    
    public int lastId()throws Exception;

    public boolean upadateRecepton(ReceptionDTO reception)throws Exception;

  

    public ReceptionDTO searchreception2(String name)throws Exception;
            
            
    
}
