public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) { // jeśli nie ma voi to zawsze return
        Book book = new Book(author, title);
        return book;
    }
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.author);
        System.out.println(book.title);
        System.out.println(book.author);
    }
}





