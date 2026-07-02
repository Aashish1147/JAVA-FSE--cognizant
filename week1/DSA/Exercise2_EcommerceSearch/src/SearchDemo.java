import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search
    static Product linearSearch(Product arr[], int id) {

        for (Product p : arr) {
            if (p.productId == id)
                return p;
        }

        return null;
    }

    // Binary Search
    static Product binarySearch(Product arr[], int id) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid].productId == id)
                return arr[mid];

            else if (arr[mid].productId < id)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product products[] = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Mouse", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");

        Product p = linearSearch(products, 102);

        if (p != null)
            System.out.println(p);
        else
            System.out.println("Product Not Found");

        // Sort array for Binary Search
        Arrays.sort(products, Comparator.comparingInt(a -> a.productId));

        System.out.println("\nBinary Search:");

        p = binarySearch(products, 102);

        if (p != null)
            System.out.println(p);
        else
            System.out.println("Product Not Found");
    }
}