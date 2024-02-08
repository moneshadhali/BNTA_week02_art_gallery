import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Leonardo Da Vinci");
    }

    @Test
    public void canGetName(){
        assertThat(artist.getName()).isEqualTo("Leonardo Da Vinci");
    }

    @Test
    public void canSetName(){
        artist.setName("Micheal Angelo");
        assertThat(artist.getName()).isEqualTo("Micheal Angelo");
    }
}
