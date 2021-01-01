package oop.MediaLibrary;

import java.util.HashMap;

public class Anime extends Platform {
    boolean completed;
    int seasons;
    HashMap<String, String> characterCast;

    public Anime(){}

    public Anime(String name){
        super(name);
    }

    public Anime(String name, String author){
        super(name, author);
    }

    public Anime(String name, String author, String genre, double length){
        super(name, author, genre, length);
    }

    public String EntryLength(){
        if (length > 60){
            int hours = (int) length / 60;
            int minutes = (int) length % 60;
            return (hours + "h " + minutes + "m");
        }
        else{
            return (length + "m");
        }
    }
    public void DisplayEntry(){
        System.out.println(name + "\n" + author + "\n" + genre + "\n" + this.EntryLength());
    }

    public void SetComplete(boolean completed){
        this.completed = completed;
    }

    public void SetSeasons(int seasons){
        this.seasons = seasons;
    }

    public void ModCharacterCast(String character, String voiceActor){
        characterCast.put(character, voiceActor);
    }

    public void AddCharacterKey(String character){
        characterCast.put(character, "");
    }

    public boolean GetComplete(){
        return completed;
    }

    public int GetSeasons(){
        return seasons;
    }

    public String GetCharacterCast(){
        StringBuilder sb = new StringBuilder();
        for (String entry : characterCast.keySet()){
            sb.append(entry + "\n");
        }
        return sb.toString();
    }
    
}
