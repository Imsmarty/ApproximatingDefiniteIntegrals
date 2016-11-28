package methods;

/**
 * Created by marta on 11/28/16.
 *
 * Function ax^2 + bx + c
 */
public class AX2PlusBXPlusC extends X2 {

    private double a;
    private double b;
    private double c;

    public AX2PlusBXPlusC(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double evaluate(double x) {
        return (a*Math.pow(x, 2)) + (b*x) + c;
    }
}
