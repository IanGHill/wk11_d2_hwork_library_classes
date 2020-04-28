import java.util.ArrayList;

public class Library {

  private ArrayList<Book> stock;
  private int capacity;

  public Library(int capacity){
    this.capacity = capacity;
    this.stock = new ArrayList<Book>();
  }
  public int getStockCount() {
    return this.stock.size();
  }

  public void addBook(Book book) {
    if (getStockCount() < this.capacity) {
      stock.add(book);
    }
  }

  public void lendOut(Book book) {
    stock.remove(book);
  }
}
