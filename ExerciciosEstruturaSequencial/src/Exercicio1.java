/*Exercício 01
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. 
Entrada: 
10
30
Saída:
SOMA = 40
*/
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();

        int soma = int1 + int2;

        System.out.println("SOMA = " + soma);       

        sc.close();
        
    }
   
}