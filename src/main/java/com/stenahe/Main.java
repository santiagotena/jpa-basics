package com.stenahe;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Degree");
        Nurse nurse = new Nurse();

        System.out.println(doctor.getQualification());
        doctor.assist();
        nurse.assist();
    }
}