/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai1;

/**
 *
 * @author leanh
 */
public abstract class Phone {
    public abstract void insertPhone(String name, String  phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newphone);
    public abstract void searchPhone(String name);
    public abstract void sort();
}
