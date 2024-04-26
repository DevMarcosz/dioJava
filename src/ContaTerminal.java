import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Por favor Digite seu nome aqui: ");
        String nome = sc.nextLine();

        System.out.printf("Bem vindo %s, agora digite a agencia: ", nome);
        String agencia = sc.nextLine();
       
        System.out.printf("Muito bem, %s! Agora precisamos do numero: ", nome);
        int numeroDaAgencia = sc.nextInt();
       
        System.out.printf("Qual valor do seu primeiro deposito: ");
        Double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia,numeroDaAgencia, saldo);
        
    }

}
