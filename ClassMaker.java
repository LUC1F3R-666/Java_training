public class ClassMaker{
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(5);
        System.out.println(str);
        Calculator calc = new Calculator();
        int sum = calc.calculate(10, 20);
        System.out.println("Sum: " + sum);
        Arrays arr = new Arrays();
        int number = arr.showArray(0);
        System.out.println("First number in array: " + number);
    }
}

class Computer {
    public void playMusic() {
        System.out.println("Greetings from Computer! Playing music...");
    }
    public String getMePen(int cost) {
        if (cost < 10)
            return "Pen";

        return "No Pen for you";
    }
}

class Calculator {
    int num=4;
    public int calculate(int n1, int n2) {
        System.out.println("Calculating...");
        System.out.println(num);
        return n1+n2;
    }
}

class Arrays {
    public int showArray(int num) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        return numbers[0];
    }
}
