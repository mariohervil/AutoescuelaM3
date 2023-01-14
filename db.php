<?php
include("classes.php");
class db
{
    private $servername = "mysql:host=localhost;dbname=autoescuela;";
    private $serverNoDB = "mysql:host=localhost";
    private $username = "root";
    private $password = "";
    private $conn;

    public function __construct()
    {
        try {
            $this->conn = new PDO($this->servername, $this->username, $this->password);
            echo "Connected";
        } catch (PDOException $e) {

            if ($e->getCode()  === 1049) {
                echo "Missing db created";
                $this->conn = new PDO($this->serverNoDB, $this->username, $this->password);
                $this->conn->query("CREATE DATABASE `autoescuela`;");
                $this->conn = new PDO($this->servername, $this->username, $this->password);
            } else print("Connection failed: " . $e);
        }
    }


    public function operate($control, $class, $data)
    {
        switch ($control) {
            case 'insert':
                if ($class === "student") {
                    $this->insertStudent($data);
                } else if ($class === "teacher") {
                    $this->insertTeacher($data);
                } else $this->insertEmployee($data);
                break;
            case 'select':
                $this->select($class);
                break;
            case 'delete':
                if ($class === "student") {
                    $this->deleteStudent($data);
                } else if ($class === "teacher") {
                    $this->deleteTeacher($data);
                } else $this->deleteEmployee($data);
                break;
            default:
                echo "Algo ha fallado";
                break;
        }
    }

    //! C
    private function insertTeacher($teacher)
    {

        $this->conn->query("CREATE TABLE IF NOT EXISTS teachers (
            id int not null auto_increment,
            name VARCHAR(50),
            last_name VARCHAR(50),
            dni VARCHAR(9) UNIQUE,
            email VARCHAR(100),
            register_date DATE NOT NULL,
            salary int, 
            primary key (id)
          );");
        print($teacher->getRegDate());

        $this->conn->query("INSERT INTO teachers(name, last_name, dni, email, register_date, salary)  VALUES( '" . $teacher->getName() . "'
            , '" . $teacher->getLastName() . "','" . $teacher->getDni() . "','" . $teacher->getEmail() .
            "','" . $teacher->getRegDate() . "'," . $teacher->getSalary() . ")");
    }
    function insertStudent($student)
    {
        $this->conn->query("CREATE TABLE IF NOT EXISTS `students` (`id` int not null auto_increment, `name` VARCHAR(50), `last_name` VARCHAR(50),
         `dni` VARCHAR(9), `email` VARCHAR(100), `register_date` TIMESTAMP, `age` int, `approved` boolean, `enroll` DOUBLE, `teacher` int,
          primary key (`id`), foreign key (`teacher`) references `teacher`(`id`)");

        $this->conn->query("INSERT INTO `teacher`");
    }
    private function insertEmployee($employee)
    {
        $this->conn->query("CREATE TABLE IF NOT EXISTS `employees` (`id` int not null auto_increment, `name` VARCHAR(50), `last_name` VARCHAR(50),
         `dni` VARCHAR(9), `email` VARCHAR(100), `register_date` TIMESTAMP, `salary` int, `position` VARCHAR(50), primary key (`id`)");

        $this->conn->query("INSERT INTO `teacher`");
    }


    //! R

    private function select($table)
    {
        $this->conn->query("SELECT * FROM $table" . "s");
    }

    //! D
    private function deleteTeacher($teacher)
    {
        $this->conn->query("DELETE FROM `teachers` WHERE `dni` = $teacher->dni");
    }
    private function deleteStudent($student)
    {
        $this->conn->query("DELETE FROM `students` WHERE `dni` = $student->dni");
    }
    private function deleteEmployee($employee)
    {
        $this->conn->query("DELETE FROM `employees` WHERE `dni` = $employee->dni");
    }
}
