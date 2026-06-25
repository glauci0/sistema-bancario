package contaBancaria;

import java.util.Scanner;

public class contaBancariaTestar {
   
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		contaBancaria cc = new contaBancaria();
		
		String titularDigitada;
		String senhaDigitada;
		
		String titularCorreto = "Glaucio";
		String senhaCorreta = "Alessandra44";
		
		// Verificação de Titular
		do {

		    System.out.println("Faça seu Login!\n");

		    System.out.print("Digite o Titular: ");
		    titularDigitada = sc.nextLine();

		    System.out.print("Digite a Senha: ");
		    senhaDigitada = sc.nextLine();

		    if (!titularDigitada.equals(titularCorreto)
		            || !senhaDigitada.equals(senhaCorreta)) {

		        System.out.println("\n❌ Titular ou senha inválidos, tente Novamente!\n");
		    }

		} while (!titularDigitada.equals(titularCorreto)
		        || !senhaDigitada.equals(senhaCorreta));

		System.out.println("\n✅ Login realizado com sucesso!");
        
        while (cc.getOpcao() !=3) {
        	System.out.println("\n========= MENU =========\n");
        	System.out.println("1 - Depositar");
        	System.out.println("2 - Sacar");
        	System.out.println("3 - Sair");
        	System.out.print("\nEscolha uma opção: ");
        	
        	cc.setOpcao (sc.nextInt());
        	
        
        // Verificação de Depósito
        	if (cc.getOpcao() == 1) { 
        	
        		cc.depositar(0);
        		System.out.print("\n💰 Digite o valor desejado para depósito: R$");
        		double deposito = sc.nextDouble();
        
        		cc.depositar(deposito);
        
        		System.out.println("\nValor depositado: R$" + deposito);
        		System.out.println("\nSaldo Atual: R$" + cc.getSaldo());
        		System.out.println("\nDepósito efetuado com sucesso!");
        		
        	
        }
        // Verificação de Saque
        		else if (cc.getOpcao()== 2) {
        			System.out.print("\n💸 Digite o valor para Saque: R$");
        			double saque = sc.nextDouble();
        		
        			System.out.print("\nConfirme sua senha: ");
        			String confirmarSenha = sc.next();
        		
        			if (!confirmarSenha.equals(senhaCorreta)) {
        			
        				} else if (cc.sacar(saque)) {
                			System.out.println("\nSaldo Atual: R$" + cc.getSaldo());
                			System.out.println("\nSaque Realizado com Sucesso! ✅");
        				
        				} else if (cc.sacar(saque)) {  
        					System.out.println("\nSaldo Insuficiente! ❌");
        					
        				} 	else if (cc.sacar(saque)){
                			System.out.println("\n❌ Senha Incorreta! Operação Cancelada!");
        				}
        		}
        			
        		else if  (cc.getOpcao() == 3) {
                   System.out.println("Encerrando programa...");
                   sc.close();
                   System.exit(0);
                } else {
             		System.out.println("Opção Inválida!");
        		
            }
        }
    }
}
