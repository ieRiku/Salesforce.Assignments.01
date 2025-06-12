// Write a prog, how to find a string in a text file in java

import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Files;

class f4 {
    public static void main(String[] args) {
        String filePath = "Readme.txt";
        String s1 = "java";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            boolean found = false;

            for (String line : lines) {
                if (line.contains(s1)) {
                    System.out.println("String present in file: " + line);
                    found = true;
                }
            }

            if (found == false) {
                System.out.println("String not Present in file");
            }

        } catch (Exception e) {
            System.err.println("File not present: " + e.getMessage());
        }
    }
}
