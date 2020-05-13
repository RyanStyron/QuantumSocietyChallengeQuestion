package quantumsocietychallengequestion;

import java.util.ArrayList;
import java.util.List;

public class QuantumSocietyChallengeQuestion {

    public static void main(String[] args) {
        int challenge = 2;

        switch (challenge) {
            case 1:
                challengeOne();
            case 2:
                challengeTwo();
        }
    }

    /**
     * Challenge question one involves printing all values 1-100, however print "Ry"
     * if the value is a multiple of 3, "an" if it is a multiple of 5, or "Ryan" if
     * it is multiple of both.
     */
    private static void challengeOne() {
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

    /**
     * Challenge question two involves the same concept as challenge one, however
     * instead of simply printing the values that are not multiples of 3 or 5, you
     * have to find the standard deviation of them.
     */
    private static void challengeTwo() {
        List<Double> set = new ArrayList<Double>();

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println("Ry (" + i + ")");
            else if (i % 3 != 0 && i % 5 == 0)
                System.out.println("an (" + i + ")");
            else if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Ryan (" + i + ")");
            else
                set.add((double) i);
        }
        Double[] doubleSet = set.toArray(new Double[set.size()]);
        double[] doubleSetPrimitive = toPrimitive(doubleSet);

        System.out.println(standardDeviationCalculator(doubleSetPrimitive) + " (SD)");
    }

    /** Standard deviation calculator. */
    private static double standardDeviationCalculator(double... values) {
        List<Double> set = new ArrayList<>();

        for (double value : values)
            set.add(value);
        double sum = 0;

        for (int i = 0; i < set.size(); i++)
            sum = sum + set.get(i);
        double mean = sum / set.size();
        double variance = 0;

        for (int i = 0; i < set.size(); i++)
            variance += (set.get(i) - mean) * (set.get(i) - mean);
        double standardDeviation = Math.sqrt(variance / (set.size() - 1));

        return standardDeviation;
    }

    /**
     * @return Primitive type of the Double class.
     */
    private static double[] toPrimitive(Double[] array) {
        final double[] result = new double[array.length];

        for (int i = 0; i < array.length; i++)
            result[i] = array[i].doubleValue();
        return result;
    }
}