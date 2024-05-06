/* Exercício 03
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
Exemplos:
Entrada: 6; 24 / Saída: Sao Multiplos
Entrada: 6; 25 / Saída: Nao sao Multiplos

Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java

 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();
        
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
        
    }
    
}
