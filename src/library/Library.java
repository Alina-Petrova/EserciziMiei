/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author utente
 */
public class Library {
    Map <Book,Boolean> books = new HashMap<>();
    Queue<Book> booksInPrestito = new LinkedList<>();
    
    public Library() {
    }
    
    public boolean addBook(Book book) {
        boolean ris=false;
        if(!books.containsKey(book)){
            ris = true;
            books.put(book, false);
        }            
        return ris;
    }
    
    public boolean loanBook(Book book) throws BookNotExistExeption {
        boolean ris=false;
        if(!books.containsKey(book))
            throw  new BookNotExistExeption("Questo libro nella libreria non esiste");
        if(books.get(book).equals(false)) {
            books.put(book, true);
            booksInPrestito.offer(book);
            ris = true;
        }
        return ris;
    }
    
    public boolean returnBook(Book book) throws BookNotExistExeption {
        boolean ris=false;
        if(!booksInPrestito.contains(book))
           throw  new BookNotExistExeption("Questo libro non appatriene a questa libreria");
        books.put(book, false);
        booksInPrestito.remove(book);
        return ris;
    }
    
    public void stampaLoans() {
        System.out.println("Libri in prestito: \n");
        booksInPrestito.forEach(System.out::println);        
    }
    
}
