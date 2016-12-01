package methods;

/**
 * Created by marta on 11/28/16.
 *
 * Function x^2
 */
public class X2 extends Function {

    public String toString()
    {
        return "x^2";
    }

    public double evaluate(double x)
    {
        return Math.pow(x,2);
    }
}
