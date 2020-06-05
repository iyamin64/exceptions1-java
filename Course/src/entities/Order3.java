package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entites.enums.OrderStatus3;

public class Order3 {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus3 status;
	
	private Client3 client;
	private List<OrderItem3> items = new ArrayList<>();
	
	public Order3(Date moment, OrderStatus3 status, Client3 client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus3 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus3 status) {
		this.status = status;
	}

	public Client3 getClient() {
		return client;
	}

	public void setClient(Client3 client) {
		this.client = client;
	}

	public List<OrderItem3> getItems() {
		return items;
	}
	
	public void addItem(OrderItem3 item) {
		items.add(item);
	}

	public void removeItem(OrderItem3 item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem3 item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem3 item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}