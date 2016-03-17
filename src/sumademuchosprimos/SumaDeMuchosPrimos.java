package sumademuchosprimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaDeMuchosPrimos {

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
       }while(num<1 || num>20000000);//mientras que num sea mayor a 1 y menor a 2 millones
       
       int aux=0; //declara la variable
       int aux2=num;//declara la variable 
       do{
        //for(int i = num; i>0;i--){
            if(primo(aux2)==1 && ((aux+aux2)<num)){
                
                aux = aux + aux2;
               if(aux<num)
                System.out.print(aux2+" ");//imprime
                aux2--;//contador decrementa
            }else{
                aux2--;//contador decrementa
            }
            
            if(num==aux+1){//
                aux = aux +1;//
                System.out.println(" "+1);//imprime
            }
        //}
       }while(aux<num);
    }
    
}
