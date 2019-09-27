package functions;

import java.util.ArrayList;
import java.util.List;

public class Equation
{
    public List calculationPerform(double a, double b, double c)
    {
        List list1 = new ArrayList();
        list1.clear();
        double x1,x2;
        try
        {
            x1 = (1/(2*a))*(-b+Math.sqrt((Math.pow(b,2)-(4*a*c))));
            x2 = (1/(2*a))*(-b-Math.sqrt((Math.pow(b,2)-(4*a*c))));
            list1.add("FIRST ROOT  :    "+x1);
            list1.add("SECOND ROOT :    "+x2);
            return  list1;
        }
        catch(Exception e)
        {
            list1.add(e.getMessage());
        }

        return list1;
    }
    public List calculationPerform(double a, double b, double c,double d)
    {
        List list1 = new ArrayList();
        list1.clear();
        double x1,x2,x3;
        try
        {
            double f = (1.0/3.0)*(((3.0*c)/a)-(Math.pow(b,2.0)/Math.pow(a,2.0)));
            //a = 2 ; b= -4 ; c = -22 ; d= 24;
            //System.out.println("a : "+a+" b : "+b+" c : "+c+" d : "+d);
            double g1 = 1.0/27.0;
            //System.out.println("g1 : "+g1);
            double g2 = (2*Math.pow(b, 3))/Math.pow(a, 3);
            //System.out.println("g2 : "+g2);
            double g3 = ( 9* b*c )/ (Math.pow(a, 2));
            //System.out.println("g3 : "+g3);
            double g4 = (27*d)/a;
            // System.out.println("g4 : "+g4);

            double g5 = g2 - g3 + g4 ;
            // System.out.println("g5 : "+g5);
            double g6 = g5/27;
            //System.out.println("g6 : "+g6);
            double g = g6;
            double h = ((Math.pow(g,2.0))/4.0)+((Math.pow(f,3.0))/27.0);
            double i = Math.sqrt(((Math.pow(g,2.0))/4.0)-h);
            double j = Math.cbrt(i);
            double k = Math.acos(-(g/(2.0*i)));
            double l = j*(-1.0);
            double m = Math.cos(k/3.0);
            double n = Math.sqrt(3.0)*Math.sin(k/3.0);
            double p = (-1.0)*(b/(3.0*a));
            x1 = (2.0*j*Math.cos(k/3.0))-(b/(3.0*a));
            x2 = (l*(m+n))+p;
            x3 = (l*(m-n))+p;

            //System.out.println("f: "+f+" "+"g: "+g+" "+"h: "+h+" "+"i: "+i+" "+"j: "+j+" "+"k: "+k+" "+"l: "+l+" "+"m: "+m+" "+"n: "+n+" "+"p: "+p);
            // fPrint(2.0,-4.0,-22.0,24.0;
            list1.add("FIRST ROOT  :    "+x1);
            list1.add("SECOND ROOT :    "+x2);
            list1.add("THIRD ROOT  :    "+x3);

            return list1;
        }
        catch(Exception e)
        {
            list1.add(e.getMessage());
        }
        return list1;
    }
    public List calculationPerform(double a1, double b1, double c1,double a2,double b2,double c2)
    {
        List list1 = new ArrayList();
        list1.clear();
        try
        {
            double x,y;
            double d = ( a1 * b2 ) - ( a2 * b1 );
            x = ( (b1*c2) - (b2*c1) )/d;
            y = ( (c1 * a2) - (c2*a1))/d;
            list1.add("FIRST VARIABLE  :    "+x);
            list1.add("SECOND VARIABLE :    "+y);
            return  list1;
        }
        catch(Exception e)
        {
            list1.add(e.getMessage());
        }
        return list1;
    }
    public List calculationPerform(double x1, double y1, double z1,double c1,double x2,double y2,double z2,double c2,double x3,double y3,double z3,double c3)
    {
        List list1 = new ArrayList();
        list1.clear();
        try
        {
            double a = x1;
            double b = y1;
            double c = z1;
            double d = x2;
            double e = y2;
            double f = z2;
            double g = x3;
            double h = y3;
            double i = z3;
            double j = c1;
            double k = c2;
            double l = c3;

            double M,x,y,z;
            M = a*e*i + b*f*g + c*d*h - c*e*g - b*d*i - a*f*h;
            x = (j*e*i + b*f*l + c*k*h - c*e*l - b*k*i - j*f*h) / M;
            y = (a*k*i + j*f*g + c*d*l - c*k*g - j*d*i - a*f*l) / M;
            z = (a*e*l + b*k*g + j*d*h - j*e*g - b*d*l - a*k*h) / M;
            list1.add("FIRST  VARIABLE :    "+x);
            list1.add("SECOND VARIABLE :    "+y);
            list1.add("THIRD  VARIABLE :    "+z);
            return  list1;
        }
        catch(Exception e)
        {
            list1.add(e.getMessage());
        }
        return list1;
    }
}
