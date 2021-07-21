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
}
