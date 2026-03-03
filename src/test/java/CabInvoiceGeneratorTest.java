import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        double fare = generator.calculateFare(2.0, 5);
        assertEquals(25, fare);
    }

    @Test
    public void givenLessDistance_ShouldReturnMinimumFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        double fare = generator.calculateFare(0.1, 1);
        assertEquals(5, fare);
    }
}