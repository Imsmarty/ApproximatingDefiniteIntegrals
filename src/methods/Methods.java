package methods;

/**
 * Created by marta on 10/5/16.
 */
public class Methods {

    /*
     * Returns the midpoint sum for x^2 with n steps and from a to b
     */
    public static double getMidpointForX2(double a, double b, int n)
    {
        Interval[] intervals = getIntervals(a, b, n);

        double result = 0;
        for (int i = 0; i < intervals.length-1; i++)
        {
            result += Math.pow(getMidpoint(intervals[i]),2);
        }
        result *= (b-a)/n;
        return result;
    }

    public static double getMidpoint(Interval e)
    {
        return (e.getX1() + e.getX2())/2;
    }

    /*
    *  Returns the values of xi and xj for each equally spaced interval
    *  based on the number of steps n, and the start a and end b.
    */
    public static Interval[] getIntervals(double a, double b, int n)
    {
        double deltaX = (b - a)/n;
        System.out.println(deltaX);
        Interval[] intervals = new Interval[n+1];
        double start = a;
        for (int i = 0; i < n; i++)
        {
            double end = start + deltaX;
            Interval interval = new Interval(start,end);
            System.out.println(interval);
            intervals[i] = interval;
            start = end;
        }
        return intervals;
    }

}
