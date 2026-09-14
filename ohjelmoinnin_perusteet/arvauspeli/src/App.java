import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String nimi = "Makke";
        String arvaus = "";

        while (arvaus.equals(nimi)) {}
        System.out.println("Arvaa nimi:");
        arvaus = in.nextLine();

        if (arvaus.equals(nimi)) {
            System.out.println("Arvasit oikein, voitit pelin!");
        }

    }
}
