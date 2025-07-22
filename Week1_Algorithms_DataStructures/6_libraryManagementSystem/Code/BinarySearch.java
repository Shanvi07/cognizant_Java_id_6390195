import java.util.Arrays;

public class BinarySearch {

    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title)); 
    }

    public static Book search(Book[] books, String targetTitle) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareTo(targetTitle);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
