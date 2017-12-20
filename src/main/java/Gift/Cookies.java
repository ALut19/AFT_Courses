package Gift;
/**
 * Created by Андрей Лут on 20.12.2017.
 */

public class Cookies extends GiftParam {

    private String cookiesType;

    public Cookies(String name, int price, int weight, String cookiesType) {
        super(name, price, weight);
        totalWeight += weight;
        totalPrice += price;
        this.cookiesType = cookiesType;
    }

    public String getCookiesType() {
        return cookiesType;
    }

    public void setCookiesType(String cookiesType) {
        this.cookiesType = cookiesType;
    }

    @Override
    public String toString() {
        return "Cookies + [" + super.toString() +", Cookies type = " + cookiesType +"]";
    }
}
