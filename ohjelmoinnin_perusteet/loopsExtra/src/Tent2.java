import java.util.Scanner;

public class Tent2 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        int rows = 0;
        System.out.println("How many rows?");
        rows = Integer.parseInt(in.nextLine());

        for (int row = 1 ; row <= rows ; row++ ) {

            for ( int spaces = 1 ; spaces <= rows - row; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= row ; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
