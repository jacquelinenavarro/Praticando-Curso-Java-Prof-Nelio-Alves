/*Exercício Resolvido:
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos os valores devem ter uma casa decimal. 
Entrada: 45.5;31.3
Saída: 
NOTA FINAL = 76.8
********************
Entrada: 34.0; 23.5
Saída: 
NOTA FINAL = 57.5
REPROVADO

Link: https://youtu.be/SRyQZBaA-_s?feature=shared
 */

import java.util.Locale;
import java.util.Scanner;

public class Resolvido1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, notafinal;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        notafinal = nota1 + nota2;

        if (notafinal>60.00) {
            System.out.printf("NOTA FINAL = %.1f\n", notafinal);
            
        } else {
            System.out.printf("NOTA FINAL = %.1f\nREPROVADO", notafinal);
        }
        sc.close();              
    }
}
