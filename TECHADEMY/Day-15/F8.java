// Reverse a string in java

class F8{

    static String reverseString(String str) {
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }

    static String reverseString1(String str) {
        int len = str.length();

        char[] chars = str.toCharArray();
        for (int i = 0; i< len/2; i++){
            char temp = chars[i];
            chars[i] =chars[len -1 -i];
            chars[len-1 -i] = temp;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reverse = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
    }
}