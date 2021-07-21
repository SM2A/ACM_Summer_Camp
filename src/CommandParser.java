/**
 * Created by SM2A
 * Seyed Mohammad Amin Atyabi
 */

public class CommandParser {

    private final GameStore gameStore;

    public CommandParser(GameStore gameStore) {
        this.gameStore = gameStore;
    }

    public String parseCommand(String... command) throws Exception {
        try {
            switch (command[0]) {
                case "AddGame":
                    return gameStore.addGame(command[1]);
                case "RemoveGame":
                    return gameStore.removeGame(command[1]);
                case "ShowShoppingList":
                    gameStore.showShoppingList();
                    break;
                case "AddCredit":
                    return gameStore.addCredit(Integer.parseInt(command[1]));
                default:
                    throw new Exception("Command Not Found");
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            throw new ArrayIndexOutOfBoundsException("Please enter command correctly");
        }
        return "";
    }
}
