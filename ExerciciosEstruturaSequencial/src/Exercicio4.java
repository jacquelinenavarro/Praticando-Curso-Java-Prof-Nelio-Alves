/*
 Exercício 04
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. Exemplos:
Entrada: 25; 100; 5.50 / Saída: NUMBER = 25; SALARY = U$ 550.00
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, qnthoratrab;
        double valorhoratrab, salary;

        num = sc.nextInt();
        qnthoratrab = sc.nextInt();
        valorhoratrab = sc.nextDouble();
        salary = qnthoratrab * valorhoratrab;
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salary );

        sc.close();        
    }
    
}