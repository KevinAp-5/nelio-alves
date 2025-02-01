package secao_8.app;

import java.util.Scanner;

public class TesteProduct {

    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = scanner.next();
        System.out.print("Price: ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = scanner.nextInt();

        // product.mostrarEstoque();
        System.out.println(product);
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProduct(scanner.nextInt());
        System.out.println(product);
        // product.mostrarEstoque();

        System.out.print("Enter the number of products to be removed in stock: ");
        product.removeProduct(scanner.nextInt());
        System.out.println(product);
        // product.mostrarEstoque();

        scanner.close();
    }
}
