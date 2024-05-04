/*Exercício 03
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Exemplos:
Entrada: 5; 6; 7; 8; Saída: DIFERENCA = -26 
 */

import java.util.Scanner;

public class Execicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println("DIFERENCA = " + (A * B - C * D));

        sc.close();        
    }
}