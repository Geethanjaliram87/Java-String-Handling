package JavaStringHandling.BasicLevel;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "java proGramming";
        boolean caseSensitive = str1.equals(str2);
        boolean caseInsensitive = str1.equalsIgnoreCase(str2);
        System.out.println("Case-sensitive comparison: " + caseSensitive);
        System.out.println("Case-insensitive comparison: " + caseInsensitive);
    }
}
