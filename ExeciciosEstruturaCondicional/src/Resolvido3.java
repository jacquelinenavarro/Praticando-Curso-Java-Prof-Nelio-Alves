/*Fazer um programa para ler 3 números inteiros. Em seguisa, mostrar qual o menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez. Exemplos:
Entrada: 7; 3; 8.
Saída: MENOR = 3
*****
Entrada: 9; 9; 9.
Saída: MENOR = 9 
 
Link: https://www.youtube.com/watch?v=UjCVIcKccdQ

 */
import java.util.Scanner;

public class Resolvido3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a < b && a < c) {
            System.out.printf("MENOR = %d", a);   // %d inteiro
            
        } 
        else {
            if (b < c) {
                System.out.printf("MENOR = %d", b);
            }

        else {
            System.out.printf("MENOR = %d", c);

            }         
             
        sc.close();
        }

    }
}
    

