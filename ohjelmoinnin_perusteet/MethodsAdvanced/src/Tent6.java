public class Tent6 {
    public static void main(String[] args) throws Exception {

    }
    
public static void calculate(int number1, int number2, String operation) {
    int result = 0;

    if (operation.equals("sum")) {
        result = number1 + number2;
    } else if (operation.equals("subtraction")) {
        result = number1 - number2;
    } else if (operation.equals("multiplication")) {
        result = number1 * number2;
    }

    System.out.println("The result is " + result + ".");
}

}
