package lesson13online;

public class Book {
    private final int year;
    private final String author;
    private String style;

    public Book() {
        this.year = 12;
        this.author = "author";
    }

    public Book(int year, String author, String style) {
        this.year = year;
        this.author = author;
        this.style = style;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
