/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.CustomerDTO;
import edu.lk.ijse.salonnaturet.dto.SubmitAppoimentDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface SubmitAppoimentServie extends SuperService{
    public boolean addSubmitAppoiment(SubmitAppoimentDTO submit)throws Exception;
    
    public CustomerDTO searchSubmitAppoiment(String name)throws Exception;
    
    public ArrayList<SubmitAppoimentDTO>getAllSubmit()throws Exception;
    
    
}
