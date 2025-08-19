// How to swap two numbers without using a third variable

class F2 {
public static void main(String[] args) {
        int a1 = 10;
        int a2 = 20;

        System.out.println("Original values:");
        a1 = a1+a2;
        a2 = a1-a2;
        a1 = a1-a2;

        System.out.println("Swapped values:");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
    }
}
