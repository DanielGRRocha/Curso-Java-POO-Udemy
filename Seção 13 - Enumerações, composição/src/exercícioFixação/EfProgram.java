package exercícioFixação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


import exercícioFixação.entities.Client;
import exercícioFixação.entities.Order;
import exercícioFixação.entities.OrderItem;
import exercícioFixação.entities.Pizza;
import exercícioFixação.enums.OrderStatus;

public class EfProgram {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Client
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Client cliente = new Client(nome, cpf, dataNascimento);
		
		//Order
		System.out.print("Status do pedido: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(),status, cliente);
		
		//Pizza
		
		System.out.println("Quantas pizzas? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			sc.nextLine();
			System.out.print("Sabor pizza #"+i+":");
			String sabor = sc.nextLine();
			System.out.print("Valor da pizza: ");
			double valorPizza = sc.nextDouble();
			
			Pizza pizza = new Pizza(sabor, valorPizza);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantidade, valorPizza, pizza);
			
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
		
	}

}
