package oop.MediaLibrary;

public abstract class Platform {

    String name;
    String author;
    String genre;
    
    double length;

    public Platform(){}
    
    public Platform(String name){
        this.name = name;
    }

    public Platform(String name, String author){
        this.name = name;
        this.author = author;
    }

    public Platform(String name, String author, String genre, double length){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.length = length;
    }

    public abstract void DisplayEntry();
    public abstract String EntryLength();

    public void SetName(String name){
        this.name = name;
    }

    public void SetAuthor(String author){
        this.author = author;
    }

    public void SetGenre(String genre){
        this.genre = genre;
    }

    public void SetLength(double length){
        this.length = length;
    }

    public String GetName(){
        return name;
    }

    public String GetAuthor(){
        return author;
    }

    public String GetGenre(){
        return genre;
    }

    public double GetLength(){
        return length;
    }
     
}
