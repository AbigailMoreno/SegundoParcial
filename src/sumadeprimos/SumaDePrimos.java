
package sumadeprimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaDePrimos {

    public static int n,q,p;

    public static void main(String[] args)throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    do{
        System.out.println("***Suma de primos***");
        System.out.println("Coloque un numero:\n");
        n=Integer.parseInt(bf.readLine());
    }while(n<1 || n>1000000);
    
        for(int j=1;j<(n+1);j++){  
            if(n%j>0){
             p=n;   
            }  
        }System.out.println(p);
    }
}
