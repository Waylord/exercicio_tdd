package boleto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Boleto {
	private String codigoBoleto;
	private LocalDate dataVencimento;
	private float valor;
	private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	public String getCodigoBoleto() {
		return codigoBoleto;
	}
	
	public void setCodigoBoleto(String codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}
	
	public String getDataVencimento() {
		return dataVencimento.format(sdf);
	}
	
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = LocalDate.parse(dataVencimento, sdf);
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
