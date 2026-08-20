
package com.mycompany.maioremenor;

import java.util.Scanner;

public class Maioremenor {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
     System.out.println("Digite o primeiro número");
     numero1 = tc.nextInt();
     
     System.out.println("Digite o segundo número");
     numero2 = tc.nextInt();
     
     if(numero1 > numero2){
         System.out.println("Maior" +numero1);
         System.out.println("Menor" +numero2);
     }
     else if(numero2 > numero1){
     System.out.println("Maior" +numero2);
     System.out.println("Menor" +numero1);
    }
    else{
     System.out.println("numeros iguais");
}
    }
}
