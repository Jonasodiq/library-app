// 18 Sep 2024 Jonas N Library-app

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Hadis", "Buxoriy", 2002, 2000));
        library.addBook(new Book("Kabair", "Zahabiy", 2005, 3000));
        library.addBook(new Book("Tafsir", "Jalalayn", 2009, 500));
        library.addBook(new Book("Sirat", "Buxoriy", 2020, 1500));
        library.addBook(new Book("Hadis", "Muslim", 2023, 1000));

        while (true) {
            try {
                System.out.println("\uD83D\uDCDA Add book-1");
                System.out.println("\uD83D\uDC40 Show books-2 ");
                System.out.println("\uD83D\uDCE4 Loan book-3 ");
                System.out.println("\uD83D\uDCE5 Return book-4");
                System.out.println("\uD83D\uDD0D Search books-5");
                System.out.println("\uD83D\uDDC4 Reserve a book-6");
                System.out.println("➡\uFE0F Exit-7");

                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                switch (choice) {
                    case 1:
                        // Add a new book
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter year: ");
                        int year = getIntInput(scanner);
                        System.out.print("Enter edition: ");
                        int edition = getIntInput(scanner);

                        library.addBook(new Book(title, author, year, edition));
                        System.out.println("📗 The book '" + title + "' by " + author + " has been added to the library!\uD83D\uDCDA");
                        break;
                    case 2:
                        // Show available books
                        library.showBooks();
                        break;
                    case 3:
                        // Loan a book
                        System.out.print("Enter title to loan: ");
                        title = scanner.nextLine();
                        library.loanBook(title);
                        break;
                    case 4:
                        // Return a book
                        System.out.print("Enter title to return: ");
                        title = scanner.nextLine();
                        library.returnBook(title);
                        break;
                    case 5:
                        // Search for books
                        System.out.print("Enter keyword to search (title or author): ");
                        String keyword = scanner.nextLine();
                        library.searchBook(keyword);
                        break;
                    case 6:
                        // Reserve a book
                        System.out.print("Enter title to reserve: ");
                        title = scanner.nextLine();
                        System.out.print("Enter your name: ");
                        String userName = scanner.nextLine();
                        library.reserveBook(title, userName);
                        break;
                    case 7:
                        // Exit
                        System.out.println("Goodbye!👋 Thanks for using the library system! \uD83D\uDE00");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice, try again \uD83D\uDC49\uD83C\uDFFC1-7 \uD83D\uDD22.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number. \uD83D\uDD22");
                scanner.nextLine();  // Clear the buffer
            }
        }
    }

    private static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number. \uD83D\uDD22");
                scanner.nextLine();  // Clear the buffer
            }
        }
    }
}

// TODO List
// Skapa ett nytt Library
// Skapa en Scanner för att läsa indata
// Lägg till några böcker

// Starta en oändlig loop:(while)
// Visa meny med alternativen:
// 1.Lägg till bok
// 2.Visa böcker
// 3.Låna bok
// 4.Returnera bok
// 5.Sök böcker
// 6.Reservera bok
// 7.Avsluta

// Be användaren att välja ett alternativ
// Hantera valen med en switch-sats:
// Om valet är 1: Be användaren att ange titel, författare, år och upplaga.
// Lägg till boken i biblioteket med addBook()
// Om valet är 2: Visa alla böcker med showBooks()
// Om valet är 3: Be användaren att ange titeln på boken de vill låna.
// Låna boken med loanBook()
// Om valet är 4: Be användaren att ange titeln på boken de vill returnera.
// Returnera boken med returnBook()
// Om valet är 5: Be användaren att ange ett sökord (titel eller författare)
// Sök efter böcker med searchBook()
// Om valet är 6: Be användaren att ange titeln på boken och deras namn.
// Reservera boken med reserveBook()
// Om valet är 7: Visa ett hejdå-meddelande med en smiley och avsluta programmet.
// Om ogiltig input ges, fånga undantaget (try-catch) och visa ett felmeddelande med en smiley.
