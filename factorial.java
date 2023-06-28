//To find factorial

import java.util.Scanner;

public class factorial{
    static int find_fact(int n){
        if(n == 0)
            return 1;

        else
            return n*find_fact(n-1);
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        System.out.println("Factorial: " + find_fact(num));
    }
}


//Time complexity = O(n)
//Space complexity = O(n)