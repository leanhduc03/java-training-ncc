/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leanh
 */
public class NewsManage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        ArrayList<News> newList = new ArrayList<>();
        do {
            System.out.print("1. Insert news\n"
                    + "2. View list news\n"
                    + "3. Average rate\n"
                    + "4. Exit\n"
                    + "Chọn chức năng: ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    News news = new News();
                    System.out.print("Nhập ID: ");
                    news.setID(sc.nextInt());
                    sc.nextLine(); // Đọc bỏ dòng mới

                    System.out.print("Nhập title: ");
                    news.setTitle(sc.nextLine());

                    System.out.print("Nhập PublishDate: ");
                    news.setPublishDate(sc.nextLine());

                    System.out.print("Nhập Author: ");
                    news.setAuthor(sc.nextLine());

                    System.out.print("Nhập Content: ");
                    news.setContent(sc.nextLine());

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Đánh giá " + (i + 1) + " : ");
                        news.setRate(i, sc.nextInt());
                    }
                    sc.nextLine();
                    newList.add(news);
                    System.out.println("Đã thêm news");
                    break;
                case 2:
                    for (News new2 : newList) {
                        new2.Display();
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (News new2 : newList) {
                        new2.Calculate();
                        new2.Display();
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn k hợp lệ");;
            }
        } while (a!=4);
    }
}
