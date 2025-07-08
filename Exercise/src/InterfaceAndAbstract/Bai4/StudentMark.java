/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai4;

/**
 *
 * @author leanh
 */
public class StudentMark implements IStudentMark {

    int ID, semester;
    String fullname, Sclass;
    float AverageMark;
    int[] SubjectMarkList = new int[5];

    public float getAverageMark() {
        return AverageMark;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSClass() {
        return Sclass;
    }

    public void setClass(String Sclass) {
        this.Sclass = Sclass;
    }

    @Override
    public void display() {
        System.out.println("StudentMark{" + "ID=" + ID + ", semester=" + semester + ", fullname=" + fullname + ", Class=" + Sclass + ", AverageMark=" + AverageMark);
        for (int i = 0; i < SubjectMarkList.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + SubjectMarkList[i]);
        }
    }

    public void setMark(int index, int value) {
        SubjectMarkList[index] = value;
    }

    public void calculate() {
        AverageMark = (float) (SubjectMarkList[0] + SubjectMarkList[1] + SubjectMarkList[2] + SubjectMarkList[3] + SubjectMarkList[4]) / 5;
    }
}
