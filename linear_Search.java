//To search element in array using linear search

public class linear_Search{
    static int find(int arr[], int len, int num){

        //Traverse all the element and return index of that element when its found otherwise return -1
        for(int i=0; i<len; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {12, 21, 34, 11, 10, 6, 45};
        int len = arr.length;

        int num = 10;
        int index = find(arr, len, num);
        if(index == -1){
            System.out.println("Element is not found");
        }
        else
            System.out.println( num + " is found at: " + index);
    }
}


//Time complexity = O(n)