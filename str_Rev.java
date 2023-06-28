//To reverse string using loop

public class str_Rev{
    public static void main(String[] args){
        int len, i;
        String r1 = "kitiR";
        String r2 = "";

        len = r1.length();
        for(i = len-1; i>=0; i--){
            r2 += r1.charAt(i);
        }
        System.out.println(r2);
    }
}


//Time complexity = O(n)