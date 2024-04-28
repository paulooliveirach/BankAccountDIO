
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner dadosScanner = new Scanner(System.in);
        String nome;
        String sobrenome;
        String numeroDaAgencia;
        int numeroDaConta;
        double saldo = 500.00;


        //Processo de obtenção de inputs

        //nome
        System.out.println("Por favor digite seu nome: ");
        nome = dadosScanner.nextLine();

        //sobrenome
        System.out.println("ola " + nome + " agora por favor, digite o seu sobrenome: ");
        sobrenome = dadosScanner.nextLine();

        //agencia
        System.out.println("Precisamos também do número da sua agência: ");
          try {
        numeroDaConta = dadosScanner.nextInt();
        System.out.println("Your pin code is: " + numeroDaConta);
    } catch(InputMismatchException e) {
        System.out.println("Incorrect pin!");
    }
        numeroDaAgencia = dadosScanner.nextLine();

        //numero da conta

        System.out.println("Mais algumas informações, primeiro o número da sua conta: ");
        numeroDaConta = dadosScanner.nextInt();

        // mensagem

        System.out.println("Ola " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco. Sua agência é: " + numeroDaAgencia + " conta: " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".  

        dadosScanner.close();
        //TODO: to know and import the "scanner" class.
       //TODO: Show the mensages for our user
       //TODO: get the values entered in the terminal by the class
       // TODO: display the account created message
    }
}
