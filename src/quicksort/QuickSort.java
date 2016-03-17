package quicksort;

public class QuickSort {

    public static void main(String[] args) {
        int Array[] = {6,5,1,3,8,4,7,9,2};
            System.out.println("Original");
            leer(Array);
            System.out.println("");
            int izq = 0;
            int der = Array.length-1;
            quicksort(Array,izq,der);
            System.out.println("Final");
            leer(Array);
    }
    
 public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) 
         i++; // busca elemento mayor que pivote
         leer(A);
         System.out.println("");
        while(A[j]>pivote) 
            j--;         // busca elemento menor que pivote
        leer(A);
        System.out.println("");
        
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j];
         A[j]=aux;
         leer(A);
         System.out.println("");
     }
   }
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1){
       quicksort(A,izq,j-1); // ordenamos subarray izquierdo
       leer(A);
       System.out.println("");
   }
   
   if(j+1 <der){
      quicksort(A,j+1,der); // ordenamos subarray derecho
      leer(A);
       System.out.println("");
   }
   
}

    public static void leer(int[]Array){
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+" ");
        }
    }
    
}

