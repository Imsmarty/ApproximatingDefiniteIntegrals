package methods;

/**
 * Created by marta on 10/5/16.
 */
public class Methods {

    /*
     * Returns the midpoint sum for any passed-in function with n steps
     * from a to b
     */
    public static double getMidpoint(double a, double b, int n, Function f)
    {
        Interval[] intervals = getIntervals(a, b, n);
        //System.out.println(a + "\n" + b + "\n" + n + "\n" + f);
        double result = 0;
        for (int i = 0; i < intervals.length-1; i++)
        {
           // System.out.println("Result: " + result);
            //System.out.println(intervals[i]);
            //System.out.println("Midpoint" + getMidpointOfInterval(intervals[i]));
            //System.out.println("Value" + f.evaluate(getMidpointOfInterval(intervals[i])));
            result += f.evaluate(getMidpointOfInterval(intervals[i]));
        }
        result *= (b-a)/n;
        return result;
    }
    /*
     * Returns the midpoint sum for x^2 with n steps from a to b
     */
    public static double getMidpointForX2(double a, double b, int n)
    {
        Interval[] intervals = getIntervals(a, b, n);
        double result = 0;
        for (int i = 0; i < intervals.length-1; i++)
        {
            result += Math.pow(getMidpointOfInterval(intervals[i]),2);
        }
        result *= (b-a)/n;
        return result;
    }
    /*
     * Returns the simpsons sum for x^2 with from a to b
     */
    public static double getSimpsonsForX2(double a, double b)
    {
        return ((b - a)/6.0)*((Math.pow(a, 2) + 4*Math.pow((a + b)/2.0,2) + Math.pow(b, 2)));
    }
    /*
     * Returns the simpsons sum for any function from a to b
     */
    public static double getSimpsons(double a, double b, int n, Function f)
    {
        Interval[] intervals = getIntervals(a, b, n);
        double result = 0;
        for (int i = 0; i < intervals.length-1; i++)
        {
            result += ((b - a)/6.0)*(f.evaluate(intervals[i].getX1()) + 4*f.evaluate((intervals[i].getX1() + intervals[i].getX2())/2.0) + f.evaluate(intervals[i].getX2()));
        }
        result /= n;
        return result;
    }
    /*
     * Returns the trapezoidal sum for x^2 with n steps from a to b
     */
    public static double getTrapezoidalForX2(double a, double b, int n)
    {
        Interval[] intervals = getIntervals(a, b, n);
        double deltaX = (b - a)/n;
        double result = 0;
        for (int i = 0; i < intervals.length-1; i++)
        {
            result += (deltaX/2)*(Math.pow(intervals[i].getX1(),2)+Math.pow(intervals[i].getX2(),2));
        }
        return result;
    }
    /*
     * Returns the trapezoidal sum for any function with n steps from a to b
     */
    public static double getTrapezoidal(double a, double b, int n, Function f)
    {
        Interval[] intervals = getIntervals(a, b, n);
        double deltaX = (b - a)/n;
        double result = 0;
        for (int i = 0; i < intervals.length-1; i++)
        {
            result += (deltaX/2)*(f.evaluate(intervals[i].getX1())+f.evaluate(intervals[i].getX2()));
        }
        return result;
    }
    /*
     * Returns the midpoint of an interval
     */
    public static double getMidpointOfInterval(Interval e)
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
        //System.out.println(deltaX);
        Interval[] intervals = new Interval[n+1];
        double start = a;
        for (int i = 0; i < n; i++)
        {
            double end = start + deltaX;
            Interval interval = new Interval(start,end);
            //System.out.println(interval);
            intervals[i] = interval;
          //  System.out.println("Start" + start);
            start = end;
           // System.out.println("End" + end);
        }
       // System.out.println(intervals);
        return intervals;
    }

}
