package oop.MediaLibrary;

import java.util.ArrayList;

public class Manga extends Platform {
    private boolean completed;
    private boolean oneshot;
    private int volumes;
    private ArrayList<String> characters;

    public Manga(){}
    
    public Manga(String name){
        super(name);
    }

    public Manga(String name, String author){
        super(name, author);
    }

    public Manga(String name, String author, String genre, double length){
        super(name, author, genre, length);
    }

    public Manga(String name, String author, String genre, double length, boolean completed, boolean oneshot, int volumes){
        super(name, author, genre, length);
        this.completed = completed;
        this.oneshot = oneshot;
        this.volumes = volumes;
    }

    public String EntryLength(){
        return length + "pg";
    }

    public void DisplayEntry(){
        System.out.println(name + "\n" + author + "\n" + genre + "\n" + this.EntryLength());
    }

    public void SetComplete(boolean completed){
        this.completed = completed;
    }

    public void SetOneshot(boolean oneshot){
        this.oneshot = oneshot;
    }

    public void SetVolumes(int volumes){
        this.volumes = volumes;
    }

    public void AddCharacter(String character){
        characters.add(character);
    }

    public boolean GetComplete(){
        return completed;
    }

    public boolean GetOneshot(){
        return oneshot;
    }

    public int GetVolumes(){
        return volumes;
    }

    public String GetCharacters(){
        return characters.toString();
    }

    public void removeCharacter(String character){
        for (int i = 0; i < characters.size(); i++){
            if (characters.get(i).toLowerCase().equals(character.toLowerCase()))
                characters.remove(i);
        }
    }

}
