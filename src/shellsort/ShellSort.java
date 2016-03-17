package shellsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellSort {
    
    public static void imprimir(int t, int vect[]){
        for(int i = 0;i < t; i++){
            System.out.print(vect[i] + " ");
        }
        System.out.println(" ");
    }

    public static void shellsort(int tam,int vect[]){
        int tamaux = vect.length;
        for(int i = 0;i < tamaux - tam;i++){
                int varaux = vect[i + tam];
                if(vect[i]>varaux){
                    vect[i + tam] = vect[i];
                    vect[i]=varaux;
                    
                    for(int j = i;j >= 0+tam; j--){
                        varaux = vect[j - tam];
                         if(vect[j]< varaux){
                             vect[j - tam]= vect[j];
                             vect[j]= varaux;
                         }
                    }
                }
                 imprimir(tamaux,vect);
            }
        }
    
    
    public static void main(String[] args)throws IOException {
       BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
       
        System.out.println("Introduce le tamaño del vector\n");
        int tam = Integer.parseInt(bf.readLine());//guarda el tamaño dado en tam
        
        int []lista = new int [tam];//vector con el tamaño pedido por el usuario
        for(int i = 0; i < tam; i++){//para llenar el vector 
            lista[i]=(int)(1 + Math.random() * 50);//crea valores al azar y los guarda en el vector
        }
        imprimir(tam, lista);//llama a la funcion "imprimir", manda como paràmetros el tamaño y el vector
        while(tam > 1){//mientras que tamaño sea mayor a 1
            tam= tam/2;//num de tamaño divido entre dos
            System.out.println("Gap--->"+ tam);
            shellsort(tam, lista);//llama a la funcion shellsort, manda como parámetros el tamaño y el vector
        }
        
        
//para ordenar letras(tarea)        
//        char var1='a';
//        String var2 = "a";
//        if('a'>'z'){
//            System.out.println("La a es menor que z");
//        }else{
//            System.out.println("La z es mayor que a");
//        }
    }
    
}
