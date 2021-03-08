package boleto;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestBoleto {
	@Test
	@DisplayName("Testa se o boleto est� sendo gerado com sucesso")
	public void testGeraBoleto() {
		Boleto boleto = new Boleto(36.25, "28/03/2021");
		assertNotNull(boleto);
	}
}
