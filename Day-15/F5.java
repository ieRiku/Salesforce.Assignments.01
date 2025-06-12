// Check if a given number is prime

import java.util.Scanner;
import java.lang.Math;

public class F5 {

    static boolean isPrime(int n){
        int num = n;
        for(int i=2;i<= Math.sqrt(n); i++){
            if(num %i == 0){
                //System.out.println("Number is not prime: " + num);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        
        if(result == true){
            System.out.println("Number is prime: " + n);
        } else {
            System.out.println("Number is not prime: " + n);
        }
        
        sc.close();
    }
}
