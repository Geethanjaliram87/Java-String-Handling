package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
        sc.close();
    }
}
