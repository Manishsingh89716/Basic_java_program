import java.util.Scanner;

public class leapyear{
    public static void main(String[] args){
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc.nextInt();

        //To check the condition
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}


//Time complexity = O(1)
//Space complexity = O(1)