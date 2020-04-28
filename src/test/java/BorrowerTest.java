import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

  private Book cosmos;
  private Book lotr1;
  private Book lotr2;
  private Book lotr3;
  private Book bread;
  private Library library;

  private Borrower ian;

  @Before
  public void before(){
    ian = new Borrower("Ian");
    cosmos = new Book("Cosmos", "Carl Sagan", "Science");
    lotr1 = new Book("Fellowship of the Ring", "JRR Tolkien", "Fiction");
    lotr2 = new Book("The Two Towers", "JRR Tolkien", "Fiction");
    lotr3 = new Book("Return of the King", "JRR Tolkien", "Fiction");
    bread = new Book("Bread", "Hamelmyn", "Baking");
    library = new Library(3);
  }
  @Test
  public void hasName(){
    assertEquals("Ian", ian.getName());
  }

  @Test
  public void canBorrowBook(){
    library.addBook(cosmos);
    library.addBook(bread);
    ian.borrowBook(library, bread);
    assertEquals(1, library.getStockCount());

  }
}
