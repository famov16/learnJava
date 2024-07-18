package com.famov.dataStructures;

import java.util.Calendar;

/**
 *
 * @author Mozvil
 */
// Estructura de datos REGISTROS
public class Employee {

    private String name;
    private String address;
    private boolean gender;
    private double salary;
    private java.util.Date birthDate;
    private int age =-1;
    private Employee supervisor;
    public Employee() {

    }

    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
        age = -1;
    }
    public void setSupervisor(Employee supervisor){
        this.supervisor = supervisor;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getAge() {
        if (age == -1) {
            Calendar cnow = Calendar.getInstance();
            Calendar cdate = Calendar.getInstance();
            cdate.setTime(this.birthDate);
            int age = cnow.get(Calendar.YEAR) - cdate.get(Calendar.YEAR);
            cdate.set(Calendar.YEAR, cnow.get(Calendar.YEAR));
            if (cdate.getTime().compareTo(cnow.getTime()) > 0) {
                age--;
            }
        }

        return age;
    }

    public void print() {
        /*....*/
        System.out.println(getAge());
    }
}
