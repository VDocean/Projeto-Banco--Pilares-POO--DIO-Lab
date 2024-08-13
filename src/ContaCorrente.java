import java.util.List;

public class ContaCorrente implements Conta{
	
	private int agencia=0;
	private int numero = 0;
	private double saldo = 0;
	private Cliente cliente;
	private Banco banco;
	
	
	public ContaCorrente(Cliente cliente,Banco banco,double saldo) {
		this.agencia = (int)(Math.random()*100);
		this.numero = (int)(Math.random()*1000);
		this.saldo = saldo;
		this.cliente=cliente;
		this.banco=banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		
		if(valor<=this.saldo) {
			this.saldo=saldo-valor;
			}
		
	}

	@Override
	public void depositar(double valor) {
		
			this.saldo=saldo+valor;
		
	}

	@Override
	public void transferir(double valor, ContaCorrente numero) {
		
		if(valor<=this.saldo) {
			this.saldo=saldo-valor;
			}		
	}

	
	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente
				+ ", banco=" + banco + "]";
	}
	
	
	
	
	
	

}
