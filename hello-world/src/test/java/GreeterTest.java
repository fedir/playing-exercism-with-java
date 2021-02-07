import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }

    @Test
    public void testThatGreeterReturnsPersonalizedGreetingShortWay() {
        assertEquals("Hello, Fedir!", new Greeter("Fedir").getGreeting());
    }

    @Test
    public void testThatGreeterReturnsPersonalizedGreetingLongWay() {
        Greeter greeter = new Greeter();
        greeter.setName("Fedir");
        String greeting = greeter.getGreeting();
        assertEquals("Hello, Fedir!", greeting);
    }

}
