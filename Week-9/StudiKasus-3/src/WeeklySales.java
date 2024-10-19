public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salespeople = {
                new Salesperson("Jane", "Jones", 3000),
                new Salesperson("Daffy", "Duck", 4935),
                new Salesperson("James", "Jones", 3000),
                new Salesperson("Dick", "Walter", 2800),
                new Salesperson("Don", "Trump", 1570),
                new Salesperson("Jane", "Black", 3000),
                new Salesperson("Harry", "Taylor", 7300),
                new Salesperson("Andy", "Adams", 5000),
                new Salesperson("Jim", "Doe", 2850),
                new Salesperson("Walt", "Smith", 3000)
        };

//        Sorting.selectionSort(salespeople);
        Sorting.insertionSort(salespeople);

        System.out.println("Salespeople sorted by total sales (and reverse alphabetical order for ties):");
        for (Salesperson s : salespeople) {
            System.out.println(s);
        }
    }
}
