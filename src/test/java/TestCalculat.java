import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Calculat;

public class TestCalculat {
    @Test
    void testAdd() {
        Calculat calculator = new Calculat();
        int result = calculator.add(35, 20);
        assertEquals(55, result);
    }
}
