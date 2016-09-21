package methods;

 /*
 * Created by marta on 9/20/16.
 */
public class methods {

    public static void main(String[] args)
    {

    }


     /*
     * Returns the midpoint sum for x^2 with n steps and from a to b
     */
    public static double getMidpointForX2(double a, double b, int n)
    {
        Interval[] invervals = getIntervals(a, b, n);
        double result = 0;
        return result;
    }

    /*
    *  Returns the values of xi and xj for each equally spaced interval
    *  based on the number of steps n, and the start a and end b.
    */
    public static Interval[] getIntervals(double a, double b, int n)
    {
        double deltaX = (b - a)/n;
        Interval[] intervals = new Interval[n+1];
        double start = a;
        for (int i = 0; i < n; i++)
        {
            double end = start + deltaX;
            Interval interval = new Interval(start,end);
            intervals[i] = interval;
            start = end;
        }
        return intervals;
    }

}
