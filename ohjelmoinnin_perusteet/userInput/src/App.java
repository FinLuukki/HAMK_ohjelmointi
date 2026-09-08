import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String input = ""; 
        int result = 0;

        //Integer values

        System.out.println("Write a number, I will multiply it by 10");
        input = in.nextLine();

        result = Integer.parseInt(input) * 10;
        System.out.println(result);


        // String value
        
        // System.out.println("Please type something. I will then write it to the console");
        // // input = "hello";
        // input = in.nextLine();

        // System.out.println("You typed " + input);
    }
}
