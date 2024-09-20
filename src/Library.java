import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("📗 " + book.getTitle() + " added to the library! 📚");
    }

    // Display all available books
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("❌ No books in the library. 📂");
        } else {
            System.out.println("📚 Library Catalog:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Loan a book by title
    public void loanBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.loanBook();
                return;
            }
        }
        System.out.println("⚠️ Book not found! 🔍");
    }

    // Return a book by title and check for reservations
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("⚠️ Book not found! 🔍");
    }

    // Reserve a book by title and username
    public void reserveBook(String title, String userName) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.reserve(userName);
                return;
            }
        }
        System.out.println("⚠️ Book not found! 🔍");
    }

    // Search for books by title or author
    public void searchBook(String keyword) {
        boolean found = false;
        System.out.println("🔍 Searching for books matching: '" + keyword + "'...");
        for (Book book : books) {
            // Check if the keyword matches either title or author
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                //System.out.println(book);
                System.out.println("✅ Found: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No books found matching: " + keyword + " 📂");

        }
    }
}

// TODO List
// books: List (lista över böcker i biblioteket)

// Constructor()
// Skapa en tom books-lista.

// addBook(book)
// Lägg till book i books.
// Visa meddelande att boken har lagts till biblioteket med en smiley.

// showBooks()
// Om books är tom: Visa meddelande att det inte finns några böcker i biblioteket.
// Annars: För varje bok i books:
// Visa bokinformationen med en smiley.

// loanBook(title)
// För varje bok i books:
// Om bokens titel matchar title (ignorera):
// Anropa loanBook()-metoden för den boken.
// Om ingen bok hittas: Visa meddelande att boken inte hittades med en smiley.

// returnBook(title)
// För varje bok i books:
// Om bokens titel matchar title (ignorera):
// Anropa returnBook()-metoden för den boken.
// Om ingen bok hittas: Visa meddelande att boken inte hittades med en smiley.

// reserveBook(title, userName)
// För varje bok i books:
// Om bokens titel matchar title (ignorera skiftlägeskänslighet):
// Anropa reserve()-metoden för den boken med userName.
// Om ingen bok hittas: Visa meddelande att boken inte hittades med en smiley.

// searchBook(String keyword)
// Sätt found till false.
// Visa meddelande att sökning påbörjas med en smiley.
// För varje bok i books:
// Om bokens titel eller författare innehåller keyword (ignorera)
// Visa bokens information med en smiley.
// Sätt found till true.
// Om ingen bok hittades: Visa meddelande att ingen bok matchade söktermen med en smiley.

