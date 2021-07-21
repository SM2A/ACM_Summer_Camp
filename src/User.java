import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SM2A
 * Seyed Mohammad Amin Atyabi
 */

public class User {

    private HashMap<Game,Integer> shoppingList;
    private int credit;

    public User() {
        this.shoppingList = new HashMap<>();
        this.credit = 0;
    }

    private boolean isGameInShoppingCart(Game game){
        return shoppingList.containsKey(game);
    }

    public String addGame(Game game){
        if (isGameInShoppingCart(game)){
            shoppingList.replace(game,shoppingList.get(game)+1);
            return "Incremented Successfully";
        }else {
            shoppingList.put(game,1);
            return "Added Successfully";
        }
    }

    public String removeGame(Game game) throws Exception {
        if (isGameInShoppingCart(game)){
            shoppingList.remove(game);
            return "Game removed Successfully";
        }else {
            throw new Exception("This game is not in cart");
        }
    }
}
