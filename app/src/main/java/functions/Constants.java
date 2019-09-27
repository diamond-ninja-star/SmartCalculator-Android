package functions;


import java.util.ArrayList;
import java.util.List;

public class Constants
{
    public String constantValue(int constantValue)
    {
        int x=constantValue;
        List list = new ArrayList();
        list.add(1.672621777e-27);
        list.add(1.674927351e-27);
        list.add(9.10938291e-31);
        list.add(1.883531475e-28);
        list.add(5.291772109e-11);
        list.add(6.62606957e-34);
        list.add(5.05078353e-27);
        list.add(9.27400968e-24);
        list.add(1.054571726e-34);
        list.add(7.29735257e-3);
        list.add(2.817940327e-15);
        list.add(2.426310239e-12);
        list.add(267522200.5);
        list.add(1.321409856e-15);
        list.add(1.319590907e-15);
        list.add(10973731.57);
        list.add(1.660538921e-27);
        list.add(1.410606743e-26);
        list.add(-9.2847643e-24);
        list.add(-9.6623647e-27);
        list.add(-4.49044807e-26);
        list.add(96485.3365);
        list.add(1.602176565e-19);
        list.add(6.02214129e23);
        list.add(1.3806488e-23);
        list.add(0.022710953);
        list.add(8.3144621);
        list.add(299792458);
        list.add(3.74177153e-16);
        list.add(1.438777e-2);
        list.add(5.670373e-8);
        list.add(8.854187817e-12);
        list.add(1.256637061e-6);
        list.add(2.067833758e-15);
        list.add(9.80665);
        list.add(7.748091735e-5);
        list.add(376.7303135);
        list.add(273.15);
        list.add(6.67384e-11);
        list.add(101325);
        list.add(2.8977686e-3);
        list.add(2.6867805e25);
        if(x<=42)
        {
            return ""+list.get(x-1);
        }
        return "";
    }
}
