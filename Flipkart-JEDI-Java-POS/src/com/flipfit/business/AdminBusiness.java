package com.flipfit.business;

import java.util.List;

public interface AdminBusiness {
    public String sendNotification(String message);
    public void addGYM(int gymId, String gymName, String gymAddress);
    public void removeGYM(int gymId);
    public void listGYM();
    public void addCustomerInWaitingList(int customerId, int centerId);
    public void removeCustomerFromWaitingList(int customerId, int centerId);

}