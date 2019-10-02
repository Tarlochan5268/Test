public class Book extends Publication
{
    int Number;
    String title;
    Author author;
    float price;
    String publisher;
    int numberOfCopies;
    float income;

    public Book() {
    }

    public Book(int number, String title, Author author, float price, String publisher, int numberOfCopies) {
        Number = number;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        calculateIncome();
    }
    void calculateIncome()
    {
        float sub = this.price * (float) this.numberOfCopies;
        System.out.println("sub : "+sub);
        float sub2 = (float) (sub*0.2);
        System.out.println("sub2 : "+sub2);
        income = (float) (sub - sub2);
        System.out.println("innnn : "+income);
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

    @Override
    public float getIncome() {
        return income;
    }

    @Override
    public void setIncome(float income) {
        this.income = income;
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
