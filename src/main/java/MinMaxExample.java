public class MinMaxExample {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 16, 90, 33};

        // Initialize both smallest and largest with the first element
        int smallest = numbers[0];
        int largest = numbers[0];

        // For-each loop to find smallest and largest
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        // Print results
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
