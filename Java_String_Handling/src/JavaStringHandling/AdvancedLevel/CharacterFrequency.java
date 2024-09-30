package JavaStringHandling.AdvancedLevel;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        printCharFrequency(input);
        sc.close();
    }

    public static void printCharFrequency(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + ": " + frequencyMap.get(c));
        }
    }
}

