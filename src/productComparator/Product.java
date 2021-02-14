/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productComparator;

import java.util.ArrayList;

/**
 *
 * @author utente
 */
public class Product implements Comparable<Product> {
    private String descrizione;
    private double prezzo;
    public static ComparatorByPrice myC = new ComparatorByPrice();

    public Product(String descrizione, double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public int compareTo(Product o) {
        return descrizione.compareTo(o.descrizione);
    }

    @Override
    public String toString() {
        return "Product{" + "descrizione=" + descrizione + ", prezzo=" + prezzo + '}';
    }

    public static Product getMostExpensive(ArrayList<Product> list) {        
        list.sort(myC);        
        return list.get(list.size()-1);
    }

          
}
