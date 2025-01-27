package oops_concepts.ClassAndObjects;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
public class Example2 {
    public static void main(String[] args) {
        Books book = new Books();
        book.addBooks("Harry Potter");
        book.addBooks("physiology of money");
        book.addBooks("subconscious mind");
        book.displayBooks();
        book.removeBooks();
        book.displayBooks();

    }
}

class Books{
    List<String> list = new ArrayList<>();

    String Books;

    public void addBooks(String books){
        list.add(books);
    }

    public void removeBooks(){
        list.remove(list.size() - 1);
    }

    public void displayBooks(){
        if(list.size() == 0){
            System.out.println("No books is found");
        }
        else{
            for(String book : list){
                System.out.println("The book is " + book);
            }
        }
    }
}
