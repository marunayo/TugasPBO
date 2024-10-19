public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber;
    }

    public double pay() {
        return payRate;
    }
}