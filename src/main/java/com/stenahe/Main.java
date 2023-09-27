package com.stenahe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Staff staff = context.getBean(Doctor.class);
        staff.assist();

        Staff staff2 = context.getBean(Nurse.class);
        staff2.assist();
    }
}