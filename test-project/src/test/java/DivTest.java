import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.levelup.qa.at.calculator.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DivTest {
    @ParameterizedTest
    @MethodSource("divLongDataProvider")
    @Tag("Div")
    public void checkingLongDiv(long expected,long a,long b){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(expected, calculator.div(a,b));
    }
    static Stream<Arguments> divLongDataProvider(){
        return Stream.of(
                arguments(8,72,9),
                arguments(20,60,3),
                arguments(5,125,25)
        );
    }
    @Test
    @Tag("Div")
    public void checkingDoubleDiv(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0.88,calculator.div(8.8,10),0.01);
    }
}

