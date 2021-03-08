package fatura;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fatura {
	private LocalDate dataVencimento;
	private double valorTotalDaFatura;
	private String nomeDoCliente;
	private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Fatura(double valorTotalDaFatura, String nomeDoCliente, String dataVencimento) {
		setDataVencimento(dataVencimento);
		setNomeDoCliente(nomeDoCliente);
		setValorTotalDaFatura(valorTotalDaFatura);
	}

	public String getDataVencimento() {
		return dataVencimento.format(sdf);
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = LocalDate.parse(dataVencimento, sdf);
	}

	public double getValorTotalDaFatura() {
		return valorTotalDaFatura;
	}

	public void setValorTotalDaFatura(double valorTotalDaFatura) {
		this.valorTotalDaFatura = valorTotalDaFatura;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	
	
}
