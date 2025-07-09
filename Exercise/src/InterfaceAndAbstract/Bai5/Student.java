/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai5;

/**
 *
 * @author leanh
 */
public class Student implements IStudent{
    int ID, mobile;
    String fullname, dob, nativeS, classname, phone;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNativeS() {
        return nativeS;
    }

    public void setNativeS(String nativeS) {
        this.nativeS = nativeS;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void display() {
        System.out.println( "Student{" + "ID=" + ID + ", mobile=" + mobile + ", fullname=" + fullname + ", dob=" + dob + ", nativeS=" + nativeS + ", classname=" + classname + ", phone=" + phone );
    }
    
}
