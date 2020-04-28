import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

  private Book cosmos;
  private Book lotr1;
  private Book lotr2;
  private Book lotr3;
  private Book bread;
  private Library library;

  @Before
  public void before(){
    cosmos = new Book("Cosmos", "Carl Sagan", "Science");
    lotr1 = new Book("Fellowship of the Ring", "JRR Tolkien", "Fiction");
    lotr2 = new Book("The Two Towers", "JRR Tolkien", "Fiction");
    lotr3 = new Book("Return of the King", "JRR Tolkien", "Fiction");
    bread = new Book("Bread", "Hamelmyn", "Baking");
     library = new Library(3);
  }

  @Test
  public void canStockCount(){
    assertEquals(0, library.getStockCount());
  }

  @Test
  public void canAddBook(){
    library.addBook(cosmos);
    assertEquals(1, library.getStockCount());
  }

  @Test
  public void maxCapacity(){
    library.addBook(cosmos);
    library.addBook(lotr1);
    library.addBook(lotr2);
    library.addBook(lotr3);
    assertEquals(3, library.getStockCount());

  }
}
