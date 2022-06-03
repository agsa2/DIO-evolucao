package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.OrderStatus;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();  
	
	public Pedido() {
	}

	public Pedido(Date moment, OrderStatus status, Client client) {
		this.moment  = moment;
		this.status  = status;
		this.client = client;
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

	public Client getClient() {
		return client;
	}

	public void setCliente(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrdeItems() {
		return orderItems;
	}

	public void addItems(OrderItem item) {
		orderItems.add(item);
	}
	
	public void removeItems(OrderItem item) {
		orderItems.remove(item);
	}
	
	public double total() {
		double total = 0;
		for (OrderItem oi : orderItems) {
			total += oi.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf.format(this.moment) + "\n");
		sb.append("Order status: " + this.status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem oi : orderItems) {
			sb.append(oi.getProduct().getName() + ", ");
			sb.append("$" + oi.getProduct().getPrice() + ", ");
			sb.append("Quantity: " + oi.getQuantity() + ", ");
			sb.append("Subtotal: $" + oi.subTotal() + "\n");
		}
		
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
}
