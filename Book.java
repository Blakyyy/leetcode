

public class Book {

    private String name;
    private String author;
    private int yearPublished;
    private String isbn;
    private double price;
    
    public Book(String name, String author, int yearPublished, String isbn, double price) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.price = price;
    }
    

    public static void main(String[] args) {
    Book book1 = new Book("GreenMile", "Steven King", 1947, "ES239239232", 8.99);
    Book book2 = new Book("It", "Steven King", 1986, "ES959943322", 7.99);
    Book book3 = new Book("The Mist", "Steven King", 1980, "ES99439492", 12.59);
    Book book4 = new Book("The body", "Steven King", 1982, "ES93993293", 9.99);
    Book book5 = new Book("11/22/63", "Steven King", 2011, "ES43942234", 13.99);
    Object[] bookArray = new Object[5];
    bookArray[0] = book1;
    bookArray[1] = book2;
    bookArray[2] = book3;
    bookArray[3] = book4;
    bookArray[4] = book5;

    for (Object book : bookArray) {
        System.out.println(book.toString());
        
    }
    Book[] sortedBook = arrSortByPrice(bookArray);
    for (Object book : sortedBook) {
        System.out.println(book);
    }
    
    }

    public static Book[] arrSortByPrice(Object[] arrBooks){
        Book[] books = new Book[arrBooks.length];
        for (int i = 0; i < arrBooks.length; i++) {
            books[i] = (Book) arrBooks[i];
        }
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if(books[j].getPrice() > books[j+1].getPrice()){
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j+1] = temp;
                }
            }
        }
        return books;
    }
    

    
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    
    public int getYearPublished() {
        return yearPublished;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Books: name: " + name + ",\n author: " + author + ",\n yearPublished: " + yearPublished + ",\n isbn: " + isbn
                + ",\n price: " + price + "\n";
    }

}