package methods;

/**
 * Created by marta on 11/28/16.
 *
 * Function ax^3 + bx^2 + cx + d
 */
public class AX3PlusBX2PlusCXPlusD extends X3{

    private double a;
    private double b;
    private double c;
    private double d;

    public AX3PlusBX2PlusCXPlusD(double a, double b, double c, double d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double evaluate(double x)
    {
        return ((a*Math.pow(x,3)) + (b*Math.pow(x, 2)) + (c*x) + d);
    }
}
