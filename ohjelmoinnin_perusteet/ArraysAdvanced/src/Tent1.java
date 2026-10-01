import java.util.Scanner;
import java.util.Arrays;
public class Tent1 {
    public static void main(String[] args) throws Exception {
        
        double javelinThrows[];
        javelinThrows = new double [3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < 3; i++) {
            System.out.println("Throw length");
            javelinThrows[i] = scanner.nextDouble();
        }

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Throw " + (i + 1) + ": " + javelinThrows[i]);
        }

        
    }       
}
