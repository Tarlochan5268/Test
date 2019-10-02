public class Publication
{
    int Number;
    String title;
    Author author;
    float income;

    @Override
    public String toString() {
        return "Publication{" +
                "Number=" + Number +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", income=" + income +
                '}';
    }

    public Publication() {
    }

    public Publication(int number, String title, Author author) {
        Number = number;
        this.title = title;
        this.author = author;
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

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }
}
