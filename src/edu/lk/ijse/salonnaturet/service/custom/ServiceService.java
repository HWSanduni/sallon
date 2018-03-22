/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.AppoimenDTO;
import edu.lk.ijse.salonnaturet.dto.ServiceDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface ServiceService extends SuperService{
    
    public boolean addService(ServiceDTO service)throws Exception;
    
    public boolean updateService(ServiceDTO service)throws Exception;
    
    public boolean deleteService (String name)throws Exception;
    
    public ServiceDTO searchService (String id)throws Exception;
    
    public ArrayList<ServiceDTO> getAllService()throws Exception;
}
