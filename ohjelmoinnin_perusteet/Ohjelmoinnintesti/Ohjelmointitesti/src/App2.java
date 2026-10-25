import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        
        String[] catalog = {
    "Dua Lipa - Levitating",
    "The Weeknd - Blinding Lights",
    "Olivia Rodrigo - Drivers License",
    "Harry Styles - As It Was",
    "Glass Animals - Heat Waves",
    "The Kid LAROI & Justin Bieber - Stay",
    "Miley Cyrus - Flowers",
    "Sabrina Carpenter - Espresso",
    "Billie Eilish - BIRDS OF A FEATHER",
    "Benson Boone - Beautiful Things"
    };

    for (int i = 0 ; i < 10 ; i++) {
    System.out.println((i + 1) + " " + catalog[i]);
    } 

     while (true) {
        System.out.println("Enter song number:");
        int songNumber = Integer.parseInt(in.nextLine());

        if(songNumber == 0) {
            break;
        }
        else {
            System.out.println("Playing song: " + catalog[songNumber]);
        }


        }

    
    }
}
