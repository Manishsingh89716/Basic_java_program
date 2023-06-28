public class HCF{
    static int GCD(int a, int b){
        if(a == 0)
            return b;

        if(b == 0)
            return a;

        if(a == b)
            return a;

        if(a > b)
            return GCD(a - b, b);
        return GCD(a, b - a);
    }

    public static void main(String[] args){
        int a = 100, b = 88;
        System.out.println("GCD: " + GCD(a, b));
    }
}
