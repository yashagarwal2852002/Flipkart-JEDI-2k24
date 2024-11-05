package com.flipfit.application;

import com.flipfit.business.AdminBusiness;
import com.flipfit.business.AdminBusinessImpl;
import com.flipfit.business.CustomerBusiness;
import com.flipfit.business.CustomerBusinessImpl;
import com.flipfit.business.GYMOwnerBusiness;
import com.flipfit.business.GYMOwnerBusinessImpl;

public class FlipFitApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to FlipFit!");
        CustomerBusiness service = new CustomerBusinessImpl();
        System.out.println(service.createCustomer("Sample Name", "example.com", "Sample Address", "password"));
        System.out.println(service.deleteCustomer(1));
        System.out.println(service.updateCustomer(1));
        service.listCustomer();
        service.viewBookings(1);
        service.makeBooking(1, 1);
        service.cancelBooking(1, 1);

        AdminBusiness adminService = new AdminBusinessImpl();
        adminService.sendNotification("Sample message");
        adminService.addGYM(1, "Sample GYM", "Sample Address");
        adminService.removeGYM(1);
        adminService.listGYM();
        adminService.addCustomerInWaitingList(1, 1);
        adminService.removeCustomerFromWaitingList(1, 1);

        GYMOwnerBusiness gymOwnerService = new GYMOwnerBusinessImpl();
        gymOwnerService.gymAddition();
        gymOwnerService.gymDeletion(1);
        gymOwnerService.addSlots(1, 1);
        gymOwnerService.removeSlots(1, 1);
    }
}