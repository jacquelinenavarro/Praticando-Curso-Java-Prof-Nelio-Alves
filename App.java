import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        String informacao = "\nResolução da atividade proposta pelo Professor Nélio Alves, do Curso de Java (Udemy - Seção 04 - Vídeo 23). Assunto: Saída de dados em Java.\n";
        String product1 = "Computer";
        String product2 = "Office desk";

    int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.println(informacao);
        System.out.printf("Products: %n%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender = %s\n\n", age, code, gender);
        System.out.printf("Measure with eigth decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US); // Serve para representar informações específicas de uma região (por exemplo: EUA "US" - Formatação dos números, datas e moedas no padrão US).
        System.out.printf("US decimal point: %.3f\n\n", measure);    
    }
}