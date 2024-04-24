package animals;

import com.example.Feline;
import com.example.Lion;
import com.example.constants.ExceptionMessage;
import com.example.enums.AnimalFood;
import com.example.enums.AnimalKind;
import com.example.enums.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Feline feline = new Feline();
    @Test
    public void lionKittensTest() throws Exception {
        Lion lion = new Lion(Sex.MALE, feline);
        assertEquals(AnimalFood.PREDATOR.getListFood(), lion.getFood());
    }
    @Test
    public void lionHasFoodOfPredatorTest() throws Exception {
        Lion lion = new Lion(Sex.MALE, feline);
        assertEquals(AnimalFood.PREDATOR.getListFood(), lion.getFood());
    }

    @Test
    public void lionSexThrowsExceptionTest(){
        Exception exception = assertThrows("При  несуществующем значении пола должна быть выбрашена ошибка",
                Exception.class, () -> new Lion(Sex.NON_EXISTENT_GENDER, feline));
        assertEquals(ExceptionMessage.NOT_ALLOWED_VALUE_SEX, exception.getMessage());
    }

    @Mock
    Feline mockFeline;
    //Хорошо ли в одном классе располагать тесты с моками и с реальными объектами ?
    @Test
    public void lionMockGetKittensTest() throws Exception {
        Lion lion = new Lion(Sex.MALE, mockFeline);
        lion.getKittens();
        Mockito.verify(mockFeline).getKittens();
    }

    @Test
    public void lionMockGetFoodTest() throws Exception {
        Lion lion = new Lion(Sex.MALE, mockFeline);
        lion.getFood();
        Mockito.verify(mockFeline).getFood(AnimalKind.PREDATOR);
    }

    @Test
    public void lionGetKittensWhitWhenThenMockTest() throws Exception {
        Lion lion = new Lion(Sex.MALE, mockFeline);
        Mockito.when(mockFeline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }
}
