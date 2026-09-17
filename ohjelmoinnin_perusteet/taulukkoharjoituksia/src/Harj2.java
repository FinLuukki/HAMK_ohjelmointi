import java.util.Random;
import java.util.Arrays;
public class Harj2 {
    public static void main(String[] args) throws Exception {

        int  heitetytNoppaluvut[];
        heitetytNoppaluvut = new int[5];
        Random random = new Random();

        for(int i = 0 ; i < heitetytNoppaluvut.length ; i++) {
            heitetytNoppaluvut[i] = random.nextInt(6) + 1;
        }

        int summa = 0;
        System.out.println("Arvotut luvut:");

        for (int i = 0 ; i < heitetytNoppaluvut.length ; i++) {
            summa = summa + heitetytNoppaluvut[i];
            System.out.println(heitetytNoppaluvut[i]);
        }

        System.out.println("Lukujen summa on " + summa);

        //Isoin silmäluku
        Arrays.sort(heitetytNoppaluvut);

        System.out.println("Isoin silmäluku: " + heitetytNoppaluvut[heitetytNoppaluvut.length -1]);

    }
}
