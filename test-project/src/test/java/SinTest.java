import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SinTest {
    @Test
    @Tag("trigonometry")
    public void checkingDoubleSin(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0.102,calculator.sin(75.5),0.001);
    }
}
