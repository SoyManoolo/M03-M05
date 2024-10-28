import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "3, 3, 9", "4, 3, 12", "5, 3, 15", "6, 3, 18", "7, 3, 21", "8, 3, 24", "9, 3, 27", "10, 3, 30"})
        void multiEnteros(int n1, int n2, int result) {
        MyMath myMath = new MyMath();
        float resultado = myMath.multi(n1, n2);
        assertEquals(result, resultado);
    }
    @ParameterizedTest
    @CsvSource({"0.1, 0.2, 0.020000001", "0.2, 0.2, 0.040000003", "0.3, 0.2, 0.060000002", "0.4, 0.2, 0.080000006", "0.5, 0.2, 0.1", "1.5, 2.5, 3.75"})
    void multiDecimales(float n1, float n2, float result) {
        MyMath myMath = new MyMath();
        float resultado = myMath.multi(n1, n2);
        assertEquals(result, resultado);
    }
}