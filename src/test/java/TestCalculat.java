import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Calculat;

public class TestCalculat {
    @Test
    void testAdd() {
        Calculat calculator = new Calculat();
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }
}
