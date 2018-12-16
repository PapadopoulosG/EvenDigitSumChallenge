package eu.georgiospapadopoulos;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }


    /**
     * Receives a number and adds all its even digits.
     * Returns -1 if number is negative.
     *
     * @param number Number to add sum of.
     * @return Sum of number's even digits.
     */

    private static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int currentDigit , sum = 0;

        while (number > 0)
        {
            currentDigit = number % 10;
            number /= 10;

            if (currentDigit % 2 == 0)
            {
                sum += currentDigit;
            }
        }
        return sum;
    }
}
