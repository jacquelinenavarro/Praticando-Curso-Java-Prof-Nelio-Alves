/*Exercício 04
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Exemplos:
Entrada: 16; 2 / Saída: O JOGO DUROU 10 HORA(S)
Entrada: 0; 0 / Saída: O JOGO DUROU 24 HORA(S)
Entrada: 2; 16 / Saída: O JOGO DUROU 14 HORA(S)


Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java 
 
 */
import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicio, horaFim, duracao;

        horaInicio = sc.nextInt();
        horaFim = sc.nextInt();

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        
        }
       
        else {
            duracao = 24 - (horaInicio - horaFim);
        
        }
        System.out.println("O JOGO DUROU " + duracao + " HORAS");           
        

        sc.close();
        
    }
    
}
