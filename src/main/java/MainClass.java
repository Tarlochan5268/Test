import java.util.ArrayList;

public class MainClass
{
    public static void main(String[] args) {

        Publication obj1 = new Article(1,"Japanese History",new Author("Kishore","Narang"),10,"Japanese Magazine",2);
        Publication obj2 = new Article(2,"Canada History",new Author("Karan","Kundan"),20,"Canada Magazine",5);
        Publication obj3 = new Article(3,"Gujarat History",new Author("Nayna","Vagasiya"),30,"Gujarat Magazine",5);

        Publication obj4 = new Book(1,"Japan Book Guide",new Author("Das","Singh"),100,"Japan Company",20);
        Publication obj5 = new Book(2,"Canada Book Guide",new Author("Shivani","Dhiman"),200,"Canada Company",10);
        ArrayList<Publication> publications = new ArrayList<>();
        publications.add(obj1);
        publications.add(obj2);
        publications.add(obj3);
        publications.add(obj4);
        publications.add(obj5);


    }
}
