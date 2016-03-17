package hepsort;

public class Hepsort {
    
    public static int vect[];
    
    public static void bajarNodo(int []a, int start, int last){
        int nodoRaiz = 0;//limite de que tan abajo vamos a llegar
        
        while(nodoRaiz*2+1 <= last){
          int hijo = nodoRaiz*2+1;//hijod de la izquierda
          
            System.out.println("Ultimo-->"+last + "Nodo raiz-->"+ nodoRaiz+"Hijo-->"+hijo);
          //si el hijo tiene un hermano y su valor es menor...evaluamos ese nodo
          if(hijo+1 <= last && a[hijo] < a[hijo+1]){
              hijo = hijo+1;//hijo de la derecha
          }
          if(a[nodoRaiz]< a[hijo]){//intercambio normal
              int aux = a[nodoRaiz];
              a[nodoRaiz] = a [hijo];
              a[hijo] = aux;
              nodoRaiz = hijo;
              
          }else{
              return;
          }
        }
    }
    
    public static void hacerHeap(int[]a, int tam){
    int start = (tam-2)/2;
            bajarNodo(a, start, tam-1);
            start--;
    }
    
    public static void heapsort(int []a){
        int tam = a.length;
        
        //posicionarnos en el valor max
        hacerHeap(a,tam);
        
        int ultima = tam -1;
        while (ultima >0){
                //aqui hacemos el intercambio del velor max del monticulo
                //con el ultimo elemento del arbol
                int aux= a[ultima];
                a[ultima]= a[0];
                a[0] = aux;
                imprimir(a);
                System.out.println("");
              //regresar el max a la iltima posicion del arbol con la que estmaos trabajando  
                bajarNodo(a,0,ultima-1);
        }       ultima--;
    }
    
    public static void imprimir(int [] a){
        for(int i=0; i< a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int [] vect = {25,15,20,3,5,10};
        heapsort(vect);
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
    }
    
}
