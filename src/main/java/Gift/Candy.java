package Gift;
/**
 * Created by Андрей Лут on 20.12.2017.
 */

public class Candy extends GiftParam {

    private String candyType;

    public Candy(String name, int price, int weight, String candyType) {
        super(name, price, weight);
        totalWeight += weight;
        totalPrice += price;
        this.candyType = candyType;
    }

    public String getCandyType() {
        return candyType;
    }

    public void setCandyType(String candyType) {
        this.candyType = candyType;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() +", Candy type = " + candyType +"]";
    }
}
