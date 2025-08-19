// Find second larget number in array

class F6{
    public static void main(String[] args) {
        int arr[] = {200,4,6,1,7,2,78,3,5,9,8};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(arr.length < 2) {
            System.out.println("Array length must be > 2.");
            return;
        }

        largest = arr[0];
        for (int i=1; i <arr.length; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }        
        }

        System.out.println("Value: " + secondLargest);
    }
}