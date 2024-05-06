/*Exercício 08
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Renda                      Imposto  de Renda
de 0.00 a R$ 2000.00             Isento
de R$ 2000.01 a R$ 3000.00         8%
de R$ 3000.01 a R$ 4500.00        18%
Acima de R$ 4500.00               28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais. Exemplos:

Entrada: 3002.00 / Saída: R$ 80.36
Entrada: 1701.12 / Saída: Isento
Entrada: 4520.00 / Saída: R$ 355.60

Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        double salario, imposto;

        salario = sc.nextDouble();
        imposto = 0.0;
        
        if (salario > 0.0 && salario <= 2000.00) {        
            imposto = 0.0;

        } else if (salario > 2000.01 && salario <= 3000.00){
            imposto = (salario - 2000.00) * 0.08;                    
        
        } else if (salario > 3000.00 && salario <= 4500.00) {
            imposto = ((salario - 3000.00) * 0.18) + (1000.00 * 0.08);

        } else if (salario > 4500.00){
            imposto = ((salario - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);

        }
        if (imposto == 0.0) {
            System.out.println("Isento");

        } else {
            System.out.printf("R$ %.2f", imposto);
        }

        sc.close();        
    }
}