public class InvoiceSummary {

    public int totalRides;
    public double totalFare;
    public double averageFare;

    public InvoiceSummary(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare = totalFare / totalRides;
    }
}