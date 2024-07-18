/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

/**
 *
 * @author Mozvil
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employees[] = new Employee[100];
//       Employee e = new Employee();
//       initEmployee(e);
//       printEmployee(e);
//        
//       for(int n=0; n<100; n++){
//           Employee ee = employee[n];
//           if(ee.salary > 10000)
//               printEmployee(ee
//        }

      
        Employee supervisor = new Employee();      
        Employee e = new Employee();
        e.print();
        e.setSupervisor(supervisor);
        
        for(Employee ee : employees){
            if (ee.getSalary() > 10000) {
                ee.print();
            }
        }
    
     
    }
}
