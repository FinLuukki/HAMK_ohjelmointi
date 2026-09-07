// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class Kirjastolainaus {

//     static Scanner scanner = new Scanner(System.in);

//     // Kirjastokortit ja niiden PIN-koodit
//     static Map<String, String> kirjastokortit = new HashMap<>();

//     // Kirjojen viivakoodit ja nimet
//     static Map<String, String> kirjat = new HashMap<>();


//     public static void main(String[] args) {

//         // Testikortit
//         kirjastokortit.put("123456", "1234");
//         kirjastokortit.put("654321", "4321");
//         kirjastokortit.put("111111", "1111");

//         // Testikirjat
//         kirjat.put("9789510481234", "Tuntematon sotilas");
//         kirjat.put("9789520412345", "Seitsemän veljestä");
//         kirjat.put("9789510467890", "Kalevala");
//         kirjat.put("1234567890", "Harry Potter ja viisasten kivi");

//         tulostaOtsikko("KIRJASTON LAINAUSAUTOMAATTI");

//         while (true) {

//             aloitaLainaus();

//             System.out.println();

//             if (!kysyKylläEi("Aloitetaanko uusi lainaus")) {
//                 System.out.println("\nKiitos ja näkemiin!");
//                 break;
//             }
//         }

//         scanner.close();
//     }


//     // -----------------------------
//     // LAINAUKSEN ALOITUS
//     // -----------------------------

//     public static void aloitaLainaus() {

//         tulostaOtsikko("ALOITA LAINAUS");

//         // Kirjastokortin numero
//         System.out.print("Syötä kirjastokortin numero: ");
//         String kortti = scanner.nextLine().trim();


//         // Tarkistetaan kirjastokortti
//         if (!kirjastokortit.containsKey(kortti)) {

//             System.out.println("\nEi hyväksytty kirjastokortti.");
//             System.out.println("Lopeta toiminto.");
//             return;
//         }


//         System.out.println("\nHyväksytty kirjastokortti.");


//         // Kysytään PIN
//         System.out.print("Syötä PIN-koodi: ");
//         String pin = scanner.nextLine().trim();


//         // Tarkistetaan PIN
//         if (!kirjastokortit.get(kortti).equals(pin)) {

//             System.out.println("\nVäärä PIN-koodi.");
//             System.out.println("Lopeta toiminto.");
//             return;
//         }


//         System.out.println("\nOikea PIN-koodi.");


//         // -----------------------------
//         // KIRJAN VIIVAKOODI
//         // -----------------------------

//         while (true) {

//             System.out.print("Lue kirjan viivakoodi: ");
//             String viivakoodi = scanner.nextLine().trim();


//             // Löytyykö kirja?
//             if (kirjat.containsKey(viivakoodi)) {

//                 String kirja = kirjat.get(viivakoodi);

//                 System.out.println("\nKirja tunnistettu: " + kirja);
//                 System.out.println("Laina valmis.");

//                 tulostaKuitti(kirja, kortti);

//                 break;
//             }


//             // Kirjaa ei tunnistettu
//             System.out.println("\nEi tunnista kirjaa.");


//             if (!kysyKylläEi("Yritetäänkö uudelleen")) {

//                 System.out.println("\nLopeta toiminto.");
//                 return;
//             }
//         }
//     }


//     // -----------------------------
//     // KYLLÄ / EI -KYSYMYS
//     // -----------------------------

//     public static boolean kysyKylläEi(String kysymys) {

//         while (true) {

//             System.out.print(kysymys + " (k/e): ");

//             String vastaus = scanner.nextLine()
//                     .trim()
//                     .toLowerCase();


//             if (vastaus.equals("k")
//                     || vastaus.equals("kyllä")
//                     || vastaus.equals("kylla")) {

//                 return true;
//             }


//             if (vastaus.equals("e")
//                     || vastaus.equals("ei")) {

//                 return false;
//             }


//             System.out.println("Syötä k = kyllä tai e = ei.");
//         }
//     }


