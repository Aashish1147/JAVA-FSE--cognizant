import java.util.HashMap;

public class InventoryManagement {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product Added");
    }

    public void updateProduct(int id, int quantity, double price) {
        Product p = inventory.get(id);

        if (p != null) {
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product Updated");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void deleteProduct(int id) {
        if (inventory.remove(id) != null)
            System.out.println("Product Deleted");
        else
            System.out.println("Product Not Found");
    }

    public void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        InventoryManagement obj = new InventoryManagement();

        obj.addProduct(new Product(101, "Laptop", 20, 50000));
        obj.addProduct(new Product(102, "Mouse", 100, 700));
        obj.addProduct(new Product(103, "Keyboard", 50, 1200));

        obj.displayProducts();

        obj.updateProduct(102, 120, 750);

        obj.deleteProduct(101);

        System.out.println("\nAfter Update and Delete:");

        obj.displayProducts();
    }
}