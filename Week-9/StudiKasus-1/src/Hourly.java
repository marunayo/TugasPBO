public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    public String toString() {
        return super.toString() + "\nCurrent hours: " + hoursWorked;
    }
}
