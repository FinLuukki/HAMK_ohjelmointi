import java.util.Scanner; 
public class Tent2 {
        public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        String nimi = "0";

        System.out.println("What is your name?");
        nimi = in.nextLine();


        
         if (nimi.equals("")) {
            System.out.println("Error");
        } else {
            System.out.println("Your name is " + nimi + ".");
        } 
   }
}
    

