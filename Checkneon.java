//To check given number is neon number or not.

import java.util.Scanner;

public class Checkneon{
    static boolean checkneon(int n){
        int square = n*n;
        int sum = 0;

        while(square > 0){
            //find remainder
            int rem = square%10;

            //add remainder to current sum
            sum+=rem;

            square/=10;
        }

        //check sum of digit is equal or not

        if(sum==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        if(checkneon(n))
            System.out.println(n + " is neon number");

        else
            System.out.println(n + " is not neon number");
    }
}


//Time complexity = O(n):- n is number of digit