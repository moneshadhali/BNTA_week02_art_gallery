import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Customer customer;
    Gallery gallery;
    Artist lora;
    Artwork art1;
    Artwork art2;
    Artwork art3;

    ArrayList<Artwork> tempStock;
    ArrayList<Artwork> tempCustStock;
    @BeforeEach
    public void setUp(){
        customer = new Customer ("James Bond", 1000);
        lora = new Artist("Lora");
        art1 = new Artwork("Flower", lora, 40);
        art2 = new Artwork("Earth", lora, 50);
        art3 = new Artwork("Tree", lora, 60);
        gallery = new Gallery("SkyGallery",0);
        this.tempStock = new ArrayList<Artwork>();
        this.tempCustStock = new ArrayList<Artwork>();
    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("SkyGallery");
    }

    @Test
    public void canSetName(){
        gallery.setName("ContemporaryG");
        assertThat(gallery.getName()).isEqualTo("ContemporaryG");
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(200);
        assertThat(gallery.getTill()).isEqualTo(200);
    }

    @Test
    public void canAddTill(){
        gallery.setTill(200);
        assertThat(gallery.getTill()).isEqualTo(200);
    }

    @Test
    public void canGetStock(){
        assertThat(gallery.getStock()).isEqualTo(tempStock);
    }

    @Test
    public void canAddToStock(){
        gallery.addToStock(art1);
        gallery.addToStock(art2);
        gallery.addToStock(art3);
        tempStock.add(art1);
        tempStock.add(art2);
        tempStock.add(art3);
        assertThat(gallery.getStock()).isEqualTo(tempStock);
    }

    @Test
    public void canPurchaseArtwork(){
        gallery.addToStock(art1);
        gallery.addToStock(art2);
        gallery.addToStock(art3);

        Artwork artToBeBought = gallery.getStock().get(0);
        gallery.purchaseArtwork(customer, artToBeBought);

        assertThat(gallery.getTill()).isEqualTo(40);
        assertThat(customer.getWallet()).isEqualTo(960);
    }

    @Test
    public void canTransferArtwork(){
        gallery.addToStock(art1);
        gallery.addToStock(art2);
        gallery.addToStock(art3);

        tempStock.add(art1);
        tempStock.add(art2);
        tempStock.add(art3);
        tempStock.remove(0);
        tempCustStock.add(art1);

        Artwork artToBeBought = gallery.getStock().get(0);
        gallery.transferArtwork(customer, artToBeBought);

        assertThat(gallery.getStock()).isEqualTo(tempStock);
        assertThat(customer.getArtCollection()).isEqualTo(tempCustStock);
    }
    @Test
    public void canRemoveStock(){
        gallery.addToStock(art1);
        gallery.addToStock(art2);
        gallery.removeStock(art2);

        tempStock.add(art1);
        tempStock.add(art2);
        tempStock.remove(art2);
        assertThat(gallery.getStock()).isEqualTo(tempStock);
    }

    @Test
    public void canStockTake(){
        gallery.addToStock(art1);
        gallery.addToStock(art2);
        assertThat(gallery.stock_take()).isEqualTo(90);
    }

}
