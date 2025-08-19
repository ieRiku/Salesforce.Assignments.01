// Check a vowel is prent in a string

class F3 {
    public static void main(String[] args) {
        String s1 = "abcdefgh";
        boolean vowelPresent = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            char c = s1.charAt(i);
            for (char v : vowels) {
                if (c == v) {
                    vowelPresent = true;
                    break;
                }
            }
            if (vowelPresent) {
                break;
            }
        }

        if(vowelPresent == true) {
            System.out.println("Vowel is present: " + s1);
        } else {
            System.out.println("Vowel is absent: " + s1);
        }
    }
}
