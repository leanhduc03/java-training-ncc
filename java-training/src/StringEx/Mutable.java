/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEx;

/**
 *
 * @author leanh
 */
public class Mutable {
    public static void main(String[] args) {
        String h1 ="hello";
        System.out.println(h1); 
        h1 += " world"; // Tạo ra một đối tượng String mới, h1 không thay đổi
        System.out.println(h1); 
        for (int i = 0; i < 5; i++) {
            h1 = h1 +" "+ i ;  // Mỗi lần lặp tạo ra một đối tượng String mới
        }
        System.out.println(h1); 
    }
}
