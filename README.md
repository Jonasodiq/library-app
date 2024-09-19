# Library Management System 📚

This is a simple library management system implemented in Java. The system allows users to add, loan, return, reserve, and search for books in the library.

## Features ✨

- **Add a Book**: Add new books to the library's collection.
- **Show All Books**: Display a list of all available and loaned books.
- **Loan a Book**: Mark a book as loaned.
- **Return a Book**: Return a loaned book and check if it is reserved.
- **Reserve a Book**: Reserve a book if it is currently loaned out.
- **Search for Books**: Search for books based on title or author.

## Classes 🏷️

### `Book`
- **Attributes**:
    - `title`: The title of the book.
    - `author`: The author of the book.
    - `year`: The publication year of the book.
    - `edition`: The edition of the book.
    - `isLoaned`: Whether the book is currently loaned.
    - `reservationList`: A list of users who have reserved the book.
- **Methods**:
    - `loanBook()`: Marks the book as loaned.
    - `returnBook()`: Returns the book and checks for reservations.
    - `reserve(userName)`: Reserves the book for a user.
    - `toString()`: Provides a string representation of the book.

### `Library`
- **Attributes**:
    - `books`: A list of books in the library.
- **Methods**:
    - `addBook(Book book)`: Adds a new book to the library.
    - `showBooks()`: Displays all books in the library.
    - `loanBook(String title)`: Loans a book by its title.
    - `returnBook(String title)`: Returns a book by its title and checks for reservations.
    - `reserveBook(String title, String userName)`: Reserves a book for a user.
    - `searchBook(String keyword)`: Searches for books by title or author.

## Usage 🛠️

1. **Run the Program**: Execute the `Main` class to start the library management system.
2. **Choose an Option**: Select an option from the menu to interact with the library.
3. **Follow Prompts**: Provide the necessary inputs as prompted by the application.

## Example
```
📚Add book-1 
👀Show books-2 
📦Loan book-3
📤Return book-4 
🔍Search books-5
🏆Reserve a book-6
➡️Exit-7

Choose an option: 1 Enter title: Java Programming Enter author: John Doe Enter year: 2023 Enter edition: 1
```
## Author
```
Jonas N
```
## License
- This project is licensed under the MIT License - see the LICENSE file for details.
- This `README.md` file provides an overview of the project, describes the features of the class,and shows examples of how the class can be used.
  You can customize it further to suit your needs. 😊