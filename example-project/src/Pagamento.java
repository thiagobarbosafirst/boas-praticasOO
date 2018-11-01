import java.util.Calendar;

public class Pagamento {
	private String pagador;
	private Documento documentoPagador;
	private double valor;
	private Calendar data;
	
	public String getPagador() {
		return this.pagador;
	}
	public void setPagador(String pagador) {
		this.pagador = pagador;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Documento getDocumentoPagador() {
		return documentoPagador;
	}
	public void setDocumentoPagador(Documento documentoPagador) {
		this.documentoPagador = documentoPagador;
	}
}
