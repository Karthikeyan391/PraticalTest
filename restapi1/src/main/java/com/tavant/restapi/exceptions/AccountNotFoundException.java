package com.tavant.restapi.exceptions;

 

public class AccountNotFoundException extends Exception{

 

    public AccountNotFoundException(String message) {
        // TODO Auto-generated constructor stub
    
        super(message);
        
    }
    
    @Override
    public String toString() {
        return super.toString() ;
    }
}