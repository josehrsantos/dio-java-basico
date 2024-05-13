import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author José Henrique
 */
public class ContaTerminal {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número de sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número de sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: R$ ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque!");
        
    }    
}



/**

    "TODO: Uma outra forma de fazermos o projeto proposto é na forma abaixo, utilizando o terminal como forma de confirmação das variáveis,
    que exibirão a mensagem completa caso as informações estejam corretas, mas retornando com erro caso estejam incorretas."

        String primeiro_nome = "Jose";
        String segundo_nome = "Henrique";
        String numero_agencia = "365-9";
        int numero_conta = 6597;
        double quantia_saldo = 2589.96;
       
       
        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número de sua agência: ");
        String agencia = scanner.next();

        if ((nome.equals(primeiro_nome)) && (sobrenome.equals(segundo_nome)) && (agencia.equals(numero_agencia))){
            System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta + " e seu saldo de R$ " + quantia_saldo + " já está disponível para saque!");
        }

        else{
            System.out.println("As informações digitadas estão incorretas, tente novamente!");
        }
        
    }    

    */
