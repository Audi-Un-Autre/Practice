package data_structures;

import java.util.Scanner;
import java.util.HashMap;

// Hashmaps & charArrays

public class permutation {

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        String word1, word2;

        System.out.print("Enter the first word: ");
        word1 = ui.nextLine();

        System.out.print("Enter the second word:");
        word2 = ui.nextLine();

        ui.close();

        if (IsPerm(word1, word2))
            System.out.println("These words are permutations.");
        else
            System.out.println("These words are not permutations.");
    }

    private static boolean IsPerm(String word1, String word2){

        //length of words must be the same before judging if its a permutation & must not be empty
        if (word1.length() != word2.length()) return false;
        if (word1.length() == 0 || word2.length() == 0) return false;

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        HashMap<Character, Integer> word1Map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> word2Map = new HashMap<Character, Integer>();

        // map each character
        for (int i = 0; i < word1.length(); i++){
            //check if character is mapped or not
            if (word1Map.containsKey(word1Array[i]))
                continue;
            else{
                word1Map.put(word1Array[i], 1);
            }

            if (word2Map.containsKey(word2Array[i]))
                continue;
            else{
                word2Map.put(word2Array[i], 1);
            }

            // compare each character and update counts
            for (int k = i + 1; k < word1.length(); k++){
                if (word1Array[i] == word1Array[k])
                    word1Map.put(word1Array[i], word1Map.get(word1Array[i]) + 1);
                
                if (word2Array[i] == word2Array[k])
                    word2Map.put(word2Array[i], word1Map.get(word2Array[i]) + 1);
            }
        }

        return word1Map.equals(word2Map);
    }
}
