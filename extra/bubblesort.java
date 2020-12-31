package extra;

import java.util.Scanner;
import java.util.ArrayList;

//recursive bubble sort with inclusion of leading zeros in input, keeping it as much non string operation as possible
//ArrayLists

public class bubblesort{

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        do{
            System.out.print("Enter a number to sort : ");
        } while(!ui.hasNextInt());

        // preserve length of number in case of leading zeros and parse to int
        String inputString = ui.nextLine();
        int length = inputString.length();
        int input = Integer.parseInt(inputString);
        ui.close();

        ArrayList<Integer> splicedNumber = new ArrayList<Integer>();
        splicedNumber = splice(length, input);

        System.out.println("Your number in order from highest to lowest is : " + sortHL(splicedNumber));
        System.out.println("Your number in order from lowest to highest is : " + sortLH(splicedNumber));
    }

    private static String sortHL(ArrayList<Integer> number){
        boolean notSorted = false;

        for (int i = 0; i < number.size(); i++){
            if (i != number.size() - 1 && (number.get(i) < number.get(i + 1))){
                int tempHold = number.get(i);
                number.set(i, number.get(i + 1));
                number.set(i + 1, tempHold);

                notSorted = true;
            }
            if (i == number.size() - 1 && notSorted)
                sortHL(number);
        }
        
        return number.toString();
    }

    private static String sortLH(ArrayList<Integer> number){
        boolean notSorted = false;

        for (int i = 0; i < number.size(); i++){
            if (i != number.size() - 1 && (number.get(i) > number.get(i + 1))){
                int tempHold = number.get(i);
                number.set(i, number.get(i + 1));
                number.set(i + 1, tempHold);

                notSorted = true;
            }
            if (i == number.size() - 1 && notSorted)
                sortLH(number);
        }
        
        return number.toString();
    }

    // non string method
    private static ArrayList<Integer> splice(int length, int number){
        ArrayList<Integer> splicedNumber = new ArrayList<Integer>();

        while (number > 0){
            splicedNumber.add(number % 10);
            number = number / 10;
        }

        ArrayList<Integer> reverseSplice = new ArrayList<Integer>();
        for (int i = splicedNumber.size() - 1; i >= 0; i--)
            reverseSplice.add(splicedNumber.get(i));

        //leading zeros
        if (reverseSplice.size() != length){
            int difference = length - reverseSplice.size();
            for (int i = 0; i < difference; i++)
                reverseSplice.add(i, 0);
        }

        return reverseSplice;
    }
}