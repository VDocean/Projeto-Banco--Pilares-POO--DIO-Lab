
public class Teste {
	
	public static void main(String []args) {
		
		ContaCorrente conta1=new ContaCorrente(new Cliente("José de Almeida"),new Banco("Banco Ouro"),1500);
		ContaPoupanca conta2=new ContaPoupanca(new Cliente("Paloma Cruz"),new Banco("Banco Ouro"),1349);
		ContaPoupanca conta3=new ContaPoupanca(new Cliente("João da Silva"),new Banco("Banco Ouro"),1200);
		ContaCorrente conta4=new ContaCorrente(new Cliente("Maria Barbosa"),new Banco("Banco Ouro"),3000);
		
		Banco bancoOuro=new Banco("Banco Ouro");
		bancoOuro.adicionaCC(conta1);
		bancoOuro.adicionaCC(conta4);
		bancoOuro.adicionaCP(conta2);
		bancoOuro.adicionaCP(conta3);
		
		bancoOuro.exibirContasCorrente();
		bancoOuro.exibirContasPoupanca();
		bancoOuro.capitalTotalBanco();
		
		
	    
		
		
	}

}
