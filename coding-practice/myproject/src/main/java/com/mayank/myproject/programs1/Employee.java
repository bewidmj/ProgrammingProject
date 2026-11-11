package com.mayank.myproject.programs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Employee {

    private final String empId;
    private final String empName;
    private final List<Address> addressList;

    public Employee(String empId, String empName, List<Address> addressList) {
        this.empId = empId;
        this.empName = empName;
        this.addressList = addressList;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public List<Address> getAddressList() {
        Arrays.asList();
        List<Address> addresses = new ArrayList<>();
        for (Address address: addressList) {
            addresses.add(address);
        }
        return addresses;
    }
}

class Address {
    private String address;
}
