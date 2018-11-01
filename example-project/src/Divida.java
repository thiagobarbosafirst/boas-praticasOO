public class Divida implements ArmazenadorDeDividas{
	private double total;
	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	public void registra(Pagamento pagamento) {
		this.pagamentos.registra(pagamento);	
	}	
	public double getValorPago() {
		return pagamentos.getValorPago();
	}
	public Documento getDocumentoCredor() {
		return documentoCredor;
	}
	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}
	@Override
	public void salva(Divida divida) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Divida carrega(Documento documentoCredor) {
		// TODO Auto-generated method stub
		return null;
	}
}
