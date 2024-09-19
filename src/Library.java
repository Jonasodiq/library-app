public class Library {
}

//Instansvariabler:
//books: List (lista över böcker i biblioteket)
//Metoder:
//Constructor():
//Skapa en tom books-lista.
//addBook(book):
//Lägg till book i books.
//Visa meddelande att boken har lagts till biblioteket med en smiley.
//showBooks():
//Om books är tom:
//Visa meddelande att det inte finns några böcker i biblioteket.
//Annars:
//För varje bok i books:
//Visa bokinformationen med en smiley.
//loanBook(title):
//För varje bok i books:
//Om bokens titel matchar title (ignorera skiftlägeskänslighet):
//Anropa loanBook()-metoden för den boken.
//Avsluta metoden.
//Om ingen bok hittas:
//Visa meddelande att boken inte hittades med en smiley.
//returnBook(title):
//För varje bok i books:
//Om bokens titel matchar title (ignorera skiftlägeskänslighet):
//Anropa returnBook()-metoden för den boken.
//Avsluta metoden.
//Om ingen bok hittas:
//Visa meddelande att boken inte hittades med en smiley.
//reserveBook(title, userName):
//För varje bok i books:
//Om bokens titel matchar title (ignorera skiftlägeskänslighet):
//Anropa reserve()-metoden för den boken med userName.
//Avsluta metoden.
//Om ingen bok hittas:
//Visa meddelande att boken inte hittades med en smiley.
//searchBook(keyword):
//Sätt found till false.
//Visa meddelande att sökning påbörjas med en smiley.
//För varje bok i books:
//Om bokens titel eller författare innehåller keyword (ignorera skiftlägeskänslighet):
//Visa bokens information med en smiley.
//Sätt found till true.
//Om ingen bok hittades:
//Visa meddelande att ingen bok matchade söktermen med en smiley.
