public class Book {
    private  String name;
    private  double price;
    private int quantity;
    public Author author;
    private int year;

    public Book(String name, double price, int quantity, Author author, int year) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString(){
        return "The name of the book: "+ this.name +
                "\nThe price: "+ this.price+
                "\nQuantity: "+ this.quantity+
                "\nWritten by: "+this.author.getName()+
                "\nYear: "+this.year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
