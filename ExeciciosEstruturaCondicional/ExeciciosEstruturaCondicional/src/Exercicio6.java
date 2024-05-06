/*Exercício 06

Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. Exemplos:
Entrada: 25.01 / Saída: Intervalo (25,50]
Entrada: 25.00 / Saída: Intervalo [0,25]
Entrada: 100.00 / Saída: Intervalo (75,100]
Entrada: -25.02 / Saída: Fora de intervalo

Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java 

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        double numero = sc.nextDouble();

        if (numero >= 0 && numero <= 25) {
            System.out.println("Saída: Intervalo [0,25]");

        } else if (numero > 25 && numero <=50) {
            System.out.println("Saída: Intervalo (25,50]");   

        } else if (numero > 50 && numero <= 75){
            System.out.println("Saída: Intervalo (50,75]");            
        
        } else if (numero > 75 && numero <= 100) {
            System.out.println("Saída: Intervalo (75,100])");

        } else {
            System.out.println("Fora de intervalo");

        }

        sc.close();        
    }
}