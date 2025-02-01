package secao_8.app;

import java.util.StringJoiner;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantityToAdd) {
        if (quantityToAdd <= 0) {
            throw new IllegalArgumentException("Quantidade menor ou igual a zero.");
        }

        this.quantity = quantity + quantityToAdd;
    }

    public void removeProduct(int quantityToRemove) {
        if (quantityToRemove <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        if (quantityToRemove >= quantity) {
            this.quantity = 0;
        } else {
            this.quantity = quantity - quantityToRemove;
        }
    }

    public void mostrarEstoque() {
        System.out.println("-----------------------");
        System.out.println("Updated data");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Valor total: $" + totalValueInStock());
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        StringJoiner sJoiner = new StringJoiner(", ");
        sJoiner.add("Name: " + name);
        sJoiner.add("Price: " + price);
        sJoiner.add("Quantity: " + quantity);
        sJoiner.add("Valor total: $" + totalValueInStock());
        return sJoiner.toString();

    }
}
