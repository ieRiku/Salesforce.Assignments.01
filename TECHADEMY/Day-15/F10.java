// Sorting an array in java

import java.util.Arrays;

class F10{

    static int[] bubbleSort(int[] arr){
        int len = arr.length;

        for(int i=len-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {43,63,234,634,123,234,634,12,34,56,78,90};
        int arr2[] = {43,63,234,634,123,234,634,12,34,56,78,90};

        
        // Sorting the array using Arrays.sort() method
        //Arrays.sort(arr);
        
        //System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.print("Sorted Array: ");
        arr2 = bubbleSort(arr2);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
            if(i!=arr2.length -1)
                System.out.print(", ");
        }
    }
}