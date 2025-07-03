/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;



class animal {
    public void weight(int a, int b) {
        System.out.println(a+b);
    }
    
    public void weight(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    
    public void weight(double a, double b) {
        System.out.println(a+b);
    }
    public void legs(){
            System.out.println("This animal has four legs");
    }
}
public class Polymorphism extends animal{

    public Polymorphism() {
    }
    
    @Override    
    public void legs(){
        System.out.println("This animal has two legs");
    }
    
    public static void main(String[] args) {
        Polymorphism c = new Polymorphism();
        c.weight(1, 2);
        c.weight(1, 2, 3);
        c.weight(1.5, 2.5);
        c.legs();
    }
}
