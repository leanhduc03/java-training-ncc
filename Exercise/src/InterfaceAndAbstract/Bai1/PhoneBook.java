/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author leanh
 */
public class PhoneBook extends Phone {

    ArrayList<PhoneEntry> phonelist = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneEntry entry : phonelist) {
            if (entry.getName().equals(name)) {
                if (!entry.getPhone().contains(phone)) {
                    entry.setPhone(entry.phone + " : " + phone);
                }
                return;
            }
        }
        phonelist.add(new PhoneEntry(name, phone));

    }

    @Override
    public void removePhone(String name) {
        for (PhoneEntry entry : phonelist){
            if(entry.getName().equals(name)){
                phonelist.remove(entry);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng có tên " + name);
    }

    @Override
    public void updatePhone(String name, String newphone){
        for (PhoneEntry entry : phonelist){
            if(entry.getName().equals(name)){
                entry.setPhone(newphone);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng có tên " + name);
    }
    
    @Override
    public void searchPhone(String name){
        for (PhoneEntry entry : phonelist){
            if(entry.getName().equals(name)){
                System.out.println(entry.name + " : " + entry.phone);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng có tên " + name);
    }
    
    @Override
    public void sort(){
        Collections.sort(phonelist, Comparator.comparing(PhoneEntry::getName));
        System.out.println(phonelist);
    }
    public class PhoneEntry {

        String name;
        String phone;

        public PhoneEntry(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return name + ":" + phone;
        }
    }
}
