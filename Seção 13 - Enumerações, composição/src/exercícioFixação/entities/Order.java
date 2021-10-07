package exercícioFixação.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercícioFixação.enums.OrderStatus;



public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client cliente;
	private List<OrderItem> list = new ArrayList<>();
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getCliente() {
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	
	public List<OrderItem> getList() {
		return list;
	}
	
	public void addItem(OrderItem item) {
		list.add(item);
	}
	
	public void removeItem(OrderItem item) {
		list.remove(item);
	}
	
	//Total
	public double total() {
		double soma = 0.0;
		for(OrderItem order: list) {
			soma += order.subTotal();
		}
		return soma;
	}
	
	//toString
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: " + cliente);
		sb.append("\nOrder items: \n");
		for(OrderItem oi : list) {
			sb.append(oi +"\n");
		}
		sb.append("Preço total: ");
		sb.append(String.format("R$ %.2f",total()));
		
		return sb.toString();
	}

}
