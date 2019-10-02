public class Book
{
    int Number;
    String title;
    Author author;
    float price;
    String publisher;
    int numberOfCopies;

    public Book() {
    }

    public Book(int number, String title, Author author, float price, String publisher, int numberOfCopies) {
        Number = number;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Number=" + Number +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
