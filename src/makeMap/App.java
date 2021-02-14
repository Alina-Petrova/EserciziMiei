/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author utente
 */
public class App {

    /**
     * Il metodo statico makeMap accetta una lista di chiavi e una lista di valori (di pari lunghezza), e
restituisce una mappa ottenuta accoppiando ciascun elemento della prima lista al corrispondente
elemento della seconda lista.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Integer> lKey = new ArrayList<>(5);
        List <String> lVal = new ArrayList<>(5);
        for(int i=0; i<9; i++){
            lKey.add(++i);            
        } 
        lVal.add("A");lVal.add("B");lVal.add("C");lVal.add("D");lVal.add("E");
        
        Map <Integer, String> m1 = new HashMap<>();
        m1 = makeMap(lKey,lVal);
        stampaMap(m1);
        
    }
    public static <K,V> Map<K,V> makeMap(List <K> keys, List <V> vals) {
        Map ris = new HashMap();
        for(int i=0; i<keys.size(); i++) {
            ris.put(keys.get(i), vals.get(i));
        }
        return ris;
    }
    public static <K,V> void stampaMap(Map<K,V> map) {
        System.out.println("La mappa: \n");
        System.out.println(map.toString());        
    }
}
