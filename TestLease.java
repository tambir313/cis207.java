public class TestLease {
    public static void main(String[] args) {
        // Create a Lease object using the default constructor
        Lease lease = new Lease();

        // Display initial lease details
        System.out.println("Initial Lease Details:");
        lease.displayLeaseDetails();

        // Update lease details using setters
        lease.setTenantName("John Doe");
        lease.setApartmentNumber(101);
        lease.setMonthlyRent(1200.00);
        lease.setLeaseTermMonths(24);

        // Display updated lease details
        System.out.println("\nUpdated Lease Details:");
        lease.displayLeaseDetails();

        // Add pet fee and explain pet policy
        lease.addPetFee();

        // Display final lease details after adding pet fee
        System.out.println("\nLease Details After Adding Pet Fee:");
        lease.displayLeaseDetails();
    }
}
