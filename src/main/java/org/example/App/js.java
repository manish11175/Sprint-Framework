package org.example.App;

import org.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class js {
    public static void main(String[] args) {
        ApplicationContext context= new  ClassPathXmlApplicationContext("config.xml");
//        Student  student=(Student)  context.getBean("student1");
//        System.out.println(student);


//        Employee emp1=(Employee) context.getBean("employee1");
//        System.out.println(emp1);

        Customer customer = (Customer) context.getBean("customer1");
        Address address = customer.getAddress();

        //System.out.println(address);
        System.out.println(customer);
    }
}
