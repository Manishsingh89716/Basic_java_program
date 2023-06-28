public class compare{
    public static int compareNum(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }

        else if(b>=a && b>=c){
            return b;
        }

        else{
            return c;
        }
    }

    public static void main(String[] args){
        int x, y, z, largest;

        x = 43;
        y = 12;
        z = 45;

        largest = compareNum(x, y, z);
        System.out.println(largest + " is the largest number");
    }
}
