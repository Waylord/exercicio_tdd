package pagamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pagamento {
	private float valorPago;
	private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate data;
	private String tipoPagamento;

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
	
	
}