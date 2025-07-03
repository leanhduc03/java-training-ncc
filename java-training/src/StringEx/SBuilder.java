/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEx;

/**
 *
 * @author leanh
 */
public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        
        sb.append(" World");
        System.out.println(sb);
        
        StringBuilder sb1 = new StringBuilder("Hello");
        for (int i = 0; i < 5; i++) {
            sb1.append(" "+i);  // Không tạo đối tượng mới, chỉ sửa đổi đối tượng hiện có
        }
        System.out.println(sb1);
    }
}
