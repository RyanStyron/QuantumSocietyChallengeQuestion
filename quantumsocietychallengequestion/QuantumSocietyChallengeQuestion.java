package quantumsocietychallengequestion;

public class QuantumSocietyChallengeQuestion {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println("Ry");
            else if (i % 3 != 0 && i % 5 == 0)
                System.out.println("an");
            else if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Ryan");
            else
                System.out.println(i);
        }
    }
}