import java.util.Arrays;
public class Harj1 {
    public static void main(String[] args) throws Exception {
        String huonekalut[];
        huonekalut = new String[3];

        huonekalut[0] = "Sohva";
        huonekalut[1] = "Tuoli";
        huonekalut[2] = "Poyta";

        String etsittava = "Sohva";

        for (int i = 0 ; i < huonekalut.length ; i++){
            if (huonekalut[i].equals(etsittava)) {
                System.out.println("Löytyi:" + huonekalut[i]);
            }
        }

    
        }
        




    
}
