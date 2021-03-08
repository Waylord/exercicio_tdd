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
	

	@Test
	@DisplayName("Verifica se o boleto foi pago totalmente")
	public void testPagamentoTotal() {
		Fatura fatura = new Fatura(935.45, "Erick Siqueira", "20/04/2021");
		Pagamento pagamento = new Pagamento();
		Boleto boleto1 = new Boleto(635.60, "01/05/2021", "86240546574172156934652081514504652058619046521");
		Boleto boleto2 = new Boleto(299.86, "02/05/2021", "45765982134612409861390612496259716812572195215");
		
		pagamento.setFatura(fatura);
		pagamento.adicionaBoleto(boleto1);
		pagamento.adicionaBoleto(boleto2);
		pagamento.pagaBoleto("86240546574172156934652081514504652058619046521");
		
		assertFalse(fatura.getEstaPago());
		
		pagamento.pagaBoleto("45765982134612409861390612496259716812572195215");
		
		assertTrue(fatura.getEstaPago());
	}
}
