package Parcelamento.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVencimento;
	private double valorComTaxa;
	
	//construtor
	public Parcelamento(Date dataVencimento, double valorComTaxa) {
		this.dataVencimento = dataVencimento;
		this.valorComTaxa = valorComTaxa;
	}
	
	//gettes and setters
	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValorComTaxa() {
		return valorComTaxa;
	}
	public void setValorComTaxa(double valorComTaxa) {
		this.valorComTaxa = valorComTaxa;
	}
	
	//toString
	public String toString() {
		return String.format("%s - %.2f",sdf.format(dataVencimento),valorComTaxa);
	}
	
	
	
	
	

}
