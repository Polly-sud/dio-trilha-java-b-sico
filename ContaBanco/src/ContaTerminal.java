import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scr = new Scanner(System.in);

        String NomeCliente;
        String  AgenciaBanco;
        int  Numero;  
        double Saldo;

        System.out.println("por favor Digite o numero da Agência");
        AgenciaBanco = scr.nextLine();

        System.out.println("Digite o Nome do Cliente ");
        NomeCliente = scr.nextLine();

        System.out.println("Digite o numero da conta ");
        Numero = scr.nextInt();

        System.out.println("Saldo da conta ");
        Saldo = scr.nextDouble();

        System.out.println("Olá " +NomeCliente+ " obrigada por criar uma conta em nosso Banco ");
        System.out.println("sua agência é " +AgenciaBanco+ ",");
        System.out.println("conta " +Numero);
        System.out.println("e seu saldo " + Saldo + " seu Saldo já está disponivel para Saque.");

        scr.close();
    }

    
}
