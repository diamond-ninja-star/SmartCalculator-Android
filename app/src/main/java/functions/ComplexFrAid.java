package functions;

import org.fraid.complex.functions.*;
import org.netlib.math.complex.Complex;

public class ComplexFrAid
{
    public String complexTrigonometricResult(String operationName,double real,double imaginary)
    {
        if(operationName.equalsIgnoreCase("asinh"))
        {
            Complex z = new Complex(real, imaginary);
            Complex z0 = z.asinh();
            String result = z0.toString();
            return result;
        }
        if(operationName.equalsIgnoreCase("acosh"))
        {
            Complex z = new Complex(real, imaginary);
            Complex z0 = z.acosh();
            String result = z0.toString();
            return result;
        }
        if(operationName.equalsIgnoreCase("atanh"))
        {
            Complex z = new Complex(real, imaginary);
            Complex z0 = z.atanh();
            String result = z0.toString();
            return result;
        }
        if(operationName.equalsIgnoreCase("cosec"))
        {
            Complex z = new Complex(real, imaginary);
            Complex z0 = z.cosec();
            String result = z0.toString();
            return result;
        }
        if(operationName.equalsIgnoreCase("sec"))
        {
            Complex z = new Complex(real, imaginary);
            Complex z0 = z.sec();
            String result = z0.toString();
            return result;
        }
        if(operationName.equalsIgnoreCase("cot"))
        {
            Complex z = new Complex(real, imaginary);
            Complex z0 = z.cot();
            String result = z0.toString();
            return result;
        }
        return "";
    }

}
