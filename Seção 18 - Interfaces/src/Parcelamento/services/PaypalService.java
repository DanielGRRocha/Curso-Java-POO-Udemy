package Parcelamento.services;

public class PaypalService implements InterPaymentService {
	
	
	public double parcelaTaxa1(double valorParcela, int mes) {
		return valorParcela * mes * 0.01;
	}
	
	public double parcelaTaxa2(double valorComTaxa1) {
		return valorComTaxa1 * 0.02;
	}
	
	

}
