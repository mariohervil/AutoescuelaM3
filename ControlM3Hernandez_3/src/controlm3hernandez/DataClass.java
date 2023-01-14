/*
1- ArrayList :3p
2- Dar de alta y visualizar la lista de cada tipo de objeto: 3p
3- Numero de alumnos, profes y empleados: 2p
4- Dar de baja: 2p 


 */
package controlm3hernandez;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;

public class DataClass extends Person{

    public static JFrame jFmain;
    public static JFrame jF1 = new FrameEmployee();
    public static JFrame jF2 = new FrameStudent();
    public static JFrame jF3 = new FrameTeacher();
    public static JFrame jF4 = new FrameStats();

    public static void gotoJF(JFrame jf1, JFrame jf2) {
        jf1.setVisible(false);
        jf2.setVisible(true);
    }
    public static ArrayList<Student> ALstudent = new ArrayList<Student>();
    public static ArrayList<Teacher> ALteacher = new ArrayList<Teacher>();
    public static ArrayList<Employee> ALemployee = new ArrayList<Employee>();

    

    public static boolean validateEMDni(Employee newEmployee) {
        boolean ok = true;
        for (Employee e : DataClass.ALemployee) {
            if (e.getDni().equals(newEmployee.getDni())) {
                ok = false;
                break;
            }

        }

        return ok;
    }

    public static boolean validateTEDni(Teacher newTeacher) {
        boolean ok = true;
        for (Teacher t : DataClass.ALteacher) {
            if (t.getDni().equals(newTeacher.getDni())) {
                ok = false;
                break;
            }

        }

        return ok;
    }

}
