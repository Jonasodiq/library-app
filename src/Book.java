import java.util.ArrayList;

public class Book {

    // Instansvariabel
    private String title;
    private String author; // Ny instansvariabel för författare
    private int year;
    private String edition;
    private boolean isLoaned;
    private ArrayList<String> reservationList;

    // Constructor
    public Book(String title, String author, int year, int edition) {
        this.title = title;
        this.author = author;  // Sätter författaren
        this.year = year;
        this.edition = String.valueOf(edition);
        this.isLoaned = false;
        this.reservationList = new ArrayList<>();
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getEdition() {
        return edition;
    }

    // Loan the book
    public void loanBook() {
        if (!isLoaned) {
            isLoaned = true; // Om boken inte är utlånad, sätt isLoaned till true
            System.out.println("\uD83D\uDCD7 " + title + " has been loaned! ✅");
        } else { // Om boken redan är utlånad, skriv ett meddelande
            System.out.println("⚠️ " + title + " is already loaned. ⛔");
        }
    }

    // Return the book
    public void returnBook() {
        if (isLoaned) {
            isLoaned = false;// Om boken är utlånad, markera den som returnerad
            System.out.println("\uD83D\uDCD9 " + title + " has been returned! 🎉");
            // Check for reservations / Kontrollera om någon har reserverat boken
            if (!reservationList.isEmpty()) {
                String firstInLine = reservationList.remove(0); // Ta bort den första personen i reservlistan
                System.out.println("📘 The book is now reserved for " + firstInLine + ". \uD83D\uDDC2");
                isLoaned = true;  // Boken lånas till den första i reservlistan
            }
        } else { // Om boken inte var utlånad, visa detta
            System.out.println("⚠️ " + title + " was not loaned. ⏳");
        }
    }

    // Reserve the book
    public void reserve(String userName) {
        if (isLoaned) {
            reservationList.add(userName); // Om boken är utlånad, lägg till användaren i reservlistan
            System.out.println("✅ " + userName + " has reserved the book: " + title + " 📚");
        } else { // Om boken är tillgänglig, informera användaren
            System.out.println("✅ The book is available and can be loaned! 📖");
        }
    }

    @Override
    public String toString() { // Ge info om boken
        return "📗 Title: " + title + ", 🖋Author: " + author + ", 📅 Year: " + year + ", 📑 Edition: " + edition +
                (isLoaned ? " (🔒 Loaned)" : " (🔓 Available)");
    }
}

//Instansvariabler:
//title: String
//author: String
//year: int
//edition: String
//isLoaned: boolean (spårar om boken är utlånad)
//reservationList: List (lista för reserverade användare)
//Metoder:
//Constructor (title, author, year, edition):
//Skapa en bok med specifikt title, author, year och edition.
//Sätt isLoaned till false.
//Skapa en tom reservationList.
//getTitle():
//Returnera title.
//getAuthor():
//Returnera author.
//getYear():
//Returnera year.
//getEdition():
//Returnera edition.
//loanBook():
//Om isLoaned är false:
//Sätt isLoaned till true.
//Visa meddelande att boken har lånats ut med en smiley.
//Annars:
//Visa meddelande att boken redan är utlånad.
//returnBook():
//Om isLoaned är true:
//Sätt isLoaned till false.
//Visa meddelande att boken har returnerats med en smiley.
//Om reservationList inte är tom:
//Ta bort första användaren från listan.
//Visa att boken nu är reserverad för denna användare.
//Sätt isLoaned till true för att markera att boken är bokad.
//Annars:
//Visa meddelande att boken inte var utlånad.
//reserve(userName):
//Om isLoaned är true:
//Lägg till userName i reservationList.
//Visa meddelande att användaren har reserverat boken.
//Annars:
//Visa meddelande att boken är tillgänglig och kan lånas direkt.
//toString():
//Returnera en sträng som beskriver bokens titel, författare, år, upplaga och om den är utlånad eller tillgänglig.
