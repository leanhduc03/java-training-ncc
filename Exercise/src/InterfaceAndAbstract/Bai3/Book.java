/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAndAbstract.Bai3;

/**
 *
 * @author leanh
 */
public class Book implements IBook {

    int id;
    String name, publishDate, author, language;
    float averagePrice;
    int[] PriceList = new int[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void display() {
        System.out.println("ID = "+id+", name=" + name + ", publishDate=" + publishDate + ", author=" + author + ", language=" + language + ", averagePrice=" + averagePrice);
        for (int i = 0; i < PriceList.length; i++) {
            System.out.println("PriceList " + (i + 1) + ": " + PriceList[i]);
        }
    }

    public void calculate() {
        averagePrice = (float) (PriceList[0] + PriceList[1] + PriceList[2] + PriceList[3] + PriceList[4]) / 5;
    }

    public void setPrice(int index, int value) {
        PriceList[index] = value;
    }
}
