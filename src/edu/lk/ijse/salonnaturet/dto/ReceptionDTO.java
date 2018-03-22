/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lk.ijse.salonnaturet.dto;

/**
 *
 * @author Sandu
 */
public class ReceptionDTO extends SuperDTO{
    private String reception_Id;
    private String reception_Name;
    private String reception_contact;
    private String reception_Address;
    private String userName;
    private String reception_Password;

    public ReceptionDTO() {
    }

    public ReceptionDTO(String reception_Id, String reception_Name, String reception_contact, String reception_Address, String userName, String reception_Password) {
        this.reception_Id = reception_Id;
        this.reception_Name = reception_Name;
        this.reception_contact = reception_contact;
        this.reception_Address = reception_Address;
        this.userName = userName;
        this.reception_Password = reception_Password;
    }

    /**
     * @return the reception_Id
     */
    public String getReception_Id() {
        return reception_Id;
    }

    /**
     * @param reception_Id the reception_Id to set
     */
    public void setReception_Id(String reception_Id) {
        this.reception_Id = reception_Id;
    }

    /**
     * @return the reception_Name
     */
    public String getReception_Name() {
        return reception_Name;
    }

    /**
     * @param reception_Name the reception_Name to set
     */
    public void setReception_Name(String reception_Name) {
        this.reception_Name = reception_Name;
    }

    /**
     * @return the reception_contact
     */
    public String getReception_contact() {
        return reception_contact;
    }

    /**
     * @param reception_contact the reception_contact to set
     */
    public void setReception_contact(String reception_contact) {
        this.reception_contact = reception_contact;
    }

    /**
     * @return the reception_Address
     */
    public String getReception_Address() {
        return reception_Address;
    }

    /**
     * @param reception_Address the reception_Address to set
     */
    public void setReception_Address(String reception_Address) {
        this.reception_Address = reception_Address;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the reception_Password
     */
    public String getReception_Password() {
        return reception_Password;
    }

    /**
     * @param reception_Password the reception_Password to set
     */
    public void setReception_Password(String reception_Password) {
        this.reception_Password = reception_Password;
    }

    @Override
    public String toString() {
        return "ReceptionDTO{" + "reception_Id=" + reception_Id + ", reception_Name=" + reception_Name + ", reception_contact=" + reception_contact + ", reception_Address=" + reception_Address + ", userName=" + userName + ", reception_Password=" + reception_Password + '}';
    }
    

    
}
