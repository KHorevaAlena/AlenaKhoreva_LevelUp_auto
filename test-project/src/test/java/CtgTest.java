import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class CtgTest {
    @Test
    @Tag("trigonometry")
    public void checkingDoubleCtg(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1.0,calculator.ctg(55.5),0.0001);
    }
}
