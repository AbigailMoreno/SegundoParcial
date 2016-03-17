package problemacollatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCollatz {
    public static int n,l=0,m,aux=0;
    public static void main(String[] args)throws IOException {
       BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
       
       do{
           System.out.println("Ingresa un numero..");
           n= Integer.parseInt(bf.readLine());
       }while(n>1000000);
       
        
        while(n!=1){
            if(n%2==0){
                n=n/2;
                if(n>aux){
                    aux=n;
                }
            }else{
                n=(3*n)+1;
                
                if(n>=aux){
                    aux=n;
                }
            }
            l++;
        System.out.println(" "+n);
        }
        l++;
        System.out.println(l+" "+aux);
    }
}