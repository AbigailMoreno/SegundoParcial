package parejasdisparejas;//paquetes

//librerias importadas
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParejasDisparejas {

        public static int m, n, sm, sn;//declaramos variables
        
    public static int Multiplo(int x){ //metodo para saber cuales son los multiplos, declarando los parametros que utlizara
	int suma=0; //declaramos el contador suma que comienza en cero
        
        for(int i=1;i<x;i++){//ciclo donde utilizamos una nueva variable que ira incrementando mientras sea menor al valor del parametro
            if(x%i==0){//si el valor de x al dividirlo entre el valor de i es igual a cero, entonces...
            suma=suma+i;//guardara un nuevo valor en la misma variable suma, agregandole 1
            }
        }return suma;//regresara el valor ded suma   
        
}
    public static int Comparacion(int s1,int s2,int a,int b){//método para saber si es perfecta , defectuosa, afectuosa o dispareja, declarando lo parámetros que utilizara
        if(s1==b && s2==a){//inica a comparar, si el valor guardado en s1 es igual a b y el de s2 es igual a a:
            return 0;//regresa el valor 0
        }else if(s1<b && s2<a){//o si el valor de s1 es menor a b y s2 menor a a:
            return 1;//regresa el valor 1
        }else if(s1>b && s2>a){//o si el valor de s1 es mayor a b y s2 es mayor a a:
            return 2;//regresa el valor 2
        }else{//si ninguna de las anteriores se cumple, entonces...
            return 3;//regresa el valor 3
        }
    }
   
    public static void main(String[] args) throws IOException{//metodo principal
    BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));//para leer el valor ingresado por el usuario
        do{//hacer
            System.out.println("Ingresa un numero m..");//pide el valor m 
            m= Integer.parseInt(bf.readLine());//guarda el valor en m
       }while(m<1 || m>1000000);//mientras sea mayor a 1 y menor a un millon
        do {//hacer
            System.out.println("Ingresa un numero n..");//pide valor n
            n= Integer.parseInt(bf.readLine());//guarda el valor en n
        }while(n<1 || n>1000000);//mientras sea mayor a 1 y menor a un millon
        
        
        sm = Multiplo(m);//utiliza la funcion Multiplo con el valor guardado en m, guardando el resultado en sm
        sn = Multiplo(n);//utliza la funcion Multiplo con el valor guardado en n, guardando el resultadao en sn
        System.out.println(Comparacion(sm,sn,m,n));//utiliza la funcion Comparacion con los valores guardados en sm, sn , m y n 
        System.out.println(Comparacion(sm,sm,m,m));//utiliza la funcion Comparacion con los valores guardados en sm y m  dos veces
        System.out.println(Comparacion(sn,sn,n,n));//utiliza la funcion Comparacion con los valores guardados en sn y n dos veces
         
    }
    
}
