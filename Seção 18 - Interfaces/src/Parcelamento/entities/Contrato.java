package Parcelamento.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private int numero;
	private Date data;
	private double valorLimpo;
	
	private List<Parcelamento> list = new ArrayList<>();
	
	//construtor
	public Contrato(int numero, Date data, double valorLimpo) {
		super();
		this.numero = numero;
		this.data = data;
		this.valorLimpo = valorLimpo;
	}
	
	//getters and setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public double getValorLimpo() {
		return valorLimpo;
	}
	public void setValorLimpo(double valorLimpo) {
		this.valorLimpo = valorLimpo;
	}
	
	//list
	public List<Parcelamento> getList() {
		return list;
	}
	
	public void addParcelamento(Parcelamento parcelamento) {
		list.add(parcelamento);
	}
	
	public void removeParcelamento(Parcelamento parcelamento) {
		list.remove(parcelamento);
	}
	

}
