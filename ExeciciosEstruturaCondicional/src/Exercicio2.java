/*Exercício 02
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. Exemplos:
Entrada: 12 / Saída: PAR.
Entrada: -27 / Saída: IMPAR.
Entrada: 0 / Saída: PAR.
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java

 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.printf("PAR");            
        } 
        else {
            System.out.printf("IMPAR");            
        }
        sc.close();        
    }
}
