package org.example.tp_5_proxy;

public class RealBook implements Book {

    private String title;
    private String content;

    // constructor
    public RealBook(String title, String content) {
        this.title = title;
        this.content = content;
    }
    // méthode readBook() qui affiche simplement le contenu
    @Override
    public void readBook() {
        System.out.println(content);
    }
}

