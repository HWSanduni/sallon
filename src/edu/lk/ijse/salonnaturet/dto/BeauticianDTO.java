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
public class BeauticianDTO extends SuperDTO{
    private String beautician_Id;
    private String beautician_FirstName;
    private String beautician_LastName;
    private String beautician_Address;
    private String beautician_Contact;
    private String beautician_Servicetype;
    private String userName;
    private String beautician_password;

    public BeauticianDTO() {
    }

    
    public BeauticianDTO(String beautician_FirstName, String beautician_LastName,  String beautician_Address, String beautician_Contact, String beautician_Servicetype) {
       
        this.beautician_FirstName = beautician_FirstName;
        this.beautician_LastName = beautician_LastName;
        this.beautician_Address = beautician_Address;
        this.beautician_Contact = beautician_Contact;
        this.beautician_Servicetype = beautician_Servicetype;
    }

    public BeauticianDTO(String beautician_Id, String beautician_FirstName, String beautician_LastName, String userName, String beautician_password, String beautician_Address, String beautician_Contact, String beautician_Servicetype) {
        this.beautician_Id = beautician_Id;
        this.beautician_FirstName = beautician_FirstName;
        this.beautician_LastName = beautician_LastName;
        this.userName = userName;
        this.beautician_password = beautician_password;
        this.beautician_Address = beautician_Address;
        this.beautician_Contact = beautician_Contact;
        this.beautician_Servicetype = beautician_Servicetype;
    }

   

    /**
     * @return the beautician_Id
     */
    public String getBeautician_Id() {
        return beautician_Id;
    }

    /**
     * @param beautician_Id the beautician_Id to set
     */
    public void setBeautician_Id(String beautician_Id) {
        this.beautician_Id = beautician_Id;
    }

    /**
     * @return the beautician_FirstName
     */
    public String getBeautician_FirstName() {
        return beautician_FirstName;
    }

    /**
     * @param beautician_FirstName the beautician_FirstName to set
     */
    public void setBeautician_FirstName(String beautician_FirstName) {
        this.beautician_FirstName = beautician_FirstName;
    }

    /**
     * @return the beautician_LastName
     */
    public String getBeautician_LastName() {
        return beautician_LastName;
    }

    /**
     * @param beautician_LastName the beautician_LastName to set
     */
    public void setBeautician_LastName(String beautician_LastName) {
        this.beautician_LastName = beautician_LastName;
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
     * @return the beautician_password
     */
    public String getBeautician_password() {
        return beautician_password;
    }

    /**
     * @param beautician_password the beautician_password to set
     */
    public void setBeautician_password(String beautician_password) {
        this.beautician_password = beautician_password;
    }

    /**
     * @return the beautician_Address
     */
    public String getBeautician_Address() {
        return beautician_Address;
    }

    /**
     * @param beautician_Address the beautician_Address to set
     */
    public void setBeautician_Address(String beautician_Address) {
        this.beautician_Address = beautician_Address;
    }

    /**
     * @return the beautician_Contact
     */
    public String getBeautician_Contact() {
        return beautician_Contact;
    }

    /**
     * @param beautician_Contact the beautician_Contact to set
     */
    public void setBeautician_Contact(String beautician_Contact) {
        this.beautician_Contact = beautician_Contact;
    }

    /**
     * @return the beautician_Servicetype
     */
    public String getBeautician_Servicetype() {
        return beautician_Servicetype;
    }

    /**
     * @param beautician_Servicetype the beautician_Servicetype to set
     */
    public void setBeautician_Servicetype(String beautician_Servicetype) {
        this.beautician_Servicetype = beautician_Servicetype;
    }

    @Override
    public String toString() {
        return "" + beautician_Id + " " + beautician_FirstName + "";
    }

   
}
