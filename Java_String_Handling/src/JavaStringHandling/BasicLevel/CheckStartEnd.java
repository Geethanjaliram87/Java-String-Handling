package JavaStringHandling.BasicLevel;

public class CheckStartEnd {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean startsWith = str.startsWith("Hello");
        boolean endsWith = str.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWith);
        System.out.println("Ends with 'World!': " + endsWith);
    }
}
