package Gift;
/**
 * Created by Андрей Лут on 20.12.2017.
 */

public abstract class GiftParam {
    public static int totalWeight = 0;
    public static int totalPrice = 0;

    private String name;
    private int price;
    private int weight;


    public GiftParam(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int gettotalWeight() {
        return totalWeight;
    }

    public static int gettotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "name = " + name + ", price = " + price + ", weight = " + weight;
    }

}


