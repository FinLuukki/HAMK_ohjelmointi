import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        //perjantai-sunnuntai lämpötilat

        // int lampotila1 = 15;
        // int lampotila2 = 16;
        // int lampotila3 = 20;

        // System.out.println(lampotila1);
        // System.out.println(lampotila2);
        // System.out.println(lampotila3);

        int[] lampotilat;
        lampotilat = new int[3];

        lampotilat[0] = 15; //eka solu = indeksi 0
        lampotilat[1] = 16; // toka solu = indeksi 1
        lampotilat[2] = 20; // kolmas solu = indeksi 2

        // System.out.println(lampotilat[0]);
        // System.out.println(lampotilat[1]);
        // System.out.println(lampotilat[2]);

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println(lampotilat[i]);
        }

        Arrays.sort(lampotilat);

        //pienin ekassa solussa, eli indeksi 0
        System.out.println("Kylmin lampotila oli " + lampotilat[0]);

        //suurin vikassa solussa, eli indeksi 2
        System.out.println("Korkein lämpötila oli " + lampotilat[lampotilat.length-1]);

    }
}
