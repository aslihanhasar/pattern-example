import java.util.Scanner;

public class NumbersPattern {
    static int patternRule(int number, int tempNumber, int stop) {
        if (number > 0) {
            System.out.print(number + " ");
            return patternRule(number - 5, tempNumber - 5, stop);
        }
        if (tempNumber <= stop) {
            System.out.print(tempNumber + " ");
            return patternRule(number, tempNumber + 5, stop);
        }
        return stop;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            patternRule(number, number, number);
            System.out.println();
        } while (number > 0);
    }
}
