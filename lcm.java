public class lcm{
    public static void main(String[] args){
        int a = 25, b = 15, gcd=1;

        //To find factors
        for(int i=1; i<=a && i<=b; i++){

            //To check common factors
            if(a%i == 0 && b%i == 0)
                gcd = i;
        }

        //To find lcm
        int LCM = (a*b)/gcd;
        System.out.println("LCM: " + LCM);
    }
}