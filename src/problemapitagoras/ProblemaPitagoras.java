package problemapitagoras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaPitagoras {

    public static int n, m, p=0;
    public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));//para leer lo ingresado por el usuario
            do{   //hacer
            System.out.println("Dame el valor m");//ingresa el valor minimo
                m=Integer.parseInt(bf.readLine());//guarda el valor en la variable m
            }while(m>1000000 && n>1000000);
            do{   
                System.out.println("Dame el valor n");//ingresa el valor maximo
                n=Integer.parseInt(bf.readLine());//guarda el valor en la variable n
            }while(m>1000000 && n>1000000);//mientras no sea mayor que  un millon
            
//tres ciclos  
            for(int a = m; a <= n; a++){
                for(int b = a; b <= n; b++){
                    for(int c = b;c<=n; c++){    
                    //System.out.println(a+" "+b+" "+c);
                    
                        if(((a*a)+b*b)==(c*c)){
                            p++;
                        }
                    }
                }
            }
            
            System.out.println("Ternas: "+p);
    }
    
}
