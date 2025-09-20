import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJunitTest {

    @Test
    void firstTest() {
        System.out.println("First Test");
        Assertions.assertTrue(3>2);
    }

    @Test
    void secondTest() {

        System.out.println("Second Test");
        Assertions.assertTrue(3>2);
    }
    @Test
    void thirdTest() {

        System.out.println("Third Test");
        Assertions.assertTrue(3>2);
    }
}