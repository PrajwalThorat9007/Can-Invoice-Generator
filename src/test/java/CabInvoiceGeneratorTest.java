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

    @Test
    public void givenMultipleRides_ShouldReturnAggregateFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double totalFare = generator.calculateFare(rides);
        assertEquals(30, totalFare);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();

        Ride[] rides = {
                new Ride(2.0, 5),   // 25
                new Ride(0.1, 1)    // 5 (minimum fare)
        };

        InvoiceSummary summary = generator.calculateFareSummary(rides);

        assertEquals(2, summary.totalRides);
        assertEquals(30, summary.totalFare);
        assertEquals(15, summary.averageFare);
    }
}