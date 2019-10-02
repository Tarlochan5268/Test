public class Article
{
    int Number;
    String title;
    Author author;
    float wage;
    String magazineName;
    int numberOfPages;

    public Article() {
    }

    public Article(int number, String title, Author author, float wage, String magazineName, int numberOfPages) {
        Number = number;
        this.title = title;
        this.author = author;
        this.wage = wage;
        this.magazineName = magazineName;
        this.numberOfPages = numberOfPages;
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

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineNmae(String magazineName) {
        this.magazineName = magazineName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Article{" +
                "Number=" + Number +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", wage=" + wage +
                ", magazineName='" + magazineName + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
