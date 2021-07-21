/**
 * Created by SM2A
 * Seyed Mohammad Amin Atyabi
 */

public class Game {

    private final String id;
    private final String name;
    private final int price;
    private final int year;
    private final String company;
    private int quantity;

    public Game(String id, String name, int price, int year, String company, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.year = year;
        this.company = company;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void buy(int q){
        this.quantity -= q;
    }
}
