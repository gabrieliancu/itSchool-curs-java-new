package org.example;

import org.example.session16.*;

public class Main {
    public static void main(String[] args) {
        Person staff= new Person("staffName","1");
        Person doctor= new Doctor("docName","2");
        Person nurse= new Nurse("nurseName","3");

        Patient patient=new Patient("Marcel", "4","cold");
        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();
        InsuranceBilling inseuranceBilling  = new InsuranceBilling();
        inseuranceBilling.generateBill(patient);
    }
}