import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artist lora;
    Artwork art1;
    ArrayList<Artwork> tempArtCollection;

    @BeforeEach
    public void setUp(){
        customer = new Customer ("James Bond", 1000);
        lora = new Artist("Lora");
        art1 = new Artwork("Flower", lora, 40);
        tempArtCollection = new ArrayList<Artwork>();
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("James Bond");
    }

    @Test
    public void canSetName(){
        customer.setName("007");
        assertThat(customer.getName()).isEqualTo("007");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void canGetArtCollection(){
        assertThat(customer.getArtCollection()).isEqualTo(tempArtCollection);
    }

    @Test
    public void canBuyProduct(){
        double price = art1.getPrice();
        customer.buyProduct(price);
        assertThat(customer.getWallet()).isEqualTo(960);
    }

    @Test
    public void canAddToCollection(){
        tempArtCollection.add(art1);
        customer.addToCollection(art1);
        System.out.println(customer);
        assertThat(customer.getArtCollection()).isEqualTo(tempArtCollection);
    }
}


