package oops_principles.level2.grocery;

import java.util.stream.Collectors;

public class BillGenerator {
    public double generateBill(Customer customer) {
        return customer.getProducts().stream()
                .mapToDouble(Product::getTotalPrice)
                .sum();
    }

    public void printBill(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Purchased Products:");

        customer.getProducts().forEach(product ->
            System.out.printf(" - %s (%d units at $%.2f per unit) → $%.2f%n",
                    product.getName(),
                    product.getQuantity(),
                    product.getPricePerUnit(),
                    product.getTotalPrice())
        );

        System.out.printf("Total Bill: $%.2f%n", generateBill(customer));
    }
}