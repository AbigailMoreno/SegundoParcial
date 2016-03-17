package ordenamientoporseleccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrdenamientoPorSeleccion {
    public static int tam;
    public static void imprimir(int array[]){//funcion para imprimir
    for(int k=0;k<array.length;k++){
        System.out.print(array[k]+"  ");//imprime las comparaciones que se haran
    }
}
    
    public static void seleccion(int array[]){
        int aux;
        for(int i = 0; i < array.length; i++){//determina las posicion del arreglo por lo que empieza en cero
            int min = i;//min actualizara la posicion en donde se sabra que esta el num mas pequeño del vector
            for(int j = i+1; j< array.length; j++){//empezara a comparar en la posicion 1
                if(array[j]< array[min]){//compara las posiciones del arreglo mientras que la posicion de j sea mayor que i
                    min = j;//guarda el valor mas pequeño en caso de ser cierto
                }
            }
            aux = array[i];//guarda el valor de la posicion i en aux
            array[i] = array[min];//guarda el valor minimo en la posicion i
            array[min] = aux;//en la posicion minimo quedara loq ue habia en aux
               imprimir(array);//manda llamar la funcion imprimir par auq eimprima el vector 
               System.out.println("");
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce le tamaño del vector\n");//pide al usuario el tamaño del vector
            tam = Integer.parseInt(bf.readLine());//guarda lo introducido por el usuario en tam

            int []vect = new int [tam];//crea el vect con el tamaño ingresado
            for(int i = 0; i < tam; i++){ //recorre y llena el vector
                vect[i]=(int)(1 + Math.random() * 50);//crea numeros al azar y los guarda en el vector
            }
            imprimir(vect);//llama a la funcino imprimir y muestra los valor al azar
            System.out.println("\n");
            seleccion(vect);//llama a la funcion de seleccion imprime los valores ya acomodados
    }
    
}
