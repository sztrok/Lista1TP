package Paczka1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EspTest {

    @Test
    public void testEspGreet(){
        ESP EspObject= new ESP();
        String testObject= EspObject.greeting();
        assertEquals(testObject, "Hola!");
    }
}
