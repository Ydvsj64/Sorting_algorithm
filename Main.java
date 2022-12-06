import java.util.Scanner;

public class Main {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i= 0;i<n-1 ;i++)
        {
            int min_idx = i;
            for(int j=i+1; j<n ;j++)
            {
                if(arr[j] < arr[min_idx]) min_idx=j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j = i+1; j > 0 ; j--){
                if(arr[j-1] > arr[j])
                {
                 int temp = arr[j-1];
                 arr[j-1] = arr[j];
                 arr[j] = temp;
                }
            }
        }
    }
    public static void print(int[] arr){
        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = {12, 4, 25, 9, 45,-54,0,6,11};
        System.out.println("Array Sorted using Bubble Sort");
        bubbleSort(arr);
        print(arr);
        System.out.println("Array Sorted using Selection Sort");
        selectionSort(arr);
        print(arr);
        System.out.println("Array Sorted using insertion Sort");
        insertionSort(arr);
        print(arr);


    }
}