package boleto;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestBoleto {
	@Test
	@DisplayName("Testa se o boleto está sendo gerado com sucesso")
	public void testGeraBoleto() {
		Boleto boleto = new Boleto(36.25, "28/03/2021", "34608792238368646694519159330713283063386223188");
		assertNotNull(boleto);
	}
	
	@Test
	@DisplayName("Testa se o boleto está pago")
	public void testSeBoletoEstaPago() {
		Boleto boleto = new Boleto(352.67, "15/03/2021", "54884308434535244524353043324450168412941432504");
		assertFalse(boleto.getEstaPago());
	}
}
