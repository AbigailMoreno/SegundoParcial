package insertionsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insertionsort {

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
        
        for(int i=1;i< vect.length;i++){//columnas
            int aux= vect[i];
            int j=i;//j tendra el valor de i
            while(j>0 && vect[j-1]>aux){
                vect[j]=vect[j-1];
                j--;
            }
            vect[j]=aux;
            imprimir(vect);
            System.out.println(" ");
        }
    }
    
}
