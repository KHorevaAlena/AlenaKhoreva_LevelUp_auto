import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class IsPositiveTest {
    @Test
    @Tag("other operations")
    public void checkingIsPositive(){
        Calculator calculator = new Calculator();
        Assertions.assertTrue(calculator.isPositive(555));
    }
}
