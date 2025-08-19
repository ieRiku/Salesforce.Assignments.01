// Write a program, merge two lists in java

import java.util.List;
import java.util.ArrayList;

class F1{
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("kolkata");
        list1.add("chennai");

        list2.add("shimla");
        list2.add("delhi");
        list2.add("guava");
        list2.add("mango");
        
        List<String> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        for(int i = 0; i < size1; i++) {
            result.add(list1.get(i));
        }
        for(int i = 0; i < size2; i++) {
            result.add(list2.get(i));
        }

        System.out.println("Combined List: " + result);
    }
}