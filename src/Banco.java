import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<ContaCorrente> ccList;
	private List<ContaPoupanca> cpList;

	public Banco(String nome) {
		this.nome = nome;
		ccList=new ArrayList<>();
		cpList=new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public void exibirContasCorrente(){
		for(ContaCorrente cc:ccList) {
			System.out.println(cc.toString());
		}
	}
	
	public void exibirContasPoupanca(){
		for(ContaPoupanca cp:cpList) {
			System.out.println(cp.toString());
		}
	}
	
	public double capitalTotalBanco() {
		
		double saldoTotalContas=0;
		for(ContaCorrente cc:ccList) {
			saldoTotalContas=+cc.getSaldo();
		}
		for(ContaPoupanca cp:cpList) {
			saldoTotalContas=+cp.getSaldo();
		}
		
		return saldoTotalContas;
		
	}
     public List<ContaCorrente> adicionaCC(ContaCorrente cc) {
	         ccList.add(cc);
	         return ccList;
	 }
     
     public List<ContaPoupanca> adicionaCP(ContaPoupanca cp) {
         cpList.add(cp);
         return cpList;
 }

	@Override
	public String toString() {
		return "Banco [nome=" + nome;
	}
     
	

}
