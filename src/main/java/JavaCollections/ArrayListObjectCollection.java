package JavaCollections;

import cucumber.api.java.eo.Se;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ArrayListObjectCollection {

    public  static void main(String args[]){

        ArrayList<Book> ltBook = new ArrayList<Book>();
        HashMap<Integer, Book> hmbooks = new HashMap<Integer, Book>();

        Book book1 = new Book(1236, "C#", "Programming in C#", "Stephen", "WROX Publication");
        Book book2 = new Book(1240, "APS.Net", "Programming in ASP.Net", "Stephen", "WROX Publication");
        Book book3 = new Book(3698, "SQL Sever", "Programming in SQL Server", "Stephen", "WROX Publication");


        ltBook.add(book1);
        ltBook.add(book2);
        ltBook.add(book3);

        hmbooks.put(book1.id, book1);
        hmbooks.put(book2.id, book2);
        hmbooks.put(book3.id, book3);


        System.out.println("The Book List Size is " + ltBook.size());

        System.out.println("The Book Details from the list are ....");

        // This is for Iterator
        System.out.println("This is Iterator........");
        Iterator it = ltBook.iterator();
        while(it.hasNext()){
            printBookDetails((Book) it.next());
        }

        /**
         *  This For look is with List Ittreate
         */
        System.out.println("This is List Iterator........");
        for (Book book:ltBook){
            printBookDetails(book);
        }

        System.out.printf("");
        System.out.println(" This is from Hashmap.......");
        for (Map.Entry<Integer, Book> entry:hmbooks.entrySet()){
            Book book = entry.getValue();
            printBookDetails(book);
        }

        int lastRow = 'A' + (11 -1);

        String sLastRow = String.valueOf('A' + (11 -1));

        for (char row = 'A'; row <= lastRow; row++){
            {
                for (int SeatNumber = 1; SeatNumber <= 10; SeatNumber++){
                    System.out.println(row + String.format("%02d", SeatNumber));
                }
            }
        }
    }

    /**+
     *
     * @param book
     */
    public static void printBookDetails(Book book){
        System.out.println("The Book Details are ......");
        System.out.println("ID           : " + book.id);
        System.out.println("Book Name    : " + book.sBookName);
        System.out.println("Title        : " + book.sTitle);
        System.out.println("Author       : " + book.sAuthor);
        System.out.println("Pulisher     : " + book.sPublisher);
        System.out.printf("");
    }

}
