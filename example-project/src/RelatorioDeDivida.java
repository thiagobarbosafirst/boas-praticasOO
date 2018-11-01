import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
	private final Divida divida;
	
	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("Cnpj do Credor: " + divida.getDocumentoCredor());
		System.out.println("Credor: " + divida.getCredor());
		
		System.out.println("Valor da divida: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
	}
	
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("Uma empresa");
		divida.setTotal(100);
		divida.setDocumentoCredor(new Cnpj("00.000.001/0001-01"));
		
		Pagamento pagamentoPJ = new Pagamento();
		pagamentoPJ.setDocumentoPagador(new Cnpj("00.000.002/0002-02"));
		pagamentoPJ.setPagador("Outra Empresa");
		pagamentoPJ.setValor(20);
		divida.registra(pagamentoPJ);
		
		/*Pagamento pagamentoPF = new Pagamento();
		pagamentoPF.setDocumentoPagador(new Cpf("735.585.630-85"));
		pagamentoPF.setPagador("Outra Empresa");
		pagamentoPF.setValor(35);
		divida.registra(pagamentoPF);*/
		
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		relatorio.geraRelatorio(formatador);
		
	}

}
