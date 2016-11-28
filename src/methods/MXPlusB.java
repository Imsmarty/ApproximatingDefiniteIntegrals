package methods;

/**
 * Created by marta on 11/28/16.
 *
 * Function mx + b
 */
public class MXPlusB extends X {

    private double m;
    private double b;

    public MXPlusB(double m, double b)
    {
        this.m = m;
        this.b = b;
    }

    public double evaluate(double x)
    {
        return ((m*x) + b);
    }
}
