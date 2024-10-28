import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivTest {

    @ParameterizedTest
    @CsvSource({"2, 1, 2", "2, 2, 1", "6, 3, 2", "5, 10, 0.5", "4, 16, 0.25", "5, 0.2, 25"})
    void div2(float n1, float n2, float result) {
        Div div = new Div();
        float resultado = div.div2(n1, n2);
        assertEquals(result, resultado);
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 5, 1", "10, 5, 5, 0.4", "2000, 40, 10, 5", "5, 0.2, 4, 6.25"})
    void div3(float n1, float n2, float n3, float result) {
        Div div = new Div();
        float resultado = div.div3(n1, n2, n3);
        assertEquals(result, resultado);
    }
}