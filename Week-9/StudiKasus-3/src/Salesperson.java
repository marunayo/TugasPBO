public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    // Constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public int compareTo(Salesperson other) {
        if (this.totalSales == other.totalSales) {
            int lastNameComparison = this.lastName.compareTo(other.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison;
            } else {
                return this.firstName.compareTo(other.firstName);
            }
        }
        return this.totalSales - other.totalSales;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Salesperson) {
            Salesperson otherSalesperson = (Salesperson) other;
            return lastName.equals(otherSalesperson.getLastName()) &&
                    firstName.equals(otherSalesperson.getFirstName());
        }
        return false;
    }

    @Override
    public String toString() {
        return lastName + ", \t" + firstName + ": \t" + totalSales;
    }
}