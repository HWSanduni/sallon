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
public class CustomerDTO extends SuperDTO{
    private String customer_Id;
    private String customer_FirstName;
    private String customer_LastName;
    private String customer_Contact;
    private String customer_Address;
   

    public CustomerDTO() {
    }
    

    public CustomerDTO( String customer_FirstName, String customer_LastName, String customer_Contact, String customer_Address) {
        
        this.customer_FirstName = customer_FirstName;
        this.customer_LastName = customer_LastName;
        this.customer_Contact = customer_Contact;
        this.customer_Address = customer_Address;
    }

    public CustomerDTO(String customer_Id, String customer_FirstName, String customer_LastName, String customer_Contact, String customer_Address) {
        this.customer_Id = customer_Id;
        this.customer_FirstName = customer_FirstName;
        this.customer_LastName = customer_LastName;
        this.customer_Contact = customer_Contact;
        this.customer_Address = customer_Address;
    }
    

    /**
     * @return the customer_Id
     */
    public String getCustomer_Id() {
        return customer_Id;
    }

    /**
     * @param customer_Id the customer_Id to set
     */
    public void setCustomer_Id(String customer_Id) {
        this.customer_Id = customer_Id;
    }

    /**
     * @return the customer_FirstName
     */
    public String getCustomer_FirstName() {
        return customer_FirstName;
    }

    /**
     * @param customer_FirstName the customer_FirstName to set
     */
    public void setCustomer_FirstName(String customer_FirstName) {
        this.customer_FirstName = customer_FirstName;
    }

    /**
     * @return the customer_LastName
     */
    public String getCustomer_LastName() {
        return customer_LastName;
    }

    /**
     * @param customer_LastName the customer_LastName to set
     */
    public void setCustomer_LastName(String customer_LastName) {
        this.customer_LastName = customer_LastName;
    }

    /**
     * @return the customer_Contact
     */
    public String getCustomer_Contact() {
        return customer_Contact;
    }

    /**
     * @param customer_Contact the customer_Contact to set
     */
    public void setCustomer_Contact(String customer_Contact) {
        this.customer_Contact = customer_Contact;
    }

    /**
     * @return the customer_Address
     */
    public String getCustomer_Address() {
        return customer_Address;
    }

    /**
     * @param customer_Address the customer_Address to set
     */
    public void setCustomer_Address(String customer_Address) {
        this.customer_Address = customer_Address;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "customer_Id=" + customer_Id + ", customer_FirstName=" + customer_FirstName + ", customer_LastName=" + customer_LastName + ", customer_Contact=" + customer_Contact + ", customer_Address=" + customer_Address + '}';
    }

   
    
}
