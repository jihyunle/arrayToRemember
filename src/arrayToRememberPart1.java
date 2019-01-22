/*
* Create a program that prompts for 5 words and saves those words to a variable.
*
* The program remembers the history of the variable because the variable is an array.
*
* Next use a for loop to print the words to the console in the order the user entered them.
*
* Print the history whenever the user types the word "History",
*
* otherwise save the word that is entered.*/

import java.util.Scanner;

public class arrayToRememberPart1 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);

        int numWords = 5;
        String[] wordList = new String[numWords];

        // prompt for words and save them to an array
        for(int i=0; i<numWords; i++){
            System.out.println("Enter a word: ");
            String temp = keyboard.next();

            // if input is not "history", store it in array
            // if "history" is entered, display the array contents
            if(! temp.equalsIgnoreCase("history")){
                wordList[i] = temp; // make sure the variable you want to assign value to is on the left side of eqn
            }else{
                break;
            }

        }

        // print the words in the order entered
        System.out.println("You entered the following: ");
        for(int j=0; j<numWords; j++){
            System.out.println(wordList[j] + " ");
        }

        keyboard.close();
        System.exit(0);
    }
}
