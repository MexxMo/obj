package sky.pro.course.les1.obj1;

public class Main {


    public static void main(String[] args) {

        Author author = new Author("Герберт", "Шилдт");
        Author author1 = new Author("Брюс", "Эккель");


        Book book = new Book("Java. Руководство для начинающих", author, 2019);
        Book book1 = new Book("Философия JAVA", author1, 2015);

        book1.setPublishingYear(2022);

        System.out.println("Книга 1 = " + book);
        System.out.println("Книга 2 = " + book1);
    }

}
