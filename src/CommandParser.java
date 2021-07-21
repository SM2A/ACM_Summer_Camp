/**
 * Created by SM2A
 * Seyed Mohammad Amin Atyabi
 */

public class CommandParser {

    private GameStore gameStore;

    public CommandParser(GameStore gameStore) {
        this.gameStore = gameStore;
    }

    public String parseCommand(String... command) throws Exception {
        try {
            if (command[0].equals("AddGame")) {
                return gameStore.addGame(command[1]);
            } else if (command[0].equals("RemoveGame")){
                return gameStore.removeGame(command[1]);
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            throw new ArrayIndexOutOfBoundsException("Please enter command correctly");
        }
        return "";
    }
}
