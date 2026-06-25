public class BinarySearch {

    public static Product search(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;
        int comparisons = 0;

        while (left <= right) {

            comparisons++;

            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                System.out.println("Binary Search Comparisons: " + comparisons);
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Binary Search Comparisons: " + comparisons);
        return null;
    }
}