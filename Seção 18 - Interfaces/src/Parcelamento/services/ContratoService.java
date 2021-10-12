package Parcelamento.services;

import java.util.Calendar;
import java.util.Date;

import Parcelamento.entities.Contrato;
import Parcelamento.entities.Parcelamento;

public class ContratoService {
	
	private InterPaymentService paymentService;
	
	//construtor
	public ContratoService (InterPaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	//m�todo vai receber um Contrato e o n�mero de parcelas e vai adicionar objetos � list<Parcelamento>
	
	public void processamentoContrato (Contrato contrato, int numeroParcelas) {
		double valorParcela = contrato.getValorLimpo() / numeroParcelas;
		
		for(int i = 1; i<=numeroParcelas; i++) {
			
			Date data = addMesData(contrato.getData(), i);
			
			double valorComTaxa1 = valorParcela + paymentService.parcelaTaxa1(valorParcela, i);
			double valorComTaxa2 = valorComTaxa1 + paymentService.parcelaTaxa2(valorComTaxa1);
			
			contrato.addParcelamento(new Parcelamento(data,valorComTaxa2));
			
		}
		
		
		
	}
	
	//criar um m�todo que recebe uma data e adiciona N meses a ela
	
	private Date addMesData(Date data, int mes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, mes);
		return calendar.getTime();
	}

}
