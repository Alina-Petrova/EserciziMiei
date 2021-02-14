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
public class App {
    public static void main(String[] args) {
        Product a = new Product("Sale", 0.60),
        b = new Product("Farina", 0.95),
        c = new Product("Caffe'", 2.54);
        
        ArrayList<Product> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c);       
        
        
        System.out.println(Product.getMostExpensive(l));
        System.out.println(b.compareTo(c));
        System.out.println(Product.myC.compare(b, c));
    }
}
