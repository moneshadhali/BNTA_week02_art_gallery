import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    Artist lora;
    Artist pete;
    Artwork art1;

    @BeforeEach
    public void setUp(){
        lora = new Artist("Lora");
        pete = new Artist("Pete");
        art1 = new Artwork("Flower", lora, 40);
    }

    @Test
    public void canGetTitle(){
        assertThat(art1.getTitle()).isEqualTo("Flower");
    }

    @Test
    public void canSetTitle(){
        art1.setTitle("Earth");
        assertThat(art1.getTitle()).isEqualTo("Earth");
    }

    @Test
    public void canGetArtist(){
        assertThat(art1.getArtist()).isEqualTo(lora);
    }

    @Test
    public void canSetArtist(){
        art1.setArtist(pete);
        assertThat(art1.getArtist()).isEqualTo(pete);
    }

    @Test
    public void canGetPrice(){
        assertThat(art1.getPrice()).isEqualTo(40);
    }

    @Test
    public void canSetPrice(){
        art1.setPrice(50);
        assertThat(art1.getPrice()).isEqualTo(50);
    }
}
