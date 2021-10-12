package Parcelamento.services;

public interface InterPaymentService {
	
	//criar um método que pegue o valorParcela e o número de mês e acrescente o juros mensal de 1%
	//criar método que recebe o valor da parcela com taxa e acrescente a taxa de parcelamento de 2%
	
	double parcelaTaxa1(double valorParcela, int mes);
	
	double parcelaTaxa2(double valorComTaxa1);
}
