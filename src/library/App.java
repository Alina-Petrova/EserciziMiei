/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *Realizzare per una biblioteca le classi Library e Book. Un oggetto Book è caratterizzato dal suo
titolo. La classe Library ore le seguenti funzionalità:
 Un costruttore senza argomenti che crea una biblioteca vuota.
 Il metodo addBook aggiunge un libro alla biblioteca. Se il libro era già stato aggiunto,
restituisce false.
 Il metodo loanBook prende un libro come argomento e lo dà in prestito, a patto che sia
disponibile. Se quel libro è già in prestito, restituisce false. Se quel libro non è mai stato
inserito nella biblioteca, lancia un'eccezione.
 Il metodo returnBook prende un libro come argomento e restituisce quel libro alla biblioteca.
Se quel libro non era stato prestato col metodo loanBook, il metodo returnBook lancia
un'eccezione.
 Il metodo printLoans stampa la lista dei libri attualmente
 * @author utente
 */
public class App {
    public static void main(String[] args) throws BookNotExistExeption{
        Library lib = new Library();
        Book a = new Book("a"), b = new Book("b"), c = new Book("c");
        System.out.println( lib .addBook(a));
        System.out.println( lib .addBook(b));
        System.out.println( lib .addBook(c));
        System.out.println( lib .addBook(a));
        System.out.println( lib . loanBook(b));
        System.out.println( lib . loanBook(a));
        lib .stampaLoans();
    }    
}
