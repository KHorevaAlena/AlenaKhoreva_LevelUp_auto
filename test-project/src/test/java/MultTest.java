import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.levelup.qa.at.calculator.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MultTest {
    @ParameterizedTest
    @MethodSource("multLongDataProvider")
    @Tag("Mult")
    public void checkingLongMult(long expected,long a,long b){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(expected, calculator.mult(a,b));
    }
    static Stream<Arguments> multLongDataProvider() {
        return Stream.of(
                arguments(8, 4, 2),
                arguments(20, 5, 4),
                arguments(125, 25, 5)
        );
    }
@Test
@Tag("Mult")
    public void checkingDoubleMult(){
    Calculator calculator = new Calculator();
    Assertions.assertEquals(8.8, calculator.mult(2.2,4.4));
}
}
