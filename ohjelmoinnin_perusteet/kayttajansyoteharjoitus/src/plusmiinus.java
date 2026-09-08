import java.util.Scanner;

public class plusmiinus {
    public static void main(String[] args) throws Exception {

        int input1 = 0;
        int input2 = 0;
        int result1 = 0;
        int result2 = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Anna minulle ensimmäinen numero");
        input1 = Integer.parseInt(in.nextLine());

        System.out.println("Anna minulle toinen numero");
        input2 = Integer.parseInt(in.nextLine());

        System.out.println("Haluatko laskea luvut yhteen vai vähentää? Kirjoita plus tai miinus");
        String laskuTyyppi = in.nextLine();

       if (laskuTyyppi.equals("plus")) {
    result1 = input1 + input2;
    System.out.println("Numeroiden tulos on: " + result1);
    } else if (laskuTyyppi.equals("miinus")) {
    result2 = input1 - input2;
    System.out.println("Numeroiden vähennetty summa on: " + result2);
    }

        if (result1  > 10) {
            System.out.println("Tulos on yli 10.");
        }
    }
}
