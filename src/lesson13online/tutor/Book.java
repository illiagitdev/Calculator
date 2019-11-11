package lesson13online.tutor;

public final class Book {
    private final int year;
    private final String autor;
    private String syle;

    public Book() {
        this.year = 0;
        this.autor = "";
    }

    public Book(int year, String autor, String syle) {
        this.year = year;
        this.autor = autor;
        this.syle = syle;
    }

    public int getYear() {
        return year;
    }

    public String getAutor() {
        return autor;
    }

    public String getSyle() {
        return syle;
    }

    public void setSyle(String syle) {
        this.syle = syle;
    }
}
