public class evenOdd{
    public static void checkEvenodd(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        for(int i = 0; i<=10; i++){
            checkEvenodd(i);
        }
    }
}


//Time complexity = O(1)
//Space complexity = O(1)