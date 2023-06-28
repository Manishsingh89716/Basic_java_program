//To print armstrong number: Armstrong number is the cube sum of digits of its integers

public class Armstrong{
    public static void main(String[] args){
        int n, count=0, a, b, c, sum=0;
        System.out.println("Armstrong number between 1 to 500: ");

        for(int i=50; i<=500; i++){
            n = i;
            while(n>0){
                b = n%10;
                sum+= (b*b*b);
                n = n/10;
            }
            if(sum == i){
                System.out.println(i + " ");
            }
            sum = 0;
        }
    }
}


//Time complexity = O(1)
//Space complexity = O(1)