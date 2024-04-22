package animals;

import com.example.Cat;
import com.example.Feline;
import com.example.enums.AnimalFood;
import com.example.enums.AnimalSound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Feline feline = new Feline();
    @Test
    public void catSoundTest(){
        Cat cat = new Cat(feline);
        assertEquals(AnimalSound.MEOW, cat.getSound());
    }

    @Test
    public void catFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals(AnimalFood.PREDATOR.getListFood(), cat.getFood());
    }

    @Mock
    Feline mockFeline = new Feline();
    @Test
    public void lionFunctionGetFoodTest() throws Exception {
        Cat cat = new Cat(mockFeline);
        cat.getFood();
        Mockito.verify(mockFeline).eatMeat();
    }
}
