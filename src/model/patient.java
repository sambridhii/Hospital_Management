package model;

public class patient extends Hospital {


    public patient(int id, String name) {
        super(id, name);
    }

    public patient(int id, String name, int patient_id, String patient_name) {
        super(id, name);
        this.patient_id = patient_id;
        this.patient_name = patient_name;
    }

    int patient_id;

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    String  patient_name;


        public void getPatient() {
            System.out.println("****************** PATIENT INFORMATION *******************");
            System.out.println("Name: " + this.getPatient_name());


    }

}
