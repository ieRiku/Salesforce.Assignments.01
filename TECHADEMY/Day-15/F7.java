// Sum of all elements in an integer array

class F7 {
    public static void main(String[] args) {
        int arr[] = {43,63,234,634,123,234,634,12,34,56,78,90};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all elements: " +sum);
    }    
}