import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collectionOfBooks;

    public Library(){
        collectionOfBooks = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.collectionOfBooks.size();
    }

    public void addBook(Book book){
         this.collectionOfBooks.add(book);
    }

    public Book removeBook(){
        return this.collectionOfBooks.remove(0);
    }
}
