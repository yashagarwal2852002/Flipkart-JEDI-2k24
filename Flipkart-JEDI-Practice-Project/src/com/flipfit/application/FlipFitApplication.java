package com.flipfit.application;

import com.flipfit.business.CustomerBusiness;
import com.flipfit.business.CustomerBusinessImpl;

public class FlipFitApplication {
    public static void main(String[] args){
        //create the instance of the Interface and look of the methods

        CustomerBusiness service = new CustomerBusinessImpl();
        service.createCustomer();
        System.out.println("Customer deleted by Id --> " + service.deleteCustomer(101));
        System.out.println("customer updated by Id --> " + service.updateCustomer(101));
        service.listCustomer();
    }
}
