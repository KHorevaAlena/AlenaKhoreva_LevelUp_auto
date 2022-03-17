import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;
import org.junit.jupiter.api.Tag;

public class CosTest {
    @Test
    @Tag("trigonometry")
    public void checkingDoubleCos(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0.101,calculator.cos(75.5),0.0001);
    }
}
