package contaBancaria;

import java.util.Scanner;

public class contaBancariaTestar {
   
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		contaBancaria cc = new contaBancaria();
		
		cc.setTitular("Anna Julya");
		cc.setSenha("Alessandra44");
		
		// Verificação de Titular
        System.out.print("Digite o Titular: ");
        String titularDigitada = sc.nextLine();
        
        System.out.print("Digite uma senha: ");
        String senhaDigitada = sc.nextLine();

        
        cc.setTitular(titularDigitada);

        if (cc.validarTitular()) {
        	
            System.out.println("Titular válido(a)! ✅");
            
        } else {
        	
            System.out.println("Titular inválido(a)! Tente novamente! ❌");
            
        } while (!titularDigitada.equals(cc.getTitular()));
        
        // Verificação de Senha
        cc.setSenha(senhaDigitada);

        if (cc.validarSenha()) {
            System.out.println("Senha válida! ✅");
        } else {
            System.out.println("Senha inválida! ❌");
            System.out.println("A senha deve ter pelo menos 6 caracteres, com letras e números.");
        }
        
        // Verificação de Depósito
        cc.depositar(0);
        System.out.println("Digite o valor desejado para depósito: ");
        double deposito = sc.nextDouble();
        
        cc.depositar(deposito);
        
        System.out.println("Valor depositado: " + deposito);
        System.out.println("Saldo Atual: " + cc.getSaldo());
        
        // Verificação de Saque
        System.out.println("Digite o valor para Sacar: ");
        double saque = sc.nextDouble();
        
        if (cc.sacar(saque)) {
        	System.out.println("Saque Realizado com Sucesso! ✅");
        } else {
        	System.out.println("Saldo Insuficiente! ❌");
        }
        
        System.out.println("Saldo Atual: " + cc.getSaldo());
        
        sc.close();
    }
}