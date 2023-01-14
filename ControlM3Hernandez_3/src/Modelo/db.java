package Modelo;

/**
 *
 * @author mariohervil
 */
import controlm3hernandez.Employee;
import controlm3hernandez.Student;
import controlm3hernandez.Teacher;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class db {

    public db() {
        
    }

    private void insertTeacher(Teacher p) throws MalformedURLException, IOException {
        URL url = new URL("http://localhost/m3/exec.php");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setDoOutput(true);
        try ( DataOutputStream out = new DataOutputStream(con.getOutputStream())) {
            out.writeBytes("key1=value1&key2=value2");
        }
        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);
    }

    public void insertEmployee(Employee e) throws MalformedURLException, IOException {

    }

    public void insertStudent(Student s) throws MalformedURLException, IOException {

    }
}
