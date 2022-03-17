import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TgTest {
    @Test
    @Tag("trigonometry")
    public void checkingDoubleTg(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1.0,calculator.tg(167.7),0.0001);
    }
}
