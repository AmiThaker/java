package control_flow;

public class PatternStars {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            System.out.println("*".repeat(i));  // Java 11+; for Java 8, use loop
        }
    }
}
