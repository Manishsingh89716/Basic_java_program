//To perform merge sort

public class mergeSort{
    public static void display(int[] arr, int len){
        for(int i=0; i<len; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {2,8,4,14,16,19,11,72,67,84};
        int len = arr.length;
        display(arr, len);

        mergesort(arr, 0, len-1);
        display(arr, len);
    }

    static void mergesort(int[] arr, int left, int right){
        int mid;
        if(left < right){
            mid = (left + right)/2;

            //Recursive call to sort first and second half subarray
            mergesort(arr, left, mid);
            mergesort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    //After sorting this function merge sorted array
    static void merge(int[] arr, int left, int mid, int right){
        int i,j,k;
        int n1 = mid - left+1;
        int n2 = right - mid;

        //create temp array to store left and right subarray
        int Left[] = new int[n1];
        int Rigth[] = new int[n2];

        //copy elements into temp array
        for(i=0; i<n1; i++)
            Left[i] = arr[left + i];
        for(j=0; j<n2; j++)
            Rigth[j] = arr[mid + 1 + j];

        //merge array back
        i = 0;
        j = 0;
        k = left;

        while(i<n1 && j<n2){
            //place smaller element first into array
            if(Left[i] <= Rigth[j]){
                arr[k] = Left[i];
                i++;
            }
            else{
                arr[k] = Rigth[j];
                j++;
            }
            k++;
        }

        //place remaining elements of left subarray
        while (i<n1){
            arr[k] = Left[i];
            i++;
            k++;
        }

        //place remaining elements of right subarray
        while (j<n2){
            arr[k] = Rigth[j];
            j++;
            k++;
        }
    }
}

//Time complexity = O(nlogn)
