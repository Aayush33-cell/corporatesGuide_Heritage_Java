import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LibraryBookManagement {

    private ArrayList<String> catalog = new ArrayList<>();

    // Add a book to the catalog
    public void addBook(String title, String author) {
        catalog.add(title + " by " + author);
        System.out.println("Added: \"" + title + " by " + author + "\"");
    }

    // Remove a book by title
    public void removeBook(String title) {
        Iterator<String> iterator = catalog.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            String entry = iterator.next();
            if (entry.toLowerCase().startsWith(title.toLowerCase() + " by ")) {
                iterator.remove();
                System.out.println("Removed: \"" + entry + "\"");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No book found with title: \"" + title + "\"");
        }
    }

    // Search books by keyword (uses Iterator)
    public ArrayList<String> searchBook(String keyword) {
        ArrayList<String> results = new ArrayList<>();
        Iterator<String> iterator = catalog.iterator();

        while (iterator.hasNext()) {
            String entry = iterator.next();
            if (entry.toLowerCase().contains(keyword.toLowerCase())) {
                results.add(entry);
            }
        }

        if (results.isEmpty()) {
            System.out.println("No books found matching keyword: \"" + keyword + "\"");
        } else {
            System.out.println("\nSearch results for \"" + keyword + "\":");
            for (String book : results) {
                System.out.println("  -> " + book);
            }
        }

        return results;
    }

    // Display all books with index numbers
    public void displayAll() {
        if (catalog.isEmpty()) {
            System.out.println("Catalog is empty.");
            return;
        }
        System.out.println("\n--- Library Catalog ---");
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println((i + 1) + ". " + catalog.get(i));
        }
        System.out.println("-----------------------");
    }

    // Sort books alphabetically
    public void sortBooks() {
        Collections.sort(catalog);
        System.out.println("Catalog sorted alphabetically.");
    }

    // BONUS: Count books by a specific author
    public int countByAuthor(String author) {
        int count = 0;
        for (String entry : catalog) {
            // entry format: "Title by Author"
            String entryAuthor = entry.substring(entry.lastIndexOf(" by ") + 4);
            if (entryAuthor.equalsIgnoreCase(author)) {
                count++;
            }
        }
        System.out.println("Books by \"" + author + "\": " + count);
        return count;
    }

    public static void main(String[] args) {
        LibraryBookManagement library = new LibraryBookManagement();

        // Add at least 6 books
        System.out.println("=== Adding Books ===");
        library.addBook("Clean Code", "Robert Martin");
        library.addBook("The Pragmatic Programmer", "Andrew Hunt");
        library.addBook("Introduction to Algorithms", "Thomas Cormen");
        library.addBook("Design Patterns", "Gang of Four");
        library.addBook("Refactoring", "Robert Martin");
        library.addBook("The Clean Coder", "Robert Martin");
        library.addBook("Head First Java", "Kathy Sierra");

        // Display all books
        library.displayAll();

        // Remove a book
        System.out.println("\n=== Removing a Book ===");
        library.removeBook("Design Patterns");

        // Search by keyword
        System.out.println("\n=== Searching by Keyword ===");
        library.searchBook("Clean");

        // Sort and display
        System.out.println("\n=== Sorted Catalog ===");
        library.sortBooks();
        library.displayAll();

        // BONUS: Count by author
        System.out.println("\n=== Bonus: Count by Author ===");
        library.countByAuthor("Robert Martin");
    }
}