import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();
        System.out.println(number + "°F");
        double cels = ((number - 32.0) * (5.0/9.0));
        System.out.println(cels + "°C");
        System.out.printf("%.0f", cels);
        System.out.println("°C");
        System.out.println("If it were 2°C warmer it would be: ");
        System.out.println(cels + 2 + "°C");
    }
}
