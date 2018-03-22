/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.service.custom;

import edu.lk.ijse.salonnaturet.dto.ReportsDTO;
import edu.lk.ijse.salonnaturet.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sandu
 */
public interface ReportsService extends SuperService{
    public boolean addReport(ReportsDTO dto)throws Exception;
    
    public boolean updateReport(ReportsDTO dto)throws Exception;
    
    public boolean deleteReport (String date )throws Exception;
    
    public ReportsDTO searchService (String date)throws Exception;
    
    public ArrayList<ReportsDTO> getAllReports()throws Exception;
}
