import java.util.Scanner;
public class Tent1 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in); 

        int number1 = 0;
        int number2 = 0;

        System.out.println("First number?");
        number1 = Integer.parseInt(in.nextLine());
        
        System.out.println("Last number?");
        number2 = Integer.parseInt(in.nextLine());

        for (int i = number1 ; i <= number2 ; i++) {
            System.out.println(i);
        }

    }
}
