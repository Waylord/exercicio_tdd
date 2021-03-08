package pagamento;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fatura.Fatura;
import boleto.Boleto;


public class TestPagamento {
	@Test
	@DisplayName("Verifica se o boleto foi pago parcialmente")
	public void testPagamentoParcial() {
		Fatura fatura = new Fatura(935.45, "Erick Siqueira", "20/04/2021");
		Pagamento pagamento = new Pagamento();
		Boleto boleto1 = new Boleto(635.60, "01/05/2021", "86240546574172156934652081514504652058619046521");
		
		pagamento.setFatura(fatura);
		pagamento.adicionaBoleto(boleto1);
		pagamento.pagaBoleto("86240546574172156934652081514504652058619046521");
		
		assertTrue(boleto1.getEstaPago());
		assertFalse(fatura.getEstaPago());
	}
}
