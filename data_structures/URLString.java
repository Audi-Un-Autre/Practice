package data_structures;

import java.util.*;

public class URLString {
    
    public static void main(String[] args){
        String input;
        Scanner ui = new Scanner(System.in);

        System.out.print("Enter a word or phrase and I will toURLify it: ");

        input = ui.nextLine();
        ui.close();

        if (input.length() == 0)
            System.out.println("No input :(.");
        else
            System.out.println("Here is your URL: " + ToPercent(input));
    }

    private static String ToPercent(String word){
        StringBuilder sb = new StringBuilder();        
        char[] wordArray = word.toCharArray();

        // piece word back together where spaces = %20
        for (int i = 0; i < wordArray.length; i++){
            if (wordArray[i] == ' '){
                sb.append("%20");
                continue;
            }
            sb.append(wordArray[i]);
        }
        return sb.toString();
    }
}
