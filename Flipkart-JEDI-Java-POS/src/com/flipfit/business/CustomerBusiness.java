package com.flipfit.business;

public interface CustomerBusiness {
    public int createCustomer(String customerName, String customerEmail, String customerAddress, String customerPassword);
    public boolean updateCustomer(int customerId);
    public boolean deleteCustomer(int customerId);
    public void listCustomer();
    public void makeBooking(int customerId, int slotId);
    public void viewBookings(int customerId);
    public void cancelBooking(int customerId, int slotId);

}
