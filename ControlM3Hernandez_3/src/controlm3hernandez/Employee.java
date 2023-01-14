/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlm3hernandez;

/**
 *
 * @author mariohervil
 */
public class Employee extends Person {

    private float salary;
    private String puesto;
    //fecha de dar de alta y enum de su puesto

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String dni, String email, String dateAlta, float salary, String puesto) {
        super(name, surname, dni, email, dateAlta);
        setSalary(salary);
        setPuesto(puesto);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Salary: " + getSalary() + "\n\r");
        sb.append("Position: " + getPuesto() + "\n\r");

        return sb.toString();
    }
}
