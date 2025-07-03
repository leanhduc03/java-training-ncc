/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEx;

/**
 *
 * @author leanh
 */
public class SBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        
        sb.append(" World");
        System.out.println(sb);
        
        sb.insert(5, " Java");
        System.out.println(sb);
        
        sb.replace(6, 10, "Miss");
        System.out.println( sb);
        
    }
}
