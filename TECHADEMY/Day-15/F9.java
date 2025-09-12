// Find factorial in java

import java.util.Scanner;

class F9{

    static int fact(int n){
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " +num+ " is: " +fact(num));
    }
}