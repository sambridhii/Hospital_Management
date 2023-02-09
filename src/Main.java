
import model.Department;
import model.Doctor;
import model.patient;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Department department1 = new Department(1,"Civil",1,"Cardio");
        Department department2 = new Department(1,"Civil",2,"Neuro");

        Department department3 = new Department(1,"Civil",1,"ENT");
        Department department4 = new Department(1,"Civil",1,"Ortho");

        patient Patient1 = new patient(1,"civil",1,"Diya");
        patient Patient2 = new patient(1,"civil",2,"Siya");
        patient Patient3 = new patient(1,"civil",3,"Miya");
        patient Patient4 = new patient(1,"civil",4,"Piya");

        Doctor doctor1 = new Doctor(1,"civil","Dr someone","Neuro",true);
        Doctor doctor2 = new Doctor(1,"civil","Dr OJ","Cardio",true);
        Doctor doctor3 = new Doctor(1,"civil","Dr Bhola","ENT",true);
        Doctor doctor4 = new Doctor(1,"civil","Dr kunjal","ENT",true);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Appointment and 2 for bill");
        int Input = input.nextInt();
        if (Input == 1) {
            Scanner Patient = new Scanner(System.in);
            System.out.println("Enter Patient name");

            Scanner Patient_age = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter Patient age");

            Scanner Patient_gender = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter Patient gender");

            Scanner Appointment = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter Appointment date");

//        Scanner question = new Scanner(System.in);  // Create a Scanner object
//            System.out.println("Do you want new patient card?");
//            String Question = question.nextLine();

            String PatientName = Patient.nextLine();  // Read user input
            int Patient_Age = Patient_age.nextInt();
            String Patient_Gender = Patient_gender.nextLine();
            String Appointment_date = Appointment.nextLine();  // Read user input

        System.out.println("************Appointment************* ");
            System.out.println("Patient's Name:" + PatientName);
            System.out.println("Age:" + Patient_Age +"                        "+ "Gender:" + Patient_Gender);
            System.out.println("Appointment date:"+ Appointment_date);
            System.out.println("Appointment fees: Rs 500");
        }
        else if (Input == 2){
            System.out.println();
        }
    }
}
