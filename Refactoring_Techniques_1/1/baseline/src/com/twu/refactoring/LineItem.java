package com.twu.refactoring;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantity) {
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

    public double totalAmount() {
        return price * quantity;
    }

	public String asString() {
		StringBuilder result = new StringBuilder();
		result.append(description);
		result.append('\t');
		result.append(price);
		result.append('\t');
		result.append(quantity);
		result.append('\t');
		result.append(totalAmount());
		result.append('\n');
		return result.toString();
	}

}