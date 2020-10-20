package Paczka1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    private static final String GREET_PL="Czesc!";
    private static final String GREET_ANG="Hello!";

    @Test
    public void testPlGreet(){
        PL PlObject= new PL();
        String testObject= PlObject.greeting();
        assertEquals(testObject, GREET_PL);

    }

    @Test
    public void testEngGreet(){
        ENG EngObject= new ENG();
        String testObject= EngObject.greeting();
        assertEquals(testObject, GREET_ANG);
    }
}
