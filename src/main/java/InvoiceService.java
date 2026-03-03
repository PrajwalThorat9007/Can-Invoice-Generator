public class InvoiceService {

    private RideRepository rideRepository;
    private CabInvoiceGenerator generator;

    public InvoiceService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
        this.generator = new CabInvoiceGenerator();
    }

    public InvoiceSummary getInvoiceSummary(String userId) {
        Ride[] rides = rideRepository.getRides(userId);
        return generator.calculateFareSummary(rides);
    }
}