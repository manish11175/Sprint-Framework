package org.example.ConstructerInjection;

public class Student {
    private int sid;
    private String name;
    private String address;

    public Student(int sid, String name, String address) {
        this.sid = sid;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
