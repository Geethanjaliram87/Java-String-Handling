package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();
        System.out.println("Characters in the string:");
        for (char c : charArray) {
            System.out.println(c);
        }
        sc.close();
    }
}
