
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass
{
    public static float totalByRec(float income) {

        float total = 0;
        total += income;
        if (income == 0)
            return total;

        return totalByRec(income - 1);

    }
    public static void main(String[] args) {

        Publication obj1 = new Article(1,"Japanese History",new Author("Kishore","Narang"),10,"Japanese Magazine",2);
        obj1.calculateIncome();
        Publication obj2 = new Article(2,"Canada History",new Author("Karan","Kundan"),20,"Canada Magazine",22);
        obj2.calculateIncome();
        Publication obj3 = new Article(3,"Gujarat History",new Author("Nayna","Vagasiya"),30,"Gujarat Magazine",5);
        obj3.calculateIncome();
        Publication obj4 = new Book(4,"Japan Book Guide",new Author("Das","Singh"),100,"Japan Company",20);
        obj4.calculateIncome();
        Publication obj5 = new Book(5,"Canada Book Guide",new Author("Shivani","Dhiman"),200,"Canada Company",10);
        obj5.calculateIncome();
        ArrayList<Publication> publications = new ArrayList<Publication>();
        publications.add(obj1);
        publications.add(obj2);
        publications.add(obj3);
        publications.add(obj4);
        publications.add(obj5);
        boolean flag = true;
        while(flag)
        {
            System.out.println("Cases --->");
            System.out.println("1 -> user enter a last name of an author and print out the details of all their " +
                    "publications either a book or an article.");
            System.out.println("2 -> Using a recursive method find the total income for all authors.");
            System.out.println("3 -> Enter a publication number, find it then if its a book print the publisher, if an article print the magazine name");
            System.out.println("4 -> Print out first and last name of any author has an article with more than 20 pages");
            System.out.println("5 -> Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Case Number");

            int caseNumber = scanner.nextInt();

            switch (caseNumber)
            {
                case 1 :

                case 2 :
                    float totalIncome = 0;
                    for (Publication obj:publications)
                    {
                        System.out.println("author : "+obj.getAuthor());
                        System.out.println("income : "+obj.getIncome());
                        totalIncome = totalByRec(obj.getIncome());
                    }
                    System.out.println("Total Income : "+totalIncome);
                    break;
                case 3 :
                    System.out.println("Please Enter Publication Number : ");
                    int pubNumber = scanner.nextInt();
                    for (Publication obj:publications)
                    {
                        if(obj.Number == pubNumber)
                        {
                            if(obj instanceof Article)
                            {
                                System.out.println("Article Name : "+((Article) obj).getMagazineName());
                            }
                            else if(obj instanceof Book)
                            {
                                System.out.println("Publisher Name : "+((Book) obj).getPublisher());
                            }
                        }
                        System.out.println("Printed data");
                        break;
                    }
                case 4 :
                    for (Publication obj:publications)
                    {
                        if(obj instanceof Article)
                        {
                            if(((Article) obj).numberOfPages>20)
                            {
                                System.out.println("First Name : " + ((Article) obj).author.getFirstName());
                                System.out.println("Last Name : " + ((Article) obj).author.getLastName());
                            }
                        }
                    }
                    System.out.println("Printed data");
                    break;
                case 5 :
                    flag = false;
                    break;
            }
        }
    }
}
