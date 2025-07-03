/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author leanh
 */
public class Final {

    public static void main(String[] args) {
        // Final variables
        final int MAX_VALUE = 100;  // Hằng số - không thể thay đổi
        // MAX_VALUE = 200;  // Error: cannot assign a value to final variable

        final Person person = new Person("John");
        // person = new Person("Alice");  // Error: cannot reassign final reference

        // Sử dụng final class
        FinalClass obj = new FinalClass();
        obj.display();

        // Sử dụng class với final method
        ChildClass child = new ChildClass();
        child.normalMethod();  // Phương thức đã override
        child.finalMethod();   // Phương thức từ lớp cha (không thể override)
    }
}

// final class
final class FinalClass {
    public void display() {
        System.out.println("Đây là final class");
    }    
}
// Error: không thể kế thừa từ final class
// class ChildOfFinalClass extends FinalClass {}


//Class với final method
class ParentClass {

    // Final method - không thể override
    public final void finalMethod() {
        System.out.println("Đây là final method");
    }

    // Phương thức bình thường - có thể override
    public void normalMethod() {
        System.out.println("Phương thức bình thường trong lớp cha");
    }
}

class ChildClass extends ParentClass {
    // Error: không thể override final method
    // @Override
    // public void finalMethod() {} 

    // Override phương thức bình thường
    @Override
    public void normalMethod() {
        System.out.println("Phương thức đã được override trong lớp con");
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
