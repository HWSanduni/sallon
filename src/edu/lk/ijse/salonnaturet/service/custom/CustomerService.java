/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.CustomerDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface CustomerService extends SuperService{
    
    public boolean addCusstomer(CustomerDTO customer)throws Exception;
    
    public boolean updateCustomer(CustomerDTO customer)throws Exception;
    
    public boolean deleteCustomer(String name)throws Exception;
    
    public CustomerDTO searchCustomer(String id)throws Exception;
    
    public ArrayList<CustomerDTO>getAllCustomer()throws Exception;
}
