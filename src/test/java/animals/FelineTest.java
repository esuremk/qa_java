package animals;

import com.example.Feline;
import com.example.enums.AnimalFamily;
import com.example.enums.AnimalFood;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void felineFoodTest() throws Exception {
        assertEquals(AnimalFood.PREDATOR.getListFood(), feline.eatMeat());
    }

    @Test
    public void felineFamilyTest() {
        assertEquals(AnimalFamily.FELINE.getMode(), feline.getFamily());
    }

    @Test
    public void felineGetKittensTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void felineGetKittensWhitArgumentTest() {
        assertEquals(2, feline.getKittens(2));
    }
}
