package sky.pro.course.les1.obj1;

public class Book {
    private final String title;
    private final Author author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "\"" + this.title + "\", " + this.author + ", " + this.publishingYear;
    }

}
