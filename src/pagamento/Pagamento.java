package pagamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import boleto.Boleto;
import fatura.Fatura;

public class Pagamento {
	private float valorPago;
	private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate data;
	private String tipoPagamento;
	private Fatura fatura;
	private List<Boleto> listaBoleto = new ArrayList<Boleto>();

	/* método criado visto que todas as operações terão tipoPagamento como Boleto; */
	public Pagamento() {
		this.tipoPagamento = "BOLETO";
	}
	
	public Pagamento(String tipoPagamento, String data, float valorPago) {
		setTipoPagamento(tipoPagamento);
		setValorPago(valorPago);
		setData(data);
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public String getData() {
		return data.format(sdf);
	}

	public void setData(String data) {
		this.data = LocalDate.parse(data, sdf);
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public Fatura getFatura() {
		return fatura;
	}
	
	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	public List<Boleto> getListaBoleto() {
		return listaBoleto;
	}
	
	public void setListaBoleto(List<Boleto> listaBoleto) {
		this.listaBoleto = listaBoleto;
	}
	
	public void calculaSeFaturaEstaPaga() {
		double valorTotalPago = 0;
		for(Boleto boleto : listaBoleto) {
			if(boleto.getEstaPago())
				valorTotalPago += boleto.getValor();
		}
		if(valorTotalPago >= fatura.getValorTotalDaFatura())
			fatura.setPagaFatura();
	}
	
	public void adicionaBoleto(Boleto boleto) {
		this.listaBoleto.add(boleto);
	}
	
	//Método criado considerando que o boleto será integralmente pago
	public void pagaBoleto(String codigoBoleto) {
		for(Boleto boleto : listaBoleto) {
			if(boleto.getCodigoBoleto() == codigoBoleto)
				boleto.setEstaPago();
		}
		calculaSeFaturaEstaPaga();
	}
	
}