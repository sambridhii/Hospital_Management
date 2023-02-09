package model;

import java.util.Scanner;

public class bill extends Test{


    public bill(int id, String name, int patient_id, String patient_name, double blood_test, double urine_test, double wholebody_test, double eye_test) {
        super(id, name, patient_id, patient_name, blood_test, urine_test, wholebody_test, eye_test);
    }

    public void main(String[] args) {
        Scanner Bill = new Scanner(System.in);
        System.out.println("Enter desired test ");

     String bill  = Bill.nextLine();

        if (bill == 1){
            System.out.println("**************BILL****************");
       

        }
    }
}
