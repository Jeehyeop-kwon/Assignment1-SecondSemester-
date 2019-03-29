/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
/**
 *
 * @author jeehyeopkwon
 */
public class Account {
    
    private String firstName;
    private String lastName;
    private double balance;
    
    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    
    }
    
    public String getfirstName(){
        return firstName;
    }
    
    public String getlastName(){
        return lastName;
    }
    
    public double getBalance(){
        return balance;
    }
    
    
    public void setfirstName(String firstName) throws IllegalArgumentException {
         if(!firstName.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Please enter alphabets only for first name");
           // System.out.println("Whoops! Please, Use letters for First name");
        } else {
            this.firstName = firstName;
        }
    }
         
    public void setlastName(String lastName) throws IllegalArgumentException {
         if(!lastName.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Please enter alphabets only for last name");
           // System.out.println("Whoops! Please, Use letters for last name");
        } else {
            this.lastName = lastName;
        }
         
    }
    
    public void setBalance(float balance) throws IllegalArgumentException {
        
        if( 0 > balance){
            throw new IllegalArgumentException("Please enter positive number for balance");
        } else {
            this.balance = balance;
        }
       
    }
    
    public double deposit (double balance) throws IllegalArgumentException {
        
        if( 0 > balance) {
            throw new IllegalArgumentException("Please enter positive number for balance");
        } else {
            return this.balance = getBalance() + balance;
        }
    }
    
    
    @Override
    public String toString(){
       
        return ("FirstName:" + getfirstName() + " " + "LastName:" + getlastName() + " " + "Balance:" + getBalance());
    }
    

}
