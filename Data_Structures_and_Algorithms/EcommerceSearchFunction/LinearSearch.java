public class LinearSearch {

    public static Product search(Product[] products, int targetId) {

        int comparisons = 0;

        for (Product product : products) {
            comparisons++;

            if (product.productId == targetId) {
                System.out.println("Linear Search Comparisons: " + comparisons);
                return product;
            }
        }

        System.out.println("Linear Search Comparisons: " + comparisons);
        return null;
    }
}