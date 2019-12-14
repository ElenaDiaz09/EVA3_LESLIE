/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_comparator;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author LESLIE JOHANA PEÑA HERNANDEZ. 18550680.
 */
public class EVA3_2_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList <Integer>  listaEnla = new LinkedList <Integer>();
       listaEnla.add(100);
       listaEnla.add(200);
       listaEnla.add(300);
       listaEnla.add(500);
       listaEnla.add(900);
       listaEnla.add(700);
       listaEnla.add(400);
       listaEnla.add(10000000);
       listaEnla.add(2150);
       listaEnla.add(2180);
       listaEnla.add(210);
              
        System.out.println(listaEnla);
        
        
            Comparator c = new Comparator(){
           @Override
           public int compare(Object o1, Object o2) {
               int resu;
               //CERO---> IGUAL
               //POSITIVO--> MAYOR
               //NEGATIVO---> MENOR
               Integer val1, val2;
               val1 =(Integer) o1;
               val2 =(Integer) o2;
               resu = val1- val2;
               return resu;
               
           }
            };
            
    listaEnla.sort(c);
        System.out.println(listaEnla);
        
        //ORDENAMOS UNA LISTA DE STRING
        LinkedList<String> listaSt = new LinkedList<>();
        listaSt.add("HOLA");
        listaSt.add(" ");
        listaSt.add("MUNDO");
        listaSt.add(" ");
        listaSt.add("CRUEL");
        listaSt.add("!!");
       Comparator cSt = new Comparator(){
           @Override
           public int compare(Object o1, Object o2) {
            String cad1 = (String) o1;
            String cad2 = (String) o2;
            
            char c1 = cad1.charAt(0);
            char c2 = cad2.charAt(0);
            return c1-c2;
            
           }
       };
        System.out.println(listaSt);
       listaSt.sort(cSt);
        System.out.println(listaSt);
}
}