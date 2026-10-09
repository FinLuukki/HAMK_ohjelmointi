import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        printTitle("Tommi");
    }
    
    public static void printTitle(String name) {

        Scanner in = new Scanner(System.in);

        name = "Tommi";
        System.out.println(name + "'s Playlist");
        String nimi = "Tommi's playlist";
        System.out.println(nimi.length());
        String playlist = in.nextLine();

    
    }
}

