package com.twu.refactoring;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 */
public class OrderReceipt {
    public static final double SALES_TAX_PERCENT = .10;
    public static final String RECEIPT_HEADER = "======Printing Orders======\n";
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append(RECEIPT_HEADER);

        getCustomerInformation(output);

        getLineItemsInformation(output);

        return output.toString();
    }

    private void getLineItemsInformation(StringBuilder output) {
        double totalSalesTax = 0d;
        double totalAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.asString());
            double lineItemAmount = lineItem.totalAmount();
            double salesTax = lineItemAmount * SALES_TAX_PERCENT;
            totalSalesTax += salesTax;

            totalAmount += lineItemAmount + salesTax;
        }

        output.append("Sales Tax").append('\t').append(totalSalesTax);

        output.append("Total Amount").append('\t').append(totalAmount);
    }

    private void getCustomerInformation(StringBuilder output) {
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
    }
}