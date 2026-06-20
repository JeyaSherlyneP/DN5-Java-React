import java.util.Arrays;
import java.util.Comparator;

public class SearchService {

    // Linear Search
    public static Product linearSearch(Product[] products, String target) {

        for (Product product : products) {

            if (product.getProductName()
                       .equalsIgnoreCase(target)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String target) {

        Arrays.sort(products,
                Comparator.comparing(Product::getProductName));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int comparison = products[mid]
                    .getProductName()
                    .compareToIgnoreCase(target);

            if (comparison == 0) {
                return products[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}