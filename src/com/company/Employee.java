package com.company;

public class Employee extends Person{
    private String company;
    public Employee(int age, String name, String company) {
        super(age, name);
        this.company=company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String post() {
        return "Manager";
    }
}
