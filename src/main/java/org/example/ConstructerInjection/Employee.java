package org.example.ConstructerInjection;

public class Employee {
    private int empId;
    private String name;
    private String email;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
        System.out.println("setter");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void init(){
        System.out.println("init called......");
    }
    public void destroy(){
        System.out.println("destroy called......");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
