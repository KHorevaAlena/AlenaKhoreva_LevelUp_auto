import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SqrtTest {
@Test
@Tag("other operations")
public void checkingDoubleSqrt(){
    Calculator calculator = new Calculator();
    Assertions.assertEquals(2.24,calculator.sqrt(5),0.01);
}
}
