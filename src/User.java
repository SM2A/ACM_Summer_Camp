import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SM2A
 * Seyed Mohammad Amin Atyabi
 */

public class User {

    private final HashMap<Game,Integer> shoppingList;
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

    public void showShoppingList(){
        if (shoppingList.size()==0){
            System.out.println("Shopping list is empty");
        } else {
            System.out.printf("%3s | %20s | %8s | %10s | %7s%n",
                    "ID","Name","Quantity","Unit Price","Price");
            for (int i = 0; i <62 ; i++) System.out.print("-");
            System.out.println();
            int total = 0;
            for(Map.Entry<Game,Integer> item : shoppingList.entrySet()){
                total += item.getKey().getPrice()*item.getValue();
                System.out.printf("%3s | %20s | %8s | %10s | %7s%n",
                        item.getKey().getId(),item.getKey().getName(),item.getValue(),
                        item.getKey().getPrice(),item.getKey().getPrice()*item.getValue());
            }
            for (int i = 0; i <62 ; i++) System.out.print("-");
            System.out.println();
            System.out.printf("Total: %53s%n",total);
        }
    }
}
