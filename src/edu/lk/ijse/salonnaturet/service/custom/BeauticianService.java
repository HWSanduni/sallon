/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.BeauticianDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface BeauticianService extends SuperService{
    public boolean adddBeautician (BeauticianDTO beautician)throws Exception;
    
    public boolean updateBeautician (BeauticianDTO beautician)throws Exception;
    
    public boolean deleteBeautician (String name)throws Exception;
    
    public BeauticianDTO searchBeautician (String id)throws Exception;
    
    public ArrayList<BeauticianDTO>getAllBeautician ()throws Exception;
    
            
}
