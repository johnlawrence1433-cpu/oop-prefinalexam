/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastacklinked;

/**
 *
 * @author User
 */
public class Test {
    
     public static void main(String[] args) {
         
        Employee emp = new Employee(202450149, "John Lawrence Ga", 7000);

        System.out.println(emp);

        emp.setName("John Lawrence Ga");
        
        emp.setSalary(7000);
        
        System.out.println(emp);

        
        emp.setSalary(-1000);
    }
}

