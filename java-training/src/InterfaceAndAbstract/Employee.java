/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract;

/**
 *
 * @author leanh
 */
 abstract class Person {
    String firstname, lastname;
    
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public abstract void viewFirstName();
 }
 
interface iPerson {
     public void viewLastName();
 }
 
 class Employee extends Person implements iPerson {
    String dob;
     
    @Override
    public void viewFirstName() {
        System.out.println("first name: " + firstname);
    }

    @Override
    public void viewLastName() {
        System.out.println("last name: " + lastname);  
    }

    public Employee(String firstname, String lastname, String dob) {
        super(firstname, lastname);
        this.dob = dob;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee("Nguyen", "Van A", "01/01/1990");
        emp.viewFirstName();
        emp.viewLastName();
    }
}
