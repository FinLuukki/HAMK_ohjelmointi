import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) throws Exception {

        String colours[];
        colours = new String[3];

        colours[0] = "Green";
        colours[1] = "Blue";
        colours[2] = "Yellow";

        System.out.println(colours[1]);

        for(int i = 0 ; i < colours.length ; i++){
            int luku = i + 1;
            System.out.println(luku + ". "+colours[i]);
        }


    }
}
