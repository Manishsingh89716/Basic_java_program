
public class swaping{
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a: " + a + " and value of b: " + b);
    }

    public static void main(String[] args){
        int a = 10, b = 12;
        swap(a, b);
    }
}
