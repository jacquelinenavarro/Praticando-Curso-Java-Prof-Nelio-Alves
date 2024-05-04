/* Exercício resolvido: Estrutura Sequencial - Entrada de dados; Processamento de Dados e Saída de dados.

Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno co duas casas decimais. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do terreno, ambos com duas casas de decimais, conforme exemplo.Exemplo:Entrada:10.0;30.0;200.00;Saída:AREA = 300.00;PRECO = 60000.00".
*/
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = metroQuadrado * area;

        System.out.printf("AREA = %.2f\n", area);
        System.out.printf("PRECO = %.2f", preco);

        sc.close();
    }
}