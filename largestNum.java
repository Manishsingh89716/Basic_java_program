//To find large element in an array

public class largestNum{
    static int findNum(int[] arr){
        int i;
        //initialize maximum
        int max = arr[0];

        //iterate till the last element
        for(i=1; i<arr.length; i++){

            //compare each element to the current
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int arr[] = {23, 45, 21, 34};
        System.out.println(findNum(arr));
    }
}
