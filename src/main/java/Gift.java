/**
 * Created by Андрей Лут on 20.12.2017.
 */
import Gift.GiftParam;
import Gift.Candy;
import Gift.Cookies;
import Gift.Jellybean;

public class Gift {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Snikers", 150, 200, "bar");
        Cookies cookies1 = new Cookies("Oreo", 300, 150, "Chocolate cookies");
        Jellybean jellybean1 = new Jellybean("Harry Potter", 550, 200, "Jelleybeans in original package");
        GiftParam[] GiftBox = {candy1, cookies1, jellybean1};

        for (GiftParam giftsGiftParam: GiftBox){
            System.out.println(giftsGiftParam.toString());
        }
    }
}
