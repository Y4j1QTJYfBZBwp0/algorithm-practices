import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testMain() {
        assertEquals("Hello world!", Main.helloWorld());
    }

}