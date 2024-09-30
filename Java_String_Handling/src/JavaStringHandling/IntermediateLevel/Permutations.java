package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find its permutations:");
        String str = sc.nextLine();
        permute(str, "");
        sc.close();
    }

    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String restOfString = str.substring(0, i) + str.substring(i + 1);
            permute(restOfString, result + ch);
        }
    }
}
