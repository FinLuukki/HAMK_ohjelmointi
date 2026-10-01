import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Tent2 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       

        while (true) {
            System.out.println("Add item (x = exit)");
            String item = scanner.nextLine();

            if (item.equals("x")) {
                break;
            }

            shoppingList.add(item);
        }

        for (String item : shoppingList) {
            System.out.println(item);
        }
    }
}

