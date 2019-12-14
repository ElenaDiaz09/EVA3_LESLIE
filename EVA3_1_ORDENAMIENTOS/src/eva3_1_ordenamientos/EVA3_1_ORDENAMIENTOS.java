/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamientos;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int [25];
       /** llenar(datos);
        imprimir(datos);
        long ini, fin;
        ini  = System.nanoTime();
        selectionSort(datos);
         fin  = System.nanoTime();
        imprimir(datos);
        System.out.println("TIEMPO= " + (fin-ini));
        //---------------------------------------
        llenar(datos);
        imprimir(datos);
        ini  = System.nanoTime();
        insertionSort(datos);
        fin  = System.nanoTime();
       imprimir(datos);
       System.out.println("TIEMPO= " + (fin-ini));
       //-------------------------------------------
       
        llenar(datos);
        imprimir(datos);
        ini  = System.nanoTime();
        bubbleSort(datos);
        fin  = System.nanoTime();
        imprimir(datos);
        System.out.println("TIEMPO= " + (fin-ini));*/
        llenar(datos);
        imprimir(datos);
        selectionSort(datos);
        imprimir(datos);
        
        Scanner input = new Scanner(System.in);
        System.out.println("VALOR A BUSCAR");
        int val1 = input.nextInt();
        System.out.println("posicion: " + busquedaBin(datos, val1));
        
       
    }
    
    
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100);
            
            
        }
        
    }
    
    public static void imprimir(int[]arreglo){
         for (int i = 0; i < arreglo.length; i++) {
             System.out.print("[" + arreglo[i] + "]");
             
         }
        System.out.println("");
    }
    //MAS COMPARACIONES MENOS INTERCAMBIOS
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
        int min = i;    
            for (int j = i+1; j < arreglo.length; j++) {
                if(arreglo[j] < arreglo[min])
                    min = j;
        }
            //SWAP
            int temp = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
         
        }
    }

     //MENOS COMPARACIONES MAS INTERCAMBIOS
    public static void insertionSort(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];
            int insP;
            for (insP = i; insP > 0; insP--) {
                int prev = insP-1;
                if(arreglo[prev] > temp) {
                    //SWAP
                    arreglo[insP] = arreglo[prev];     
                }else
                    break;
            }
            arreglo[insP] = temp;
        }
            
        }
    public static void bubbleSort(int[] arreglo){
        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < arreglo.length -1; j++) {
                if(arreglo[j] > arreglo[j+1]){
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j+1] = temp;
            }
                
            }
            
        }
        
    } 
    public static void quickSort (int[] arreglo){
        quickSortRec(arreglo, 0, arreglo.length- 1);
     
    } 
    
   private static void quickSortRec(int[] arreglo, int ini, int fin){
       //DETENERTE
       if((ini < fin) && (ini >=0) &&(fin < arreglo.length)){  
       int piv = ini;
       int too_big = ini +1;
       int too_small = fin;
       int temp;
       while(too_big < too_small){
       while((too_big < fin) && (arreglo[too_big] < arreglo[piv]))
           too_big++;
       
        while((too_small > (ini +1)) && (arreglo[too_small] > arreglo[piv]))
           too_small--;
       
        
        if(too_big < too_small){ //NO SE HAN CRUZADO
            temp = arreglo[too_big];
            arreglo[too_big] = arreglo[too_small];
            arreglo[too_small] = temp;
        }
   }   
    
       //SWAP CON EL PIVOTE
       temp = arreglo[piv];
       arreglo[piv] = arreglo[too_small];
       arreglo[too_small] = temp;
       
       quickSortRec(arreglo, ini, too_small -1); //IZQ
       quickSortRec(arreglo, too_small +1, fin); //DER
       
}
   }  
       public static int busquedaBin(int[] arreglo, int val){
           return busquedaBinRec(arreglo, val, 0, arreglo.length-1);
       }
       
       public static int busquedaBinRec(int[] arreglo,int val, int ini, int fin){
        if(ini<=fin){
           int mid = ini + ((fin- ini) /2);
        
           
           
         if(val ==arreglo[mid]){//igual
            return mid;
        }else if (val> arreglo[mid]){//mayor
            return busquedaBinRec(arreglo, val, mid +1, fin);
        }else{ //menor
            return busquedaBinRec(arreglo, val, ini, mid -1);
        }
    }else 
         return -1;
}


}

