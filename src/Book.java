public class Book {


}

//Instansvariabler:
//
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
