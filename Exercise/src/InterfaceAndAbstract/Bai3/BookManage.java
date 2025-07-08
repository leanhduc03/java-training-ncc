/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leanh
 */
public class BookManage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int a;
        int b = 0;
        do {
            System.out.print("\n1. Insert new book\n"
                    + "2. View list of books\n"
                    + "3. Average Price\n"
                    + "4. Exit\n"
                    + "Chọn chức năng: ");
            a = sc.nextInt();
            sc.nextLine();

            Book book = new Book();
            switch (a) {
                case 1:
                    book.setId((b++));
                    System.out.print("Nhập name: ");
                    book.setName(sc.nextLine());

                    System.out.print("Nhập PublishDate: ");
                    book.setPublishDate(sc.nextLine());

                    System.out.print("Nhập Author: ");
                    book.setAuthor(sc.nextLine());

                    System.out.print("Nhập language: ");
                    book.setLanguage(sc.nextLine());
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Giá " + (i + 1) + " : ");
                        book.setPrice(i, sc.nextInt());
                    }
                    sc.nextLine();
                    books.add(book);
                    System.out.println("Đã thêm book");
                    break;
                case 2:
                    for (Book abook : books) {
                        abook.display();
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (Book abook : books) {
                        abook.calculate();
                        abook.display();
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn k hợp lệ");
            }
        } while (a != 4);
    }
}
