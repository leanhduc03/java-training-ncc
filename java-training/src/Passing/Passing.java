/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Passing;

/**
 *
 * @author leanh
 */
public class Passing {

    public static void main(String[] args) {
        // Kiểu nguyên thủy
        int x = 10;
        changeAge(x);
        System.out.println("x = " + x);  // Vẫn là 10

        // Kiểu tham chiếu
        Person person = new Person("John", 25);
        System.out.println("Person ban đầu: " + person);

        // Thay đổi thuộc tính
        person.setAge(30);// Thay đổi thuộc tính của đối tượng gốc
        System.out.println("Sau khi thay đổi thuộc tính: " + person);  // Tuổi thay đổi

        // Gán lại tham chiếu
        replacePerson(person);
        System.out.println("Sau khi gán lại tham chiếu: " + person);  // Không thay đổi
    }

    // Không thay đổi biến gốc
    static void changeAge(int n) {
        n = 20;  // Chỉ thay đổi bản sao
    }

    // Gán lại tham chiếu
    static void replacePerson(Person p) {
        p = new Person("Alice", 35);  // Chỉ thay đổi bản sao của tham chiếu
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " tuổi";
    }
}
