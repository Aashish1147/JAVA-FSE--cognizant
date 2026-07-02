import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(10, 20);

        // Assert
        assertEquals(30, result);
    }
}