import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int songNumber = 0;


    while (true) {
        System.out.println("Enter song number:");
        songNumber = Integer.parseInt(in.nextLine());

        if(songNumber == 0) {
            break;
        }
        else {
            System.out.println("Playing song: " + songNumber);
        }


        }
    }
}
