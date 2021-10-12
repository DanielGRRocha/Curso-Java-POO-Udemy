package Parcelamento.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Parcelamento.entities.Contrato;
import Parcelamento.entities.Parcelamento;
import Parcelamento.services.ContratoService;
import Parcelamento.services.PaypalService;

public class ParcelamentoProgram {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do contrato: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorContrato);
		
		System.out.print("Insira o número de parcelas: ");
		int numeroParcelas = sc.nextInt();
		
		ContratoService contratoService = new ContratoService(new PaypalService());
		
		contratoService.processamentoContrato(contrato, numeroParcelas);
		
		//output
		
		System.out.println();
		System.out.println("PARCELAMENTO: ");
		for (Parcelamento parcelamento : contrato.getList()) {
			System.out.println(parcelamento.toString());
		}
		
		sc.close();
		
	}

}
