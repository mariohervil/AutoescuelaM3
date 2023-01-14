<?php
class person
{

    protected $name;
    protected $last_name;
    protected $dni;
    protected $email;
    protected $register_date;
    protected function __construct($name, $last_name, $dni, $email, $register_date)
    {
        $this->name = $name;
        $this->last_name = $last_name;
        $this->dni = $dni;
        $this->email = $email;
        $this->register_date = $register_date;
    }


    //* -------- GET --------
    public function getName()
    {
        return $this->name;
    }
    public function getLastName()
    {
        return $this->last_name;
    }
    public function getDni()
    {
        return $this->dni;
    }
    public function getEmail()
    {
        return $this->email;
    }
    public function getRegDate()
    {
        return $this->register_date;
    }
    //* -------- GET --------


    //? -------- SET --------
    public function setName($name)
    {
        $this->name = $name;
    }
    public function setLastName($last_name)
    {
        $this->last_name = $last_name;
    }
    public function setDni($dni)
    {
        $this->dni = $dni;
    }
    public function setEmail($email)
    {
        $this->email = $email;
    }
    public function setRegDate($register_date)
    {
        $this->register_date = $register_date;
    }
    //? -------- SET --------
}


class teacher extends person
{
    protected $salary;
    public function __construct($name, $last_name, $dni, $email, $register_date, $salary)
    {
        parent::__construct($name, $last_name, $dni, $email, $register_date);
        $this->salary = $salary;
    }
    //* -------- GET --------
    public function getSalary()
    {
        return $this->salary;
    }
    //* -------- GET --------

    //? -------- SET --------
    public function setSalary($salary)
    {
        $this->salary = $salary;
    }
    //? -------- SET --------
}

class student extends person
{
    protected $age;
    protected $approved;
    protected $enroll;
    protected $teacher;
    public function __construct($name, $last_name, $dni, $email, $register_date, $age, $approved, $enroll, $teacher)
    {
        parent::__construct($name, $last_name, $dni, $email, $register_date);
        $this->age = $age;
        $this->$approved = $approved;
        $this->enroll = $enroll;
        $this->$teacher = $teacher;
    }
    //* -------- GET --------
    public function getAge()
    {
        return $this->age;
    }
    public function getApproved()
    {
        return $this->approved;
    }
    public function getEnroll()
    {
        return $this->enroll;
    }
    public function getTeacher()
    {
        return $this->teacher;
    }
    //* -------- GET --------

    //? -------- SET --------
    public function setAge($age)
    {
        $this->age = $age;
    }
    public function setApproved($approved)
    {
        $this->approved = $approved;
    }
    public function setEnroll($enroll)
    {
        $this->enroll = $enroll;
    }
    public function setTeacher($teacher)
    {
        $this->teacher = $teacher;
    }
    //? -------- SET --------
}

class employee extends person
{
    protected $salary;
    protected $position;
    public function __construct($name, $last_name, $dni, $email, $register_date, $salary, $position)
    {
        parent::__construct($name, $last_name, $dni, $email, $register_date);
        $this->salary = $salary;
        $this->position = $position;
    }
    //* -------- GET --------
    public function getSalary()
    {
        return $this->salary;
    }
    public function getPosition()
    {
        return $this->position;
    }
    //* -------- GET --------

    //? -------- SET --------
    public function setSalary($salary)
    {
        $this->salary = $salary;
    }
    public function setPosition($position)
    {
        $this->position = $position;
    }
    //? -------- SET --------
}
