/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai2;

/**
 *
 * @author leanh
 */
public class News implements INews {

    int ID;
    String Title, PublishDate, Author, Content;
    float AverageRate;
    int[] Ratelist = new int[3];

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    @Override
    public void Display() {
        System.out.println("News{" + "Title=" + Title + ", PublishDate=" + PublishDate + ", Author=" + Author + ", Content=" + Content + ", AverageRate=" + AverageRate + '}');
        for (int i = 0; i < Ratelist.length; i++) {
            System.out.println("Ratelist " + (i + 1) + ": " + Ratelist[i]);
        }
    }

    public void setRate(int index, int rate) {
        Ratelist[index] = rate;
    }

    public void Calculate() {
        this.AverageRate = (float) (Ratelist[0] + Ratelist[1] + Ratelist[2]) / 3;
    }
}
