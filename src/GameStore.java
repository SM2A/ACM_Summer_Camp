import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by SM2A
 * Seyed Mohammad Amin Atyabi
 */

public class GameStore {

    private User user;
    private ArrayList<Game> games;

    public GameStore() throws FileNotFoundException, NumberFormatException {
        this.user = new User();
        games = new ArrayList<>();
        try {

            Scanner scanner = new Scanner(new File("Res/Data.txt"));
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split("\\s*,\\s*");
                Game game = new Game(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]),
                        data[4], Integer.parseInt(data[5]));
                games.add(game);

            }
        } catch (FileNotFoundException exception){
            throw new FileNotFoundException("Data file not found");
        } catch (NumberFormatException exception){
            throw new NumberFormatException("Invalid data in resource file");
        }
    }

    private Game findGame(String id) throws Exception {
        for (Game game : games){
            if (game.getId().equals(id))
                return game;
        }
        throw new Exception("Game not found");
    }

    public String addGame(String id) throws Exception {
        Game game = findGame(id);
        return user.addGame(game);
    }
}
