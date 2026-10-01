import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

    //Alustetaan kolme arvoa, etunimi, sukunimi sekä verkkotunnus.
    String etunimi = "";
    String sukunimi = "";
    String verkkotunnus = "";

    Scanner in = new Scanner(System.in);
    
    while (true) {

    // Kysytään käyttäjältä etunimi, sukunimi ja yrityksen verkkotunnus.
    System.out.println("Nimi?");
    etunimi = in.nextLine();

    System.out.println("Sukunimi?");
    sukunimi = in.nextLine();

    System.out.println("Yrityksen verkkotunnus?");
    verkkotunnus = in.nextLine();

    // Jos jokin edellä mainituista kolmesta on tyhjä, se antaa error messagen "Virhe! Jokin tiedoista puuttui."
    // ja lopettaa loopin.
    if (etunimi.isEmpty() || sukunimi.isEmpty()|| verkkotunnus.isEmpty()) {
        System.out.println("Virhe! Jokin tiedoista puuttui.");
        break;

    } else {

        // Muussa tapauksessa, kutsutaan metodeja "GenerateEmail" sekä "GenerateUsername"
        GenerateEmail(etunimi, sukunimi, verkkotunnus);
        GenerateUsername(etunimi, sukunimi);

    //Lopetetaan looppi, kun ollaan saatu kolme arvoa käyttäjältä.
    } break;


    }
    }

    //Luodaan sähköposti käyttäjän antamista arvoista ja laitetaan pisteet ja @ merkki.
    public static void GenerateEmail(String etunimi, String sukunimi, String verkkotunnus) {

        //to.LowerCase() muuttaa kaikki kirjaimet pieneksi, jotta sähköposti näyttäisi siltä, miltä kuuluukin.
        String email = (etunimi + "." + sukunimi + "@" + verkkotunnus).toLowerCase();
        System.out.println(email);
    }

    //Luodaan sähköpostiosoite käyttäjän antamista arvoista.
    public static void GenerateUsername(String etunimi, String sukunimi ) {

        //Otetaan etunimestä kirjaimet väliltä 0-4 eli neljä ensimmäistä kirjainta.
        String username = etunimi.substring(0, 4)
                //Ja sukunimestä otetetaan neljä viimeistä kirjainta.
                + sukunimi.substring(sukunimi.length() -4);

        // Tulostetaan käyttäjänimi kaikki kirjaimet pienellä.
        System.out.println(username.toLowerCase());

    }
}
