/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author leanh
 */
public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        ArrayList<Student> students = new ArrayList<>();
        do {
            System.out.print("   1. Insert new Student\n"
                    + "\n"
                    + "   2. View list of Students\n"
                    + "\n"
                    + "   3. Search Students\n"
                    + "\n"
                    + "   4. Exit\n"
                    + "Chọn chức năng: ");
            try {
                a = sc.nextInt();
                sc.nextLine();
                switch (a) {
                    case 1:
                        Student student = new Student();
                        student.setID(b++);
                        try {
                            System.out.print("Enter full name: ");
                            student.setFullname(sc.nextLine());

                            System.out.print("Enter dob: ");
                            student.setDob(sc.nextLine());

                            System.out.print("Enter native: ");
                            student.setNativeS(sc.nextLine());

                            System.out.print("Enter phone: ");
                            student.setPhone(sc.nextLine());

                            System.out.print("Enter class: ");
                            student.setClassname(sc.nextLine());

                            System.out.print("Enter mobile: ");
                            student.setMobile(sc.nextInt());
                            students.add(student);
                            System.out.println("Thêm student thành công");

                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập đúng định dạng dữ liệu");
                            sc.nextLine();
                        } finally {
                            if (sc.hasNextLine()) {
                                sc.nextLine();
                            }
                        }
                        break;
                    case 2:
                        if (students.isEmpty()) {
                            System.out.println("Không có học sinh");
                        } else {
                            System.out.println("");
                            for (Student s : students) {
                                s.display();
                                System.out.println("");
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Nhập tên lớp: ");
                        String nameClass = sc.nextLine();
                        int c = 0;
                        for (Student s : students) {
                            if (s.getClassname().equals(nameClass)) {
                                s.display();
                                c++;
                            }
                        }
                        if (c == 0) {
                            System.out.println("Không tồn tại lớp");
                        }
                        break;
                    case 4:
                        System.out.println("Thoát");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập đúng số hợp lệ");
                sc.nextLine();
                a = 0;
            }
        } while (a != 4);
    }
}
