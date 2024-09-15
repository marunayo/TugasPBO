import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {

        // Buatlah object product dengan quantity produk 10
        Product produk = new Product("Laptop Gaming", 35000000, 10);

        // Buatlah object sales
        Sales sales = new Sales(produk);
        sales.sellProduct(5);
        sales.restockProduct(100);
        sales.updateProductPrice(14000000);
        sales.updateProductPrice(-50000);
    }
}