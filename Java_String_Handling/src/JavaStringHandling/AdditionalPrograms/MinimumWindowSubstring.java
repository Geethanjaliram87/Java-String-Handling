package JavaStringHandling.AdditionalPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String s = sc.nextLine();
        System.out.println("Enter the target string:");
        String t = sc.nextLine();
        System.out.println("Smallest window: " + minWindow(s, t));
        sc.close();
    }

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = targetMap.size();
        int l = 0, r = 0, formed = 0;
        HashMap<Character, Integer> windowCounts = new HashMap<>();
        int[] ans = {-1, 0, 0}; // length, left, right

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (targetMap.containsKey(c) && windowCounts.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (targetMap.containsKey(c) && windowCounts.get(c).intValue() < targetMap.get(c).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
