import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.next().toLowerCase(Locale.ROOT).startsWith("j"));
    }
}