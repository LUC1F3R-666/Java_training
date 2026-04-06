public class SimpleItems {
    public static void main(String[] args) {
        //print second largest number in the array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
        }
        System.out.println("Second largest number is: " + secondLargest);
    }
}
