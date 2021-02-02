package extra;

import java.util.*;

// See if a word is a palindrome and then check if its a permutation of a palindrome

// palindromes can be even-length and odd-lengthed:
// odd length palindromes pivot on a central character | pattern = 1 odd letter, the rest with even numbers
// even lengths palindromes are mirror images | pattern = even amount of letters all around

// SOLUTION : Map words in hashmaps. Even lengthed words should have all even number of keys. Odd lengthed words should have 1 odd key and the rest even keys.

public class permutation_palindrome{
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        System.out.print("Enter a word : " );
        String input = ui.nextLine();
        ui.close();

        if (IsPermutationPalindrome(input))
            System.out.println("This is a permutation of a palindrome!");
        else
            System.out.println("This is not a permutation of a palindrome.");

    }
    
    private static boolean IsPermutationPalindrome(String word){

        word = word.replaceAll("[^a-zA-Z]", "");
        word = word.toLowerCase();

        HashMap<Character, Integer> wordMap = new HashMap<Character, Integer>();
        // map out word and its characters
        for (int i = 0; i < word.length(); i++){

            // check if character has already been mapped
            if (wordMap.containsKey(word.charAt(i)))
                continue;
            else
                wordMap.put(word.charAt(i), 1);

            // map character and it's # of occurences
            for (int k = i + 1; k < word.length(); k++){
                if (word.charAt(i) == word.charAt(k))
                    wordMap.put(word.charAt(i), wordMap.get(word.charAt(i)) + 1);
            }
        }

        // check if word is even or odd length, check if the pattern allows for a permutation of a palindrome
        if (word.length() % 2 == 0){
            for (Integer e : wordMap.values()){
                if (e % 2 != 0)
                    return false; //there can be no odd values in an even palindrome, therefore not a palindrome and not a permutation of a palindrome
            }
        } else {
            for ( int i = 0; i < wordMap.size(); i++){
                int oddOccurence = 0;
                for (Integer o : wordMap.values()){
                    if (o % 2 != 0)
                        oddOccurence++;
                    if (oddOccurence > 1)
                        return false; //there can only be one odd value in an odd palindrome, therefor not a palindrome and not a permutation of a palindrome
                }
            }
        }

        return true;
    }
}