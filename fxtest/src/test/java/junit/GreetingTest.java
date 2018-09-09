package junit;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class GreetingTest {

    @Test
    void testSayHello() {
        Greeting greeting = new Greeting();
        assertEquals("g'day", greeting.sayHello());
    }
}
