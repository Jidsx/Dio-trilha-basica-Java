package contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        float saldo;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu Nome Completo: ");
        nome = ler.nextLine();

        System.out.println("Por favor, digite o número da Agência!: ");
        agencia = ler.next();

        System.out.println("Digite seu Número: ");
        numero = ler.nextInt();

        System.out.println("Digite seu Saldo: ");
        saldo = ler.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }

}
