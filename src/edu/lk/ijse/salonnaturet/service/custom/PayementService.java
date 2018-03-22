/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.CustomerDTO;
import edu.lk.ijse.salonnaturet.dto.PayementDTO;
import edu.lk.ijse.salonnaturet.dto.ReportsDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface PayementService extends SuperService{
    public boolean addPyement(PayementDTO payement,ReportsDTO reports)throws Exception;
    
    public boolean savePyement(PayementDTO payement)throws Exception;
    
    public boolean updatePayement(PayementDTO payement)throws Exception;
    
    public boolean deletePayement(String name)throws Exception;
    
    public PayementDTO searchPayement (String name)throws Exception;
    
    public ArrayList<PayementDTO>getAllPayement()throws Exception;
}
