/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.AppoimenDTO;
import edu.lk.ijse.salonnaturet.dto.CustomerDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface AppoimentService extends SuperService {

    public boolean makeAppoiment(AppoimenDTO appoiment) throws Exception;

    public boolean updateAppoiment(AppoimenDTO appoiment) throws Exception;

    public boolean deleteAppoiment(String id) throws Exception;

    public AppoimenDTO searchAppoiment(String id) throws Exception;

    public ArrayList<AppoimenDTO> getAllAppoiment() throws Exception;
}
