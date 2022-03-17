import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class PowTest {
    @Test
    @Tag("other operations")
    public void checkingDoublePow(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10.65,calculator.pow(2.2,3.3),0.01);
    }
}
