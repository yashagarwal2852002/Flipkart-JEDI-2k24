package com.flipfit.business;

public class CustomerBusinessImpl implements CustomerBusiness{

    @Override
    public void createCustomer() {
        System.out.println("In the create customer method");
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        System.out.println("In the delete customer Method -->" + customerId);
        return true;
    }

    @Override
    public boolean updateCustomer(int customerId) {
        System.out.println("In the update customer method --> " + customerId);
        return true;
    }

    @Override
    public void listCustomer() {
        System.out.println("In the list Customer Methods -->");
    }
}
