import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
  private Book cosmos;

  @Before
  public void before(){
   cosmos = new Book("Cosmos", "Carl Sagan", "Science");
  }

  @Test
  public void hasName(){
    assertEquals("Cosmos", cosmos.getBookName());
  }

  @Test
  public void hasAuthor(){
    assertEquals("Carl Sagan", cosmos.getBookAuthor());
  }

  @Test
  public void hasGenre(){
    assertEquals("Science", cosmos.getBookGenre());
  }

}
