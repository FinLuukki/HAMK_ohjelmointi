import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int pituus = 0;
        int leveys = 0;

        tulostaOhjelmanNimi();

        System.out.println("Anna pituus");
        pituus = Integer.parseInt(in.nextLine());

        System.out.println("Anna leveys");
        leveys = Integer.parseInt(in.nextLine());

        laskePintaAla(pituus, leveys);

        // laskePintaAla(5, 10);
    } //mainin loppu

    public static void tulostaOhjelmanNimi() {
        System.out.println("Metodi-ohjelma");
        System.out.println("*****************");
    } //tulostaOhjelmanNimi-metodin loppu

    public static void laskePintaAla(int pit, int lev) {
        int pintaAla = pit * lev;
        System.out.println("Pinta-ala on " + pintaAla);

    }
}

