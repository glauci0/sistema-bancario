package contaBancaria;

public class contaBancaria {
	
	// Atributos
	private String titular;
	private String senha;
	private double saldo;
	private int opcao;
	
	// Métodos
	public void setTitular (String titular) {
		this.titular = titular;
	}
	
	public String getTitular () {
		return titular;
	}
	
	public boolean validarTitular() {
		
		if (titular.length() <6) {
			return false;
		}
		
		boolean temLetra = false;
	
		// Verifica cada caractere
		for (int i = 0; i < titular.length(); i++) {
			char c = titular.charAt(i);
			
			if (Character.isLetter(c)) {
				temLetra = true;
			}
		}
			return temLetra;
	}
	
	public void setSenha (String senha) {
		this.senha = senha;
	}
	
	// Método validar senha
	public boolean validarSenha() {
		
		if (senha.length() <6) {
			return false;
		}
		
		boolean temNumero = false;
		boolean temLetra = false;
	
		// Verifica cada caractere
		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			
			if (Character.isDigit(c)) {
				temNumero = true;
			}
			
			if (Character.isLetter(c)) {
				temLetra = true;
			}
		}
			return temNumero && temLetra;
	}
	
	public String getSenha () {
		return senha;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false; // Não poderá sacar o valor maior que tem na conta
		} else {
			saldo -= valor;
			return true; 
		}
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setOpcao (int opcao) {
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return opcao;
	}
}