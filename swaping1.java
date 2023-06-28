
public class swaping1{
    public static void swap(int a, int b){
        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("Value of a: " + a + " value of b: " + b);
    }
    public static void main(String[] args){
        int a = 16, b = 23;
        swap(a, b);
    }
}
