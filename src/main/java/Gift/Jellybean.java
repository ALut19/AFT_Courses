package Gift;
/**
 * Created by Андрей Лут on 20.12.2017.
 */

public class Jellybean extends GiftParam {

    private String jellybeanType;

    public Jellybean(String name, int price, int weight, String jellybeanType) {
        super(name, price, weight);
        totalWeight += weight;
        totalPrice += price;
        this.jellybeanType = jellybeanType;
    }

    public String getJellybeanType() {
        return jellybeanType;
    }

    public void setJellybeanType(String jellybeanType) {
        this.jellybeanType = jellybeanType;
    }

    @Override
    public String toString() {
        return "Jellybean + [" + super.toString() +", Jellybean Type = " + jellybeanType +"]";
    }
}
