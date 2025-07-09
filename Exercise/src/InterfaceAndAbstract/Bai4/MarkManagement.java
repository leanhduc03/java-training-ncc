/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MarkManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StudentMark> studentList = new ArrayList<>();
        int a;
        int nextId = 1;

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
                a = scanner.nextInt();
                scanner.nextLine();

                switch (a) {
                    case 1:
                        StudentMark student = new StudentMark();
                        student.setID(nextId++);
                        try {
                            System.out.print("Enter full name: ");
                            student.setFullname(scanner.nextLine());

                            System.out.print("Enter class: ");
                            student.setClass(scanner.nextLine());

                            System.out.print("Enter semester: ");
                            student.setSemester(scanner.nextInt());

                            for (int i = 0; i < 5; i++) {
                                System.out.print("Nhập điểm cho môn học " + (i + 1) + ": ");
                                int mark = scanner.nextInt();

                                if (mark < 0 || mark > 10) {
                                    throw new InputMismatchException("Điểm trong khoảng 0-10");
                                }

                                student.setMark(i, mark);
                            }

                            studentList.add(student);
                            System.out.println("Thêm mark thành công");
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập đúng data format");
                            scanner.nextLine();
                        } finally {
                            if (scanner.hasNextLine()) {
                                scanner.nextLine();
                            }
                        }
                        break;

                    case 2:
                        if (studentList.isEmpty()) {
                            System.out.println("Student list is empty!");
                        } else {
                            System.out.println("");
                            for (StudentMark s : studentList) {
                                s.display();
                                System.out.println("");
                            }
                        }
                        break;

                    case 3:
                        if (studentList.isEmpty()) {
                            System.out.println("Danh sách học sinh trống");
                        } else {
                            System.out.println("\n");
                            for (StudentMark s : studentList) {
                                s.calculate();// Tính điểm trung bình
                                s.display();
                                System.out.println("");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Thoát");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhập số hợp lệ");
                scanner.nextLine();
                a = 0;
            }
        } while (a != 4);
    }
}
