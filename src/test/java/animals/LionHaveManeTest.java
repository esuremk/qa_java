package animals;

import com.example.Feline;
import com.example.Lion;
import com.example.enums.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHaveManeTest {
    private final Sex sex;
    private final Boolean doesHaveMane;

    public LionHaveManeTest(Sex sex, Boolean doesHaveMane){
        this.sex = sex;
        this.doesHaveMane = doesHaveMane;
    }

    @Parameterized.Parameters(name = "Пол  {0}, грива -> {1}"  )
    public static Object [][] getDoesHaveMane() {
        return  new Object[][] {
                {Sex.MALE, true},
                {Sex.FEMALE, false}
        };
    }

    @Test
    public void lionHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(doesHaveMane, lion.doesHaveMane());
    }

}
