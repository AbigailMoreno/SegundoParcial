package bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubblesort {
public static int tam;
public static void imprimir(int array[]){//funcion para imprimir
    for(int k=0;k<array.length;k++){//
        System.out.print(array[k]+"  ");//imprime las comparaciones que se haran
    }
}

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Dame cantidad de numeros: \n");//pide el tamaño del vector
        tam=Integer.parseInt(bf.readLine());//guarda el tamaño del vector en la variable tam
        
        int [] vect = new int [tam];//declaramos el vector con el tamaño que ingreso el usuario
        
        for(int i=0; i<tam;i++){//pedira valores hasta que se llene el vector
            System.out.println("Dame el valor "+(i+1));//pide la secuencia de numeros
            vect[i]=Integer.parseInt(bf.readLine());//guarda los valores en el vector
        }
        
        
        //bubble
        int aux,cont=0;
        for(int i=tam-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                
                if(vect[j-1]> vect[j]){//compara las posiciones
                    aux = vect[j-1];
                    vect[j-1]=vect[j];
                    vect[j]=aux;
                    cont++;
                }else{
                    cont++;
                }
                imprimir(vect);
                System.out.println(" ");
            }
        }
        System.out.println("Total comparaciones efectivas: "+ cont);
    }
    
}
