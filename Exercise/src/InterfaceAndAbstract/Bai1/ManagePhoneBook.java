/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai1;

import java.util.Scanner;

/**
 *
 * @author leanh
 */
public class ManagePhoneBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        PhoneBook book = new PhoneBook();
        do {
            System.out.print("\nPHONEBOOK MANAGEMENT SYSTEM\n"
                    + "\n"
                    + "1. Insert Phone\n"
                    + "\n"
                    + "2. Remove Phone\n"
                    + "\n"
                    + "3. Update Phone\n"
                    + "\n"
                    + "4. Search Phone\n"
                    + "\n"
                    + "5. Sort\n"
                    + "\n"
                    + "6. Exit\n"
                    + "Chọn chức năng : ");
            a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.print("nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("nhập sđt: ");
                    String phone = sc.nextLine();
                    book.insertPhone(name, phone);
                    break;
                case 2:
                    System.out.print("nhập tên: ");
                    book.removePhone(sc.nextLine());
                    break;
                case 3:
                    System.out.print("nhập tên: ");
                    String name3 = sc.nextLine();
                    System.out.print("nhập sđt: ");
                    String phone3 = sc.nextLine();
                    book.updatePhone(name3, phone3);
                    break;
                case 4:
                    System.out.print("nhập tên: ");
                    book.searchPhone(sc.nextLine());
                    break;
                case 5:
                    book.sort();
                    break;
                case 6:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");

            }
        } while (a != 6);
    }
}
