package Parcelamento.services;

public interface InterPaymentService {
	
	//criar um m�todo que pegue o valorParcela e o n�mero de m�s e acrescente o juros mensal de 1%
	//criar m�todo que recebe o valor da parcela com taxa e acrescente a taxa de parcelamento de 2%
	
	double parcelaTaxa1(double valorParcela, int mes);
	
	double parcelaTaxa2(double valorComTaxa1);
}
