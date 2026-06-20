import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", 65000),
                new Product(102, "Mouse", 799),
                new Product(103, "Keyboard", 1499),
                new Product(104, "Monitor", 12000),
                new Product(105, "Headphones", 2499)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name to search: ");
        String searchKey = scanner.nextLine();

        System.out.println("\nLinear Search Result:");

        Product linearResult =
                SearchService.linearSearch(products, searchKey);

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nBinary Search Result:");

        Product binaryResult =
                SearchService.binarySearch(products, searchKey);

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found.");
        }

        scanner.close();
    }
}