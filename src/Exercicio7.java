/*Exercício 07

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. Exemplos:
Entrada: 4.5; -2.2 / Saída: Q4
Entrada: 0.1; 0.1 / Saída: Q1
Entrada: 0.0; 0.0 / Saída: Origem



Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        double x, y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0.0 && y > 0.0) {        
            System.out.println("Q1");   

        } else if (x < 0.0 && y > 0.0){
            System.out.println("Q2");            
        
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        
        } else if (x > 0.0 && y < 0.0){
            System.out.println("Q4");      

        } else {
            System.out.println("Origem");
        }

        sc.close();        
    }
}
