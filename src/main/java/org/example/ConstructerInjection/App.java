package org.example.ConstructerInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//        Student student1=(Student) context.getBean("student1");
//        System.out.println(student1);
//        Customer customer1=(Customer) context.getBean("customer2");
//        System.out.println(customer1);
//        Calculator calculator=(Calculator) context.getBean("calculator1") ;
//        calculator.add();
//        System.out.println(calculator);
        Employee emp=(Employee) context.getBean("emp1");
        System.out.println(emp);

    }
}
