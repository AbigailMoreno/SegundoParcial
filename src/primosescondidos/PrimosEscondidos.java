package primosescondidos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimosEscondidos {

    public static int n,P=0;//declaramos las variables n y p(dira si es primo o no)
    public static int primo(int p){//metodo para sacar numeros primos
        int cont = 0;//declaramos el contador iniciandolo en cero
        for(int j=1;j<=p;j++){
            if(p%j == 0){
                cont++;
            }
        }
        if(cont == 2){
        return 1;
        }
        else{
            return 0;
        }
       }
    
    public static void main(String[] args)throws IOException {
    BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));//para leer el valor ingresado por el usuario
        do{//hacer
            System.out.println("Ingresa un numero");//pide el un numero al usuario
            n= Integer.parseInt(bf.readLine());//guarda el numero en una variable
        }while(n<0 || n>999999999);//mientras el valor no sea menor a 0 ni mayor de 999999999
    
        if(primo(n)==1){//si el valor de n es primo
            P=1;//el valor de P será 1
        }
        
        int aux=n, cont1=0, cont2=0;
        /*Declaramos un ausilar que tendra el valor que ingreso el usuario,
        el contador1 nos dira cuantos numeros primos se quitan por la derecha,
        y el contador 2 nos dice cuantos numeros primos se quita por la izquierda*/
        for(int i = 0;i<aux;i++){//se inicia ciclo desde cero hasta el valor de la variable
            aux = aux/10;//se asigna nuevo valor a aux que será el anterior valor entre 10
            if(primo(aux)==1){//si el valor nuevo es primo
                cont1++;//el contador ira aumentando
            }
        }
        
        for(int i = 10;i<=n;i=i*10){//iniciamos un ciclo de 10 
            aux = n%i;//nuevo valor a aux que será n%i
            if(primo(aux)==1){//si el valor auxiliar es par
                cont2++;//se le aumenta al contador
            }
        }
        System.out.println(P+" "+cont1+" "+cont2);//imprime las tres variables
        
    }
    
}
