package fatura;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class testFatura {
	@Test
	public void testNovaFatura() {
		Fatura fatura = new Fatura(750.23, "Joao Silva", "01/04/2021");
		assertNotNull(fatura.getValorTotalDaFatura());
	}
}
