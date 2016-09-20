package methods;

/**
 * Created by marta on 9/20/16.
 */
public class Interval {

    private double x1;
    private double x2;

    public String toString()
    {
        return "Interval from " + x1 + " to " + x2;
    }

    public Interval(double x1, double x2) {

        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {

        return x1;
    }

    public double getX2() {
        return x2;
    }


}
