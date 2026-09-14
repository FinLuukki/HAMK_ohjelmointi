import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        String huonekalut[];
        huonekalut = new String[3];

        huonekalut[0] = "Sohva";
        huonekalut[1] = "Tuoli";
        huonekalut[2] = "Poyta";

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println(huonekalut[i]);
        }

        Arrays.sort(huonekalut);

        for (int i = 0 ; i < huonekalut.length ; i++) {
            System.out.println(huonekalut);
        }
        




    }
}
