package divisores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisores {
    
    public static int n, d; //declaro las variables a utilizar
    public static void main(String[] args) throws IOException{
       BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));//libreria utilizada para leer lo que se ingrese
 
        do{
        System.out.println ("Introduzca un Numero: ");//El usuario introduce el numero
        n = Integer.parseInt (bf.readLine());//leera y guardara el valor en la variable "n"
        }while(n>=1000000);
        
        for (int i = 1 ; i <= n ; i++){//cuando i es 1 y sea menor a n, se realizara la condicion del if
            if (n % i == 0){//si n modulo de d es igual a 0, mostrara los resultados de d que son los divisores de n
                d++;//contador
            }
        }System.out.println(d);
    }  
}
