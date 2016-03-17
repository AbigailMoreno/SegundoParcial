package burbujabidireccional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BurbujaBidireccional {
public static int tam;

 public static void imprimir(int array[]){//funcion para imprimir
    for(int k=0;k<array.length;k++){//
        System.out.print(array[k]+"  ");//imprime las comparaciones que se haran
    }
}
    
    public static void main(String[] args)throws IOException {
       BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Dame cantidad de numeros: \n");//pide el tamaño del vector
        tam=Integer.parseInt(bf.readLine());//guarda el tamaño del vector en la variable tam
        
        int [] vect = new int [tam];//declaramos el vector con el tamaño que ingreso el usuario
        
        for(int i=0; i<tam;i++){//pedira valores hasta que se llene el vector
            System.out.println("Dame el valor "+(i+1));//pide la secuencia de numeros
            vect[i]=Integer.parseInt(bf.readLine());//guarda los valores en el vector
        }
        int aux;
        int izq = 0;
        int der = vect.length -1;
        int ultimo = vect.length -1;
        do{
           for(int i = izq; i < der; i++){//primer recorrido hacia la derecha
               if(vect[i]>vect[i+1]){//compara si la variable en el valor de la posicion actual es mayor al valor d ela derecha
                   aux= vect[i];//en aux se guarda el valor actual
                   vect[i]=vect[i+1];//en la posicion actual de guarda el de la derecha
                   vect[i+1]=aux;//en la posicion derecha se guarda elq ue esta en aux
                   ultimo = i; //esta variable se va acercando hacia el centro
               }
           }
           der = ultimo;
           
           for(int j = der; j > izq; j--){//recorrido de hacia la izq
               if(vect[j-1]>vect[j]){//si el valor de la izq es mayor al de la posicion acutal
                   aux = vect[j];//en aux se guarda el valor d ela posicion acutal
                   vect[j]=vect[j-1];//en la posicion actual se guarda el valor de la izq
                   vect[j-1]=aux;//en la posicion de la izq se guarda el valor del aux
                   ultimo = j;//se actualiza la variable ultimo        
               }
           }
           izq = ultimo;
           imprimir(vect);
           System.out.println("");
        }while(izq<der);//mientras izq sea menor a la de la derecha
        imprimir(vect);//llama la funcion e imprime el vector
        
    }
    
}
