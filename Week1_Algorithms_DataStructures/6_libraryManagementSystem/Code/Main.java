public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Harry Potter", "JK Rowling"),
            new Book(102, "The Lord Of The Rings", "JRR Tolkien"),
            new Book(103, "A Game of Thrones", "GRR Martin"),
            new Book(104, "Marvel Comics", "Stan Lee")
        };

        System.out.println("Linear Search for 'Algorithms':");
        Book found = LinearSearch.search(books, "Algorithms");
        System.out.println(found != null ? found : "Book not found.");

        BinarySearch.sortBooksByTitle(books);
        System.out.println(" Binary Search for 'Operating Systems':");
        found = BinarySearch.search(books, "Marvel Comics");
        System.out.println(found != null ? found : "Book not found.");
    }
}
