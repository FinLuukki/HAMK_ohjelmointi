import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class Task7 {

	public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Kia");
	    cars.add("Tesla");
	    cars.add("BMW");
	    cars.add("Renault");
        
        for(int i = 0 ; i < cars.length ; i++) {
            System.out.println(cars);
        }
    }
}