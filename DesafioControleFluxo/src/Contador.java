import java.util.Locale;
import java.util.Scanner;

public class Contador{

    public static void main(String[] args) {
    
        Scanner terminal = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {

            System.out.println("O segundo parâmetro precisa ser maior que o primeiro parâmetro");
        
        }
        terminal.close();
        
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroUm >= parametroDois)
            throw new ParametrosInvalidosException();
            
        int contagem = parametroUm - parametroDois;

        for(contagem = (parametroUm+1); contagem <= parametroDois; contagem++){
            System.out.println("-----------------------");
            System.out.println("Imprimindo o número: " + contagem);
        }
    }

}