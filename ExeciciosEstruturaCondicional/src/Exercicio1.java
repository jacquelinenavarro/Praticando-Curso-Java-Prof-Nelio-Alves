/*Exercício 01
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. Exemplos:
Entrada: -10 / Saída: NEGATIVO; Entrada: 8 / Saída: NÃO NEGATIVO.

Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >=0) {
            System.out.println("NÃO NEGATIVO");
            
        }
        else {
            System.out.println("NEGATIVO");
            
        }
    
        sc.close();


        
    }
    
}
