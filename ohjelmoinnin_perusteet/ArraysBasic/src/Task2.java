import java.util.Scanner;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        int luku = 0;
        String aphorisms[];
        aphorisms = new String[5];

        aphorisms[1] = "Actions speak louder than words.";
        aphorisms[2] = "A barking dog never bites.";
        aphorisms[3] = "A penny saved is a penny earned.";
        aphorisms[4] = "All things come to those who wait";

        System.out.println("Pick number from 1-4.");
        luku = Integer.parseInt(in.nextLine());

        System.out.println(aphorisms[luku]);

        



    }
}
