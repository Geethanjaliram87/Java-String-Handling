package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter the character to count:");
        char target = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + target + "': " + count);
        sc.close();
    }
}
