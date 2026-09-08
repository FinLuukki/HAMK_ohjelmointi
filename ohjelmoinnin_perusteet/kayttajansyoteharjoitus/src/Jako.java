import java.util.Scanner;
public class Jako {
    public static void main(String[] args) throws Exception {
        int luku1 = 0;
        int luku2 = 0;
        int result = 0;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Anna minulle eka numero:");
        luku1 = Integer.parseInt(in.nextLine());

        System.out.println("Anna minulle toinen luku:");
        luku2 = Integer.parseInt(in.nextLine());

        result = luku1 / luku2;
        System.out.println("Jakolaskun tulos on: " +  result);



    }
}
