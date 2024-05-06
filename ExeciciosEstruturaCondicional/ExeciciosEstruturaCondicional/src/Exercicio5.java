/*Exercício 05
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
Código  Especificacao       Preco (R$)
1       Cachorro-Quente     4.00
2       X-Salada            4.50
3       X-Bacon             5.00
4       Torrada Simples     2.00
5       Refrigerante        1.50

Exemplos:
Entrada: 3; 2 / Saída: Total: R$ 10.00
Entrada: 2; 3 / Saída: Total: R$ 13.50

Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
  
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo, quantidade;
        double total = 0.0;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();          

        if (codigo == 1) {
            total = quantidade * 4.00;

        } else if (codigo == 2) {
            total = quantidade * 4.50;

        } else if (codigo == 3) {
            total = quantidade * 5.00;  

        } else if (codigo == 4) {
            total = quantidade * 2.00;  
                                  
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        }

        System.out.printf("TOTAL = R$ %.2f\n", total); 
        sc.close();
    }
}
