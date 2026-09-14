import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in); 
    Random r = new Random();

    int numero1 = 0;
    int numero2 = 0;
    int numero3 = 0;
    int raha = 5;



    System.out.println("Sinulla on 5e rahaa pelataksesi. Jokainen peli maksaa euron.");
    System.out.println("Arvotaan numerot:");


    numero1 = (r.nextInt(10)+1);
    System.out.println(numero1);

    numero2 = (r.nextInt(10)+1);
    System.out.println(numero2);

    numero3 = (r.nextInt(10)+1);
    System.out.println(numero3);
   

    if (numero1 == 7 || numero2 == 7 || numero3 == 7) {
        System.out.println("Voitit pelin, onneksi olkoon!");
    } else {
        System.out.println("Hävisit pelin!");
    } 

    

    // for (int counter = 0 ; counter < 3 ; counter++) {

    //     System.out.println(r.nextInt(8));
    // }    
    


    }
}
