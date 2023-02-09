
package model;

public class Department extends Hospital {


    public Department(int id, String name) {
        super(id, name);
    }

    public Department(int id, String name, int department_id, String department_name) {
        super(id, name);
        this.department_id = department_id;
        this.department_name = department_name;
    }

    int department_id;
    String department_name;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }


    public void main(String[] args) {
        System.out.println("****************** DEPARTMENT *************************");
        System.out.println("Departments: " + this.getDepartment_name());
    }
}