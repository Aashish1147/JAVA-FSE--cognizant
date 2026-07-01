public class LibraryManagementSystem {

    static Book[] books = {
        new Book(101, "Algorithms", "Thomas"),
        new Book(102, "C Programming", "Dennis"),
        new Book(103, "Data Structures", "Mark"),
        new Book(104, "Java", "James"),
        new Book(105, "Python", "Guido")
    };

    static void linearSearch(String title) {

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found");
                System.out.println(book.bookId + " " + book.title + " " + book.author);
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    static void binarySearch(String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = books[mid].title.compareToIgnoreCase(title);

            if (result == 0) {
                System.out.println("Book Found");
                System.out.println(books[mid].bookId + " " + books[mid].title + " " + books[mid].author);
                return;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Book Not Found");
    }

    public static void main(String[] args) {

        System.out.println("Linear Search:");
        linearSearch("Java");

        System.out.println();

        System.out.println("Binary Search:");
        binarySearch("Java");
    }
}

class Book {

    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}