public class Book {

  private String name;
  private String author;
  private String genre;

  public Book(String name, String author, String genre) {
    this.name = name;
    this.author = author;
    this.genre = genre;
  }

  public String getBookName() {
    return this.name;
  }

  public String getBookAuthor() {
    return this.author;
  }

  public String getBookGenre() {
    return this.genre;
  }
}
