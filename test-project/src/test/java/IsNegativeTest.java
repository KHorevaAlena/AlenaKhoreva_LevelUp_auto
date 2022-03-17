import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class IsNegativeTest {
    @Test
    @Tag("other operations")
    public void checkingIsNegative(){
        Calculator calculator = new Calculator();
        Assertions.assertFalse(calculator.isNegative(555));
    }
}
