package fatura;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFatura {
	@Test
	@DisplayName("Verifica se está gerando a Fatura")
	public void testNovaFatura() {
		Fatura fatura = new Fatura(750.23, "Joao Silva", "01/04/2021");
		assertNotNull(fatura.getValorTotalDaFatura());
	}
	
	@Test
	@DisplayName("Verifica se a fatura consta como paga")
	public void testVerificaSeFaturaEstaPaga() {
		Fatura fatura = new Fatura(521.40, "Camila Nery", "20/03/2021");
		assertFalse(fatura.getEstaPago());
	}
}
