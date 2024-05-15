import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     System.out.println("Por favor, Digite o seu nome:");
        String nomeCliente = scanner.next();

    System.out.println("Por favor, Digite o seu sobrenome:");
        String sobrenomeCliente = scanner.next();   


     System.out.println("Digite o número da conta:");  
        int numeroConta = scanner.nextInt();

     System.out.println("Digite a Agencia do seu banco:"); 
        String agencia = scanner.next();
        
     System.out.println("Digite o Saldo que deseja depositar: ");  
        double saldo = scanner.nextDouble(); 


        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", sua conta é " + numeroConta + " e seu saldo de R$" + saldo + " já está disponivel para saque. Obrigado!");
    }
}
