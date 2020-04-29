package quantumsocietychallengequestion;

public class QuantumSocietyChallengeQuestion {

    public static void main(String[] args) {
        print();
    }

    private static void print() {
        int number = 0;

        for (int i = 0; i < 100; i++) {
            number++;

            if (number % 3 == 0 && number % 5 != 0)
                System.out.println("Ry");
            else if (number % 3 != 0 && number % 5 == 0)
                System.out.println("an");
            else if (number % 3 == 0 && number % 5 == 0)
                System.out.println("Ryan");
            else
                System.out.println(number);
        }
    }
}