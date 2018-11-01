import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class Pagamentos implements Iterable<Pagamento>{
	
	private double valorPago;
	ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>(); 
	
	 
	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
	    for (Pagamento pagamento : this) {
	    	if (pagamento.getData().before(data)) {
	    		pagamentosFiltrados.add(pagamento);
	        }
	    }
	    return pagamentosFiltrados;
	}
	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
	    ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
	    for (Pagamento pagamento : this) {
	    	if (pagamento.getValor() > valorMinimo) {
	    		pagamentosFiltrados.add(pagamento);
	        }
	    }
	    return pagamentosFiltrados;
	}
	public Collection<Pagamento> pagamentosDo(String documentoPagador) {
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
	    for (Pagamento pagamento : this) {
	    	if (pagamento.getDocumentoPagador().equals(documentoPagador)) {
	    		pagamentosFiltrados.add(pagamento);
	        }
	    }
	    return pagamentosFiltrados;
	}
	      
	public double getValorPago() {
		return this.valorPago;
	}
	      
	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
	    }
	    if (valor > 100) {
	    	valor = valor - 8;
	    }
	    this.valorPago += valor;
    }
	      
	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	    this.paga(pagamento.getValor());
	}
	      
	public boolean foiRealizado(Pagamento pagamento) {
		return pagamentos.contains(pagamento);
	}
	@Override
	public Iterator<Pagamento> iterator() {
		return this.pagamentos.iterator();
	}
}
