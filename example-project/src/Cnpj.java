
public class Cnpj implements Documento{
	
	private String valor;
	
	public Cnpj(String valor) {
		this.valor = valor;
	}
	
	public boolean cnpjValido() {
	    return primeiroDigitoVerificador() == primeiroDigitoCorreto()
	         && segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int primeiroDigitoCorreto() {
	        
		return 1;
	}
	private int primeiroDigitoVerificador() {
		return 1;
	}
	      
	private int segundoDigitoCorreto() {
		return 2;
	}
	private int segundoDigitoVerificador() {
		return 2;
	}
	
	public String getValor() {
	    return this.valor;
	}
	
	public void setValor(String valor) {
	        this.valor = valor;
	}
	@Override
	public String toString() {
		return this.valor;
	}

	@Override
	public boolean ehValido() {
		// TODO Auto-generated method stub
		return false;
	}

}
