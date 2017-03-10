import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your character");
        String name = scan.nextLine();
        System.out.println("Enter the type of your character");
        String type = scan.nextLine();

        String AItype = "Flame Mage";

        Character player1 = new Character(name, type);

        // Create a new instance of the Character class named AI.
        Character AI = new Character("AI", AItype);

        System.out.println(player1);

        System.out.println(AI);


    }
}