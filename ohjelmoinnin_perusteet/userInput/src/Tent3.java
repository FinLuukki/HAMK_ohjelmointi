import java.util.Scanner;
public class Tent3 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String nimi = "0";
        int ika = 0;

        System.out.println("What is your name?");
        nimi = in.nextLine();

        System.out.println("How old are you?");
        ika = Integer.parseInt(in.nextLine());

        System.out.println("Your name is " + nimi + " and you are " + ika + " years old.");
    }
}
