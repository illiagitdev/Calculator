package lesson19online;

import java.io.*;

public class Book implements /*Serializable*/ Externalizable {
    private int year;
    private String author;
    private String style;

    public Book(int year, String author, String style) {
        this.year = year;
        this.author = author;
        this.style = style;
    }

    public Book() {
        year = 0;
        author = " ";
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

    private void wrightObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.write(year);
        out.write(author.getBytes());
        out.write(style.getBytes());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        year = in.readInt();
        author = in.readLine();
        style = in.readLine();
    }

    public void show() {
        System.out.println(year + "   " + author + "   " + style);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.write(year);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.read();
    }
}
