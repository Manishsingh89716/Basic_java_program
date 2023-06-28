import java.util.*;

public class lcm1{
    static int Gcd(int x, int y)
    {
        if (x == 0)
            return y;
        return Gcd(y % x, x);
    }

    static int findLcm(int x, int y) {

        return (x / Gcd(x, y)) * y;
    }

    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();

        System.out.println("LCM: " + findLcm(a,b));
    }
}
