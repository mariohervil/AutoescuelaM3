/*
herencia: atributos + metodos : heredados
constructores no se heredan
1- hacer clase persona, usarla en otras clases: alumno, empleado, profesor<10p> ✓✓✓✓✓✓
2 - crear objetos de tipo student y guardar en arraylist<5p>✓✓✓✓✓✓
    - visualizar los student que tenemos <5p>✓✓✓✓✓✓
3 - crear objetos de tipo teacher y guardar en arraylist<5p>✓✓✓✓✓✓
    - visualizar los teacher que tenemos <5p>✓✓✓✓✓✓
4 - crear objetos de tipo empleado y guardar en arraylist<5p>✓✓✓✓✓✓
    - visualizar los empleado que tenemos <5p>✓✓✓✓✓✓
modo consola: 10p ✓✓✓✓✓✓
modo gráfico: 10p ✓✓✓✓✓✓
diseño 

5 - Uso de DataClass para los ArrayList<10p>✓✓✓✓✓✓
6 - Poder navegar <10p>✓✓✓✓✓✓
7 - Diseño <10p>
8 - Ver fecha y hora actual <10p>✓✓✓✓✓✓


<60p>
----------------------------------------------------------------


9 - visualizar alumnos para escoger por parte de profesor <5p>✓✓✓✓✓✓
10 - visualizar profe para escoger por parte del alumno <5p>✓✓✓✓✓✓
11 - recaudacion total (suma de las matriculas de los alumnos) <5p>
12 - estadistica: <25p>
numero de alumnos + numero de profes + numero de empleados
alumnos aprobados en teoria
alumnos aprobados en teoria + practica 
% de resultados de autoescuela: % aprobados (t+p) / total
beneficio de la autoescuela 

16-11-2021

 */
package controlm3hernandez;

/**
 *
 * @author mariohervil
 */
public class Person {

    protected String name;
    protected String surname;
    public String dni;
    protected String email;
    protected String dateAlta;

    public Person() {

    }

    public Person(String name, String surname, String dni, String email, String dateAlta) {
        setName(name);
        setSurname(surname);
        setDni(dni);
        setEmail(email);
        setDateAlta(dateAlta);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dateAlta
     */
    public String getDateAlta() {
        return dateAlta;
    }

    /**
     * @param dateAlta the dateAlta to set
     */
    public void setDateAlta(String dateAlta) {
        this.dateAlta = dateAlta;
    }
    

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("******************\n\r");
        sb.append("Name: " + getName() + "\n\r");
        sb.append("Surname: " + getSurname() + "\n\r");
        sb.append("DNI: " + getDni() + "\n\r");
        sb.append("Email: " + getEmail() + "\n\r");
        sb.append("Date Alta: " + getDateAlta()+ "\n\r");

        return sb.toString();
    }

}
