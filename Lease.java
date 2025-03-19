public class Lease {
    
    // Fields to store tenant's information
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTermMonths;

    // Default constructor initializing with default values
    public Lease() {
        this.tenantName = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000.00;
        this.leaseTermMonths = 12;
    }

    // Getter and Setter methods for each field

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getLeaseTermMonths() {
        return leaseTermMonths;
    }

    public void setLeaseTermMonths(int leaseTermMonths) {
        this.leaseTermMonths = leaseTermMonths;
    }

    // Method to add $10 pet fee and explain pet policy
    public void addPetFee() {
        monthlyRent += 10.00;  // Adding pet fee
        explainPetPolicy();    // Explaining pet policy
    }

    // Static method to explain the pet fee policy
    public static void explainPetPolicy() {
        System.out.println("The pet fee is an additional $10 per month for tenants who have pets.");
    }

    // Method to display current lease details
    public void displayLeaseDetails() {
        System.out.println("Tenant Name: " + tenantName);
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Monthly Rent: $" + monthlyRent);
        System.out.println("Lease Term (in months): " + leaseTermMonths);
    }
}