//     // -----------------------------
//     // KUITTI
//     // -----------------------------

//     public static void tulostaKuitti(String kirja, String kortti) {

//         DateTimeFormatter formatter =
//                 DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

//         String aika =
//                 LocalDateTime.now().format(formatter);


//         System.out.println();
//         System.out.println("**************************************************");
//         System.out.println("                 KIRJASTON KUITTI");
//         System.out.println("**************************************************");

//         System.out.println("Kirja:              " + kirja);
//         System.out.println("Kirjastokortti:     " + kortti);
//         System.out.println("Lainauspäivä:       " + aika);
//         System.out.println("Laina valmis!");

//         System.out.println("**************************************************");
//     }


//     // -----------------------------
//     // OTSIKKO
//     // -----------------------------

//     public static void tulostaOtsikko(String teksti) {

//         System.out.println();
//         System.out.println("==================================================");
//         System.out.println(teksti);
//         System.out.println("==================================================");
//     }
// }
import java.util.Scanner;

public class Kirjastolainaus {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== KIRJASTON LAINAUSJÄRJESTELMÄ ===");

        // Aloita lainaus
        aloitaLainaus();

        scanner.close();
    }

    // Aloita lainaus
    public static void aloitaLainaus() {

        System.out.println("\nAloita lainaus");

        // Kirjojen lainaus
        System.out.println("Kirjojen lainaus");

        // Kysy kirjastokorttia
        System.out.print("Onko kirjastokortti? (kyllä/ei): ");
        String vastaus = scanner.nextLine();

        if (vastaus.equalsIgnoreCase("ei")) {
            System.out.println("Ei kirjastokorttia.");
            lopetaToiminto();
            return;
        }

        if (!vastaus.equalsIgnoreCase("kyllä") &&
            !vastaus.equalsIgnoreCase("k")) {
            System.out.println("Virheellinen vastaus.");
            lopetaToiminto();
            return;
        }

        System.out.println("Hyväksytty kirjastokortti.");

        // Kysy PIN-koodi
        kysyPinKoodi();
    }

    // Kysy PIN-koodi
    public static void kysyPinKoodi() {

        final String OIKEA_PIN = "1234";

        System.out.print("\nKysy PIN-koodi: ");
        String pin = scanner.nextLine();

        if (!pin.equals(OIKEA_PIN)) {
            System.out.println("Väärä PIN-koodi.");
            lopetaToiminto();
            return;
        }

        System.out.println("Oikea PIN-koodi.");

        // Lue kirjan viivakoodi
        lueViivakoodi();
    }

    // Lue kirjan viivakoodi
    public static void lueViivakoodi() {

        while (true) {

            System.out.print("\nLue kirjan viivakoodi: ");
            String viivakoodi = scanner.nextLine();

            // Esimerkkiviivakoodit
            if (viivakoodi.equals("123456") ||
                viivakoodi.equals("111111") ||
                viivakoodi.equals("222222")) {

                System.out.println("Kirja(t) tunnistettu.");

                // Laina valmis
                lainaValmis();
                return;

            } else {
                // Ei tunnista kirjaa
                System.out.println("Ei tunnista kirjaa.");
                System.out.println("Yritä uudelleen.");

                // Ohjelma palaa automaattisesti
                // viivakoodin lukemiseen
            }
        }
    }

    // Laina valmis
    public static void lainaValmis() {

        System.out.println("\nLaina valmis.");

        // Tulosta kuitti
        tulostaKuitti();
    }

    // Tulosta kuitti
    public static void tulostaKuitti() {

        System.out.println("\n==============================");
        System.out.println("          KUITTI");
        System.out.println("==============================");
        System.out.println("Laina onnistui!");
        System.out.println("Kirja on lainattu.");
        System.out.println("==============================");

        lopetaToiminto();
    }

    // Lopeta toiminto
    public static void lopetaToiminto() {

        System.out.println("\nLopeta toiminto.");
        System.out.println("Ohjelma päättyi.");
    }
}
