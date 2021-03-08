package boleto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Boleto {
	private String codigoBoleto;
	private LocalDate dataVencimento;
	private double valor;
	private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private boolean estaPago = false;
	
	public Boleto(double valor, String dataVencimento, String codigoBoleto) {
		setDataVencimento(dataVencimento);
		setValor(valor);
		setCodigoBoleto(codigoBoleto);
	}
	
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
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean getEstaPago() {
		return estaPago;
	}
	
	public void setEstaPago() {
		this.estaPago = true;
	}
	
	public void setNaoEstaPago() {
		this.estaPago = false;
	}
}
