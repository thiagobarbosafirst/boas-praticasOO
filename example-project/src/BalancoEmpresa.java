public class BalancoEmpresa {
	
	private ArmazenadorDeDividas dividasManter;
	
	public void registraDivida(ArmazenadorDeDividas dividas) {
			this.dividasManter = dividas;
	}
	
	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividasManter.carrega(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
		dividasManter.salva(divida);
	}
}
