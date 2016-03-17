package primosgemelos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimosGemelos {

        public static int num;
       
       public static int primo(int p){//metodo para sacar numeros primos
        int cont = 0;
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
        
    public static void main(String[] args) throws IOException{
  BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        do{
        System.out.println("Ingresa un numero..");//pide el valor
           num= Integer.parseInt(bf.readLine());//guarda el valor en la variable num
       }while(num<1 || num>1000000000);//mientras que num sea mayor a 1 y menor a 100 millones
       
        int aux1=num+1;//declaramos la  variable auxiliar1, donde agrega 1 a num
        int cont=0;//declaramos la variable cont iniciando desde cero
        
        do{
           if(primo(aux1)==1 && primo(aux1+2)==1){
                System.out.println(aux1+" "+aux1+1);//imprime
                cont++;//contador aumenta
           }else{
               aux1++;//contador auxiliar aumenta
           }
       }while(cont==0);//mientras que contador sea diferente a cero
    }
    
}
