/*
Type in the names of the last ten presidents in the order they were elected.

When you are done, enter the word history.

Your program should display their names starting with the most recent.

For your convenience, the names of the last 10 presidents are:

Kennedy, Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama
*/

import java.util.Scanner;

public class arrayToRememberPart2 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);

        String[] presidents = new String[10];

        System.out.println("Please enter the names of the last ten" +
                " presidents in the order they were elected, " +
                "starting with President Kennedy. " +
                "Press 'Enter' after each name: ");
        for(int i=0; i<presidents.length; i++){
            System.out.print(i+1 + ": ");
            presidents[i] = keyboard.next();
        }

        // enter the word history
        System.out.println("Would you like to see your history?: Y or N");
        String temp = keyboard.next();
        if(temp.equalsIgnoreCase("y")){
            System.out.println("Here is your history starting from the most recent entry: ");
            for(int j=presidents.length-1; j>=0; j--){
                System.out.println(presidents[j]);
            }
        }


        keyboard.close();
        System.exit(0);

    }
}
