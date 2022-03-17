import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.levelup.qa.at.calculator.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubTest {
    @ParameterizedTest
    @MethodSource("subLongDataProvider")
    @Tag("sub")
    public void checkingLongSub(long expected,long a,long b){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(expected, calculator.sub(a,b));
    }
    static Stream<Arguments> subLongDataProvider() {
        return Stream.of(
                arguments(8, 12, 4),
                arguments(20, 29, 9),
                arguments(125, 136, 11)
        );
    }
    @Test
    @Tag("Sub")
    public void checkingDoubleSub(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1.3,calculator.sub(10.6,9.3),0.01);
    }
}
