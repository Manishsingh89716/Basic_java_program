//To sort an array

import java.util.*;
public class sortArray{
    public static void main(String[] args){
        int arr[] = {23, 45, 21, 17, 76, 65};
        System.out.println("Array before sorting: ");
        for(int num: arr){
            System.out.println(num + " ");
        }

        //sort array in ascending order
        Arrays.sort(arr);
        System.out.println("Array after sorting: ");
        for(int num: arr){
            System.out.println(num + " ");
        }

    }
}


//Time complexity = O(1)