import java.util.Scanner;
public class Tent5 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int result = 0;

        System.out.println("First number?");
        number1 = Integer.parseInt(in.nextLine());

        System.out.println("Second number?");
        number2 = Integer.parseInt(in.nextLine());

        result = (number1 + number2);
        System.out.println(number1 + " + " + number2 + " = " + result);
    }
    
}
