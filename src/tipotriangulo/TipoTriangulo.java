package tipotriangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TipoTriangulo {

        public static  int a,b,c,d;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
        do{
        
        System.out.println("Dame el valor de a...");
        a=Integer.parseInt(bf.readLine());
        
       }while(a<-1000000000 || a>1000000000);
        
        do{
        System.out.println("Dame el valor de b...");
        b=Integer.parseInt(bf.readLine());
        }while(a<-1000000000 || a>1000000000);
        
        do{
        System.out.println("Dame el valor de c...");
        c=Integer.parseInt(bf.readLine());
        }while(a<-1000000000 || a>1000000000);
        
        if(a+b>c && b+c>a && c+a>b){    //Si es triangulo
            if((a == b) && (d== c)){
                System.out.println("1");//equilatero
            }else{
                if((a == b && b != c)||(b == c && b != a)||(a == c && c != b)){
                    System.out.println("2");//isosceles
                }else{
                    System.out.println("3");//escaleno
                }
            }
            System.out.println("0");
        }else{
            System.out.print("0");
            do{
                a++;
                b++;
                c++;
                d++;
            }while((a+b<c)&&(b+c<a)&&(c+a<b));
            System.out.println(" "+d);
        }
    }
    
}
