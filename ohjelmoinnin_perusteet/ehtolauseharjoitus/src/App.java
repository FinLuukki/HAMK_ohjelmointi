public class App {
    public static void main(String[] args) throws Exception {

        // <
        // >
        // == yhtäsuuri
        // =! erisuuri
        // <= pienempi - tai yhtäsuuri kuin
        // >= suurempi - tai yhtäsuuri kuin


    //     int lampotila = 14;
        

    //     if (lampotila < 15) {
    //         // Näiden lohkosulkeiden  väliin kirjoitetaan
    //         // Mitä tapahtuu, jos ehto toteutuu (true)

    //         System.out.println("Takki mukaan!");
    //     }
    //     else {
    //         //Näiden lohkosulkeiden väliin, mitä tapahtuu, jos
    //         //ehto ei toteudu (false)

    //         System.out.println("Et tarvitse takkia!");
    //     }
    // }


        int luku1 = 7;
        int luku2 = 2;

        if (luku1 == luku2) {
            System.out.println("Luvut ovat yhtä suuret");
        }
        else if (luku1 > luku2) {
            System.out.println("Luku 1 on suurempi kuin luku 2");
        }   
        else if ( luku1 >= luku2) {
            System.out.println("Luku 2 on suurempi kuin luku 1");
        }
        else if (luku1 != luku2) {
            System.out.println("Luvut eivät ole yhtä suuret");
        }



    }
}

