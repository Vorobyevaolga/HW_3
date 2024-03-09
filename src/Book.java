import java.util.Objects;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearBook;

    public String getNameBook() {
        return nameBook;
    }

    public Author getNnameAuthor() {
        return nameAuthor;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }


    public Book(String nameBook, Author nameAuthor, int yearBook) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearBook = yearBook;
    }

    @Override
    public String toString() {
        return "Название:"+ nameBook+". Автор : "+ nameAuthor + ". Год выпуска: "+yearBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(nameAuthor, book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, nameAuthor, yearBook);
    }
}
