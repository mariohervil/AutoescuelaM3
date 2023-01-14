/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlm3hernandez;

import java.util.ArrayList;

/**
 *
 * @author mariohervil
 */
public class Teacher extends Person {

    private float salary;
    private ArrayList<Student> ALstudentlist = new ArrayList<Student>();

    //fecha de dar de alta y lista de alumnos
    public Teacher() {
        super();
    }
     public Teacher(String name, String surname, String dni, String email, String dateAlta, float salary) {
        super(name, surname, dni, email, dateAlta);
        setSalary(salary);
       
    }

    public Teacher(String name, String surname, String dni, String email, String dateAlta, float salary, ArrayList<Student> ALstudentlist) {
        super(name, surname, dni, email, dateAlta);
        setSalary(salary);
        setALstudentlist(ALstudentlist);
    }

    public ArrayList<Student> getALstudentlist() {
        return ALstudentlist;
    }

    public void setALstudentlist(ArrayList<Student> ALstudentlist) {
        this.ALstudentlist = ALstudentlist;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public void addStudent(Student student){
        if (!this.ALstudentlist.contains(student)) {
            this.ALstudentlist.add(student);
        }
        
    }
    

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Salary: " + getSalary() + "\n\r");
        sb.append("-------Students------- " + getALstudentlist() + "\n\r");
        for (Student s : ALstudentlist) {
            
        }
        return sb.toString();
    }
}
