public class Login {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Etunimi?");
        String etunimi = in.nextLine();

        System.out.println("Sukunimi?");
        String sukunimi = in.nextLine();

        System.out.println("Yrityksen verkkotunnus?");
        String verkkotunnus = in.nextLine();

        // Tarkistaa jos on oikein
        if (etunimi.equals("") || sukunimi.equals("") || verkkotunnus.equals("")) {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
        }
        else {
            GenerateEmail(etunimi, sukunimi, verkkotunnus);
            GenerateUsername(etunimi, sukunimi);
        }
    }

    public static void GenerateEmail(String etunimi, String sukunimi,
                                     String verkkotunnus) {
        String sahkoposti = etunimi + "." + sukunimi + "@" + verkkotunnus;
        sahkoposti = sahkoposti.toLowerCase();

        System.out.println("Sähköposti: " + sahkoposti);
    }

    public static void GenerateUsername(String etunimi, String sukunimi) {

        String tunnus = etunimi.substring(0, 4)
                + sukunimi.substring(sukunimi.length() - 4);

        tunnus = tunnus.toLowerCase();
        System.out.println("Käyttäjätunnus: " + tunnus);
    }
}