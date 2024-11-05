/**
 *
 */
package com.flipfit.bean;

/**
 * @author Dell
 *
 */
public class Customer {

    // the Properties of the bean class which contains the Setter Getter As well

    private int customerId;
    private String customerName;
    private String customerAddress;

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}