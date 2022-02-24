public class Main {
    public static void main(String[] args) {
        int result = sumFirstAndLastDigit(257);
        System.out.println(result);
    }

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number > 9) {
            number = number / 10;
        }

        int firstDigit = number;
        int sum = firstDigit + lastDigit;
        return sum;

    }

}

