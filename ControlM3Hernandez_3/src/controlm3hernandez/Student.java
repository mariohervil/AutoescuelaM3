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
public class Student extends Person {

    private int age, aprobado;
    private float enroll;
    private Teacher teacher;
    //fecha de dar de alta y profesor

    public Student(String name, String surname, String dni, String email, String dateAlta, int age, int aprobado, float enroll) {
        super(name, surname, dni, email, dateAlta);
        setAge(age);
        setAprobado(aprobado);
        setEnroll(enroll);
    }

    public Student(String name, String surname, String dni, String email, String dateAlta, int age, int aprobado, float enroll, Teacher teacher) {
        super(name, surname, dni, email, dateAlta);
        setAge(age);
        setAprobado(aprobado);
        setEnroll(enroll);
        setTeacher(teacher);
    }

    public Student() {
        super();

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAprobado() {
        return aprobado;
    }

    public void setAprobado(int aprobado) {
        this.aprobado = aprobado;
    }

    public float getEnroll() {
        return enroll;
    }

    public void setEnroll(float enroll) {
        this.enroll = enroll;
    }

    public Teacher getTeacher() {

        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.addStudent(this);
    
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Age: " + getAge() + "\n\r");
        sb.append("Approved: " + getAprobado() + "\n\r");
        sb.append("Enrollment: " + getEnroll() + "\n\r");
//        sb.append("Teacher: " + getTeacher().dni+ "\n\r");

        return sb.toString();
    }

}
