/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo. 
Entrada:
Leia três valores de ponto flutuante (double) A, B e C.

Saída:
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem. Exemplos:
Entrada: 10.0; 20.1; 5.1
Saída: 
R1 = -0.29788
R2 = -1.71212
**************
Entrada:
0.0; 20.0; 5.0
Saída:
Impossivel calcular

Link: https://youtu.be/3lhkB5I8P6E?feature=shared

*/

import java.util.Locale;
import java.util.Scanner;

public class Resolvido2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, r1, r2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) - (4.0*a*c);
        r1 = (-b + Math.sqrt(delta))/(2.0*a);
        r2 = (-b - Math.sqrt(delta))/(2.0*a);
        

        if (a == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");            
        } else {
            System.out.printf("R1 = %.5f\nR2 = %.5f", r1, r2);
            
        }
                
        sc.close();
        
    }
}