package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        System.out.println("Number of words: " + words.length);
        sc.close();
    }
}
