//package Algorithms_Data_Structures.SortingCustomerOrders;

public class OrderSorting {

    // Bubble Sort
    static void bubbleSort(Order arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].totalPrice > arr[j + 1].totalPrice) {

                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    static void quickSort(Order arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(Order arr[], int low, int high) {

        double pivot = arr[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].totalPrice < pivot) {

                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void display(Order arr[]) {

        for (Order o : arr)
            System.out.println(o);
    }

    public static void main(String[] args) {

        Order orders[] = {
                new Order(101, "Aashish", 2500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Amit", 5400),
                new Order(104, "Neha", 3100),
                new Order(105, "Priya", 1800)
        };

        System.out.println("Bubble Sort:");

        bubbleSort(orders);

        display(orders);

        Order orders2[] = {
                new Order(101, "Aashish", 2500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Amit", 5400),
                new Order(104, "Neha", 3100),
                new Order(105, "Priya", 1800)
        };

        System.out.println("\nQuick Sort:");

        quickSort(orders2, 0, orders2.length - 1);

        display(orders2);
    }
}