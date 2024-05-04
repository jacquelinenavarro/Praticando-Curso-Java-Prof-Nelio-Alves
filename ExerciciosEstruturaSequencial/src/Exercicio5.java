/*Exercício 05
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. Exemplos:
Entrada:
12 1 5.30
16 2 5.10
Saída:
VALOR A PAGAR: R$ 15.50
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codpeca1, qntpecas1, codpeca2, qntpecas2; 
        double valorpeca1, valorpeca2, total;

        codpeca1 = sc.nextInt();
        qntpecas1 = sc.nextInt();
        valorpeca1 = sc.nextDouble();

        codpeca2 = sc.nextInt();
        qntpecas2 = sc.nextInt();
        valorpeca2 = sc.nextDouble();

        total = (qntpecas1*valorpeca1) + (qntpecas2*valorpeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);        

        sc.close();        
    }
}