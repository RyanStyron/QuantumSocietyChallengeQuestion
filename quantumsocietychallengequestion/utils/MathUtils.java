package quantumsocietychallengequestion.utils;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    /** Standard deviation calculator. */
    public static double standardDeviationCalculator(double... values) {
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
    public static double[] toPrimitive(Double[] array) {
        final double[] result = new double[array.length];

        for (int i = 0; i < array.length; i++)
            result[i] = array[i].doubleValue();
        return result;
    }

}