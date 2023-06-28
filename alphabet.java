//To check given alphabet is vowel or consonant

import java.util.Scanner;

public class alphabet{
    static void checkAlphabet(char x){

        //To check condition
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
            System.out.println("It is vowel.");

        else
            System.out.println("It is consonant.");
    }

     public static void main(String[] args){
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        x = sc.next().charAt(0);

        checkAlphabet(x);
    }
}


//Time complexity = O(n)