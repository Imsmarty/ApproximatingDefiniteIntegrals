package methods;

/**
 * Created by marta on 11/28/16.
 */
public class EToTheX extends Function {

    @Override
    public double evaluate(double x) {
        return Math.pow(Math.E,x);
    }
}
