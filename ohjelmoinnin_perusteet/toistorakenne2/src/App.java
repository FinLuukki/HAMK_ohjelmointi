import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
        // int counter = 0;

        // do {
        //     System.out.println(counter + 1);
        //     counter ++;
        // } while(counter < 5); 

        // // for - hyvä jos tiedetään, monta kertaa loopataan
        // //while - ei tiedetä monta kertaa loopataan
        // // do-while - ei tiedetä monta kertaa loopataan, mutta tehdään ainakin tiettyyn pisteeseen asti

        // //PIN-koodin kysely
        // //Kysytään käyttäjältä pin-koodia, niin kauan kunnes osuu oikeaan


        Scanner in = new Scanner(System.in);

        String oikeaPin = "2225";
        String vastaus = "";

        do {

        System.out.println("Anna pin-koodi:");
        vastaus = in.nextLine();

        // System.out.println("Oikea pin: " + oikeaPin);
        // System.out.println("Käyttäjän vastaus " + vastaus);

        if (oikeaPin.equals(vastaus)) {
            System.out.println("Oikein meni!");
            break;
        } else {
            System.out.println("Väärin meni");
        }
        } while(true);
    
        //  }while(!oikeaPin.equals(vastaus));
        // //! tarkoittaa EI, eli nyt ehto on
        // //niin kauan loopataan kuin oikeaPin EI ole vastaus       
        // System.out.println("Logged in!");
    
        
    }   
}
