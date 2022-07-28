package EntitiesBanco;

public class Conta {
	
	private String nomeCliente;
	private int numeroConta;
	private double saldo;
	
	
	public Conta(String nomeCliente, int numeroConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		
	}
	
	public Conta(String nomeCliente, int numeroConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double valorInicial) {
		this.saldo = saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void deposito (double deposito) {
		saldo += deposito;
	}
	
	public void saque (double saque) {
		saldo -= saque;
	}
	
	public String toString() {
		return nomeCliente
				+ ","
				+ numeroConta
				+ ","
				+ String.format("%.2f", saldo)
				;
	}
	
	
	
	

}
