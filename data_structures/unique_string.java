package data_structures;

import java.util.Scanner;
import java.util.HashMap;

public class unique_string {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter a word or phrase and I'll see if it's unique or not: ");

        String input = ui.nextLine();
        ui.close();

        if (input.length() == 0)        
            System.out.println("No input :(.");
        else{
            if(IsUnique(input))
                System.out.println("This word/phrase is unique.");
            else
                System.out.println("This word/phrase is not unique.");
        }
    }

    private static boolean IsUnique(String word){
        char[] wordArray = word.toCharArray();

        // if char is a space, ignore.
        // else compare each char, the first occurence of same letter will exit function
        for (int i = 0; i < wordArray.length; i++){
            if (wordArray[i] == ' ')
                continue;
            for (int k = i + 1; k < wordArray.length; k++){
                if (wordArray[i] == wordArray[k])
                    return false;
            }
        }
        return true;
    }
}
