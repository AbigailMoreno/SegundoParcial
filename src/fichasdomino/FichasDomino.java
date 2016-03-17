package fichasdomino;

import java.util.Scanner;

public class FichasDomino {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int tamaño=7;
        int menor, mayor,aux1,total=0;
        int cont=0;
        do{
            System.out.println("Ingresa el valor menor de la ficha");
            menor = sc.nextInt();
        }while(menor > 6 || menor < 0);
        
        do{
            System.out.println("Ingresa el valor mayor de la ficha");
            mayor = sc.nextInt();
        }while(mayor > 6 || mayor < 0);
        
        int fichas[] = new int[27];
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = i; j < tamaño; j++) {
                cont++;
                if (i==menor && j==mayor) {
                    total=cont;
                }
            }
        }
        System.out.println("Orden de la ficha: "+(total-1));
    }
}
