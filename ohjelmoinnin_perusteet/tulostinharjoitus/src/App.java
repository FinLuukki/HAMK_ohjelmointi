public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hei, olen tulostinohjelma!");

        String tekija = "Luukas";
        System.out.println("Ohjelman tekijä:" + tekija);

        double luku1 = 8;
        double luku2 = 7;

        double tulo = 0;
        double erotus = 0;
        double summa = 0;
        double jako = 0;


        // System.out.println(luku1);

        System.out.println("Luku1-muuttujan arvo on: " + luku1);
        System.out.println("Luku2-muuttujan arvo on: " + luku2);



        //Tulolauseke
        tulo = luku1 * luku2;
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);


        
        //Erotuslauseke
        erotus = luku1 - luku2;
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);

       
        //Summalauseke
        summa = luku1 + luku2;
        System.out.println(luku1 + " + " + luku2 + " = " + summa);

        
        //Jakolauseke
        jako = luku1 / luku2;
        System.out.println(luku1 + " / " + luku2 + " = " + jako);
    }
}
