/*Exercício 02
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
Exemplos:
Entrada: 2.00 / Saída: A=12.5664.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double π = 3.14159;
        double area = π*(Math.pow(raio, 2));

        System.out.printf("A = %.4f", area);
        sc.close();
    }
}