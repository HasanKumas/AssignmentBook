import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<Author> authors = new ArrayList<>();

    public Library() {
        //creating authors
        Author author1 = new Author("Koen", "koen.griffioen@capgemini.com", 26, "m");
        Author author2 = new Author("Alice Munro", "", 88, "f");
        //authors added to list
        authors.add(author1);
        authors.add(author2);

        //creating books for Alice Munro
        Book book1 = new Book ("Selected Stories", 16.99, 15000000, author2, 1996);
        Book book2 = new Book ("The moons of Jupiter", 14.99, 1000000, author2, 1988);
        //creating books for Koen
        Book book3 = new Book ("Thoughts on Java", 1.99, 1, author1, 2020);
        Book book4 = new Book ("Thoughts on Dotnet", 4.99, 2, author1, 2020);
        //books added to list
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }

    public void printFemaleWrittenBooks(){
        for (Book book: books) {
            if(book.author.getGender().equals("f")){
                System.out.println(book.toString());
            }
        }

    }
    public void printMaleWrittenBooks(){
        for (Book book: books) {
            if(book.author.getGender().equals("m")){
                System.out.println(book.toString());
            }
        }

    }
    public void totalRevenue(){
        for (Author author: authors) {
            double revenue = 0;
            double totalRevenue = 0;
            for (Book book: books) {
                if(author.equals(book.author)){
                    revenue = book.getPrice()*book.getQuantity();
                }
                totalRevenue += revenue;
            }
            System.out.println("The total revenue of "+ author.getName()+ "is "+ totalRevenue);

            }
    }

}
