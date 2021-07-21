import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by SM2A
 * Seyed Mohammad Amin Atyabi
 */

public class Main {

    public static void main(String[] args) {

        try {
            GameStore gameStore = new GameStore();
            CommandParser commandParser = new CommandParser(gameStore);
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                try {
                    String[] command = scanner.nextLine().split(" ", 2);
                    System.out.println(commandParser.parseCommand(command));
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }
            }
        } catch (FileNotFoundException | NumberFormatException exception) {
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }
}
