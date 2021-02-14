/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productComparator;

import java.util.Comparator;

/**
 *
 * @author utente
 */
public class ComparatorByPrice implements Comparator<Product>{
            @Override
        public int compare(Product o1, Product o2) {
            return (o1.getPrezzo()<o2.getPrezzo() ? -1 : o1.getPrezzo()>o2.getPrezzo() ? 1 : 0);
        }
    
}
