import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.levelup.qa.at.calculator.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumTest {
    @ParameterizedTest
    @MethodSource("sumLongDataProvider")
    @Tag("sum")
    public void checkingLongSum(long expected,long a,long b){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(expected, calculator.sum(a,b));
    }
    static Stream<Arguments> sumLongDataProvider() {
        return Stream.of(
                arguments(18, 12, 6),
                arguments(22, 12, 10),
                arguments(15, 8, 7)
        );
    }
    @Test
    @Tag("Sum")
    public void checkingDoubleSum(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1.3, calculator.sum(0.8, 0.5));
    }
}
