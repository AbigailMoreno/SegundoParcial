package secuenciassaltarinas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecuenciasSaltarinas {

    public static int n,x,h;//declaramos las variables 
    
    public static void main(String[] args)throws IOException {
    BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));//para leer el valor ingresado por el usuario
        do{//hacer
            System.out.println("Ingresa un numero:\n"); //pide un numero al usuario
            n= Integer.parseInt(bf.readLine());//lee el dato ingresado y lo guarda en la variable
       }while(n<2 || n>1000);//mientras el valor no sea menor a 2 ni mayor a 1000
        int vector1[] = new int[n];//el valor ingresado será el tamaño del vector
        
        for(int i=0;i<n;i++){//ciclo para rellenar valors del vector
            do{//hacer
                System.out.println("Dame el valor "+(i+1));//pedimos al usuario que ingrese llos valores de cada espacio
                x=Integer.parseInt(bf.readLine());//se guarda el valor en la variable
            }while(x<-999 || x>999);
            vector1[i]=x;//el vector guarda los numeros ingresados
        }
        int vector2[] = new int [n-1];  //nuevo vector con un tamaño menos que el otro
    
          for(int i=0;i<vector1.length;i++){//nuevo ciclo para rellenar el vector haciendo operacion los numeros
              for(int j= i+1;j<vector1.length;j++){
              vector2[i]=Math.abs(vector1[i]-vector1[i+1]);
              /*El resultado de la diferencia de los vectores los convertimos a absolutos
              y estos valores se guardan en el vector 2*/
              break;
              }
          }
          
        Arrays.sort(vector2);//ordenamos los valores del vector 2
        
        int cont = 0;//declaramos un contador que inicia desde 0
        
        for(int i=0;i<n-1;i++){//recorremos el vector comparando valores
            if(vector2[i] != i+1){//si el valor del vector2 es diferente a i+1
                cont = i+1;//guardamos el valor de i+1 en la variable cont
            }
        }
        System.out.println(cont+" ");//imprimimos el resultado guardado en cont
    }
    
}
