import java.util.Scanner;
public class Tent4 {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        int ika1 = 0;
        int ika2 = 0;
        int result = 0;

        System.out.println("First number?");
        ika1 = Integer.parseInt(in.nextLine());

        System.out.println("Second number?");
        ika2 = Integer.parseInt(in.nextLine());

        result = ika1 + ika2;
        System.out.println("The sum is " + result + ".");

    }
    
}
