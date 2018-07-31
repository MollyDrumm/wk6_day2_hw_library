import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book;
    Library library;
    @Before
    public void before(){
        library = new Library();
//
    }
    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryHasBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
        library.removeBook();
        assertEquals(0, library.bookCount());
    }
}
