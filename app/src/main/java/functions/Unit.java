package functions;

public class Unit
{
    public String UnitConversion(String converterInputString,String converterUnitString, String converterFromString, String converterToString)
    {
        double converterInput , converterOutput;
        String converterOutputString;
        switch(converterUnitString)
        {
            //torque
            case "Torque":
                // both equal
                double g = 9.807;
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //newton meter to meter kilogram
                else if( converterFromString.equalsIgnoreCase("Newton Meter")&&converterToString.equalsIgnoreCase("Meter Kilogram") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( 1 / g );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //meter kilogram to bewton meter
                else if( converterFromString.equalsIgnoreCase("Meter Kilogram")&&converterToString.equalsIgnoreCase("Newton Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( g );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }

                //angle
            case "Angle":
                // both equal
                double pi = Math.PI;
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //degree to radian
                else if( converterFromString.equalsIgnoreCase("Degree")&&converterToString.equalsIgnoreCase("Radian") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( pi / 180 );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //radian to degree
                else if( converterFromString.equalsIgnoreCase("Radian")&&converterToString.equalsIgnoreCase("Degree") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( 180 / pi );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //density
            case "Density":
                double kgPERm3TogmPERcm3 = 0.001;
                double kgPERm3TolbPERft3 = 0.062427961;
                double gmPERcm3TokgPERm3 = 1000;
                double gmPERcm3TolbPERft3 = 62.427961;
                double lbPERft3TokgPERm3 = 16.0184633;
                double lbPERft3TogmPERcm3 = 0.0160184633;

                //both equal
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                // kg/m^3 to gm/cm^3
                else if( converterFromString.equalsIgnoreCase("Kilogram Per Meter Cube")&&converterToString.equalsIgnoreCase("Gram Per Centimeter Cube") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * kgPERm3TogmPERcm3;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                // kg/m^3 to lb/ft^3
                else if( converterFromString.equalsIgnoreCase("Kilogram Per Meter Cube")&&converterToString.equalsIgnoreCase("Pound Per Foot Cube") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * kgPERm3TolbPERft3;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //gm/cm^3 to kg/m^3
                else if( converterFromString.equalsIgnoreCase("Gram Per Centimeter Cube")&&converterToString.equalsIgnoreCase("Kilogram Per Meter Cube") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * gmPERcm3TokgPERm3;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //gm/cm^3 to lb/ft^3
                else if( converterFromString.equalsIgnoreCase("Gram Per Centimeter Cube")&&converterToString.equalsIgnoreCase("Pound Per Foot Cube") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * gmPERcm3TolbPERft3;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //lb/ft^3 to kg/m^3
                else if( converterFromString.equalsIgnoreCase("Pound Per Foot Cube")&&converterToString.equalsIgnoreCase("Kilogram Per Meter Cube") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * lbPERft3TokgPERm3;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //lb/ft^ to gm/cm^3
                else if( converterFromString.equalsIgnoreCase("Pound Per Foot Cube")&&converterToString.equalsIgnoreCase("Gram Per Centimeter Cube") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * lbPERft3TogmPERcm3;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Time
            case "Time":
                // both equal
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //day to hour
                else if( converterFromString.equalsIgnoreCase("Day")&&converterToString.equalsIgnoreCase("Hour") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( 24 );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //day to minute
                else if( converterFromString.equalsIgnoreCase("Day")&&converterToString.equalsIgnoreCase("Minute") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( 24 * 60 );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //day to second
                else if( converterFromString.equalsIgnoreCase("Day")&&converterToString.equalsIgnoreCase("Second") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( 24 * 60 * 60 );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //hour to day
                else if( converterFromString.equalsIgnoreCase("Hour")&&converterToString.equalsIgnoreCase("Day") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput /24 ;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //hour to min
                else if( converterFromString.equalsIgnoreCase("Hour")&&converterToString.equalsIgnoreCase("Minute") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( 60  );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //hour to sec
                else if( converterFromString.equalsIgnoreCase("Hour")&&converterToString.equalsIgnoreCase("Second") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * ( 60*60 );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //minute to day
                else if( converterFromString.equalsIgnoreCase("Minute")&&converterToString.equalsIgnoreCase("Day") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput  / ( 24 * 60 ) ;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //minute to hour
                else if( converterFromString.equalsIgnoreCase("Minute")&&converterToString.equalsIgnoreCase("Hour") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput  /  60 ;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //minute to second
                else if( converterFromString.equalsIgnoreCase("Minute")&&converterToString.equalsIgnoreCase("Second") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * (  60  );
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //second to day
                else if( converterFromString.equalsIgnoreCase("Second")&&converterToString.equalsIgnoreCase("Day") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput / ( 24*60*60 )  ;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //second to day
                else if( converterFromString.equalsIgnoreCase("Second")&&converterToString.equalsIgnoreCase("Hour") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput / ( 60*60 )   ;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //second to minute
                else if( converterFromString.equalsIgnoreCase("Second")&&converterToString.equalsIgnoreCase("Minute") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput /  60    ;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
            case "Temperature":
                // both equal
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                // celsius to fahrenheit
                else if( converterFromString.equalsIgnoreCase("Celsius")&&converterToString.equalsIgnoreCase("Fahrenheit") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = (converterInput* 1.8 )+32 ; // 9/5=1.8
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                // celsius to kelvin
                else if( converterFromString.equalsIgnoreCase("Celsius")&&converterToString.equalsIgnoreCase("Kelvin") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput + 273.15 ;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                // fahrenheit to celsius
                else if( converterFromString.equalsIgnoreCase("Fahrenheit")&&converterToString.equalsIgnoreCase("Celsius") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = (5*(converterInput-32))/9;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                // fahrenheit to celsius
                else if( converterFromString.equalsIgnoreCase("Fahrenheit")&&converterToString.equalsIgnoreCase("Kelvin") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = 273.15+((converterInput-32)/1.8);
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //kelvin to celsius
                else if( converterFromString.equalsIgnoreCase("Kelvin")&&converterToString.equalsIgnoreCase("Celsius") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput-273.15;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //kelvin to fahrenheit
                else if( converterFromString.equalsIgnoreCase("Kelvin")&&converterToString.equalsIgnoreCase("Fahrenheit") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = ((converterInput - 273.15)* 1.8000)+ 32.00; // 9/5=1.8
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
            case "Speed":
                //both equal
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //km/h to mile/h
                else if( converterFromString.equalsIgnoreCase("Kilometer Per Hour")&&converterToString.equalsIgnoreCase("Mile Per Hour") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.62137119;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //km/h to m/s
                else if( converterFromString.equalsIgnoreCase("Kilometer Per Hour")&&converterToString.equalsIgnoreCase("Meter Per Second") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = (converterInput * 5) /18 ; // 5/18=0.27777777777.......
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //mile/h to km/h
                else if( converterFromString.equalsIgnoreCase("Mile Per Hour")&&converterToString.equalsIgnoreCase("Kilometer Per Hour") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1.66934401;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //mile/h to km/h
                else if( converterFromString.equalsIgnoreCase("Mile Per Hour")&&converterToString.equalsIgnoreCase("Meter Per Second") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.447039998;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //m/s to km/h
                else if( converterFromString.equalsIgnoreCase("Meter Per Second")&&converterToString.equalsIgnoreCase("Kilometer Per Hour") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 3.6;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //m/s to mile/h
                else if( converterFromString.equalsIgnoreCase("Meter Per Second")&&converterToString.equalsIgnoreCase("Mile Per Hour") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 2.2369363;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
            case "Weight":
                //both equal
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //kilogram to Gram
                else if( converterFromString.equalsIgnoreCase("Kilogram")&&converterToString.equalsIgnoreCase("Gram") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //kilogram to Pound
                else if( converterFromString.equalsIgnoreCase("Kilogram")&&converterToString.equalsIgnoreCase("Pound") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 2.2046226;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Gram to Kilogram
                else if( converterFromString.equalsIgnoreCase("Gram")&&converterToString.equalsIgnoreCase("Kilogram") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.001;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Gram to Pound
                else if( converterFromString.equalsIgnoreCase("Gram")&&converterToString.equalsIgnoreCase("Pound") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0022046226;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Pound to Kilogram
                else if( converterFromString.equalsIgnoreCase("Pound")&&converterToString.equalsIgnoreCase("Kilogram") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.453592374;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Pound to Gram
                else if( converterFromString.equalsIgnoreCase("Pound")&&converterToString.equalsIgnoreCase("Gram") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 453.592374;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
            case "Volume":
                //both equal
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Liter to Cubic Meter
                else if( converterFromString.equalsIgnoreCase("Liter")&&converterToString.equalsIgnoreCase("Cubic Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.001;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Liter to Cubic Centimeter
                else if( converterFromString.equalsIgnoreCase("Liter")&&converterToString.equalsIgnoreCase("Cubic Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Liter to Cubic Foot
                else if( converterFromString.equalsIgnoreCase("Liter")&&converterToString.equalsIgnoreCase("Cubic Foot") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.035314667;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Liter to Cubic Centimeter
                else if( converterFromString.equalsIgnoreCase("Liter")&&converterToString.equalsIgnoreCase("Cubic Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 61.023744;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Meter to Liter
                else if( converterFromString.equalsIgnoreCase("Cubic Meter")&&converterToString.equalsIgnoreCase("Liter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Meter to Cubic Centimeter
                else if( converterFromString.equalsIgnoreCase("Cubic Meter")&&converterToString.equalsIgnoreCase("Cubic Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1000000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Meter to Cubic Foot
                else if( converterFromString.equalsIgnoreCase("Cubic Meter")&&converterToString.equalsIgnoreCase("Cubic Foot") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 35.314667;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Meter to Cubic Inch
                else if( converterFromString.equalsIgnoreCase("Cubic Meter")&&converterToString.equalsIgnoreCase("Cubic Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 61023.744;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Centimeter to Liter
                else if( converterFromString.equalsIgnoreCase("Cubic Centimeter")&&converterToString.equalsIgnoreCase("Liter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.001;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Centimeter to Cubic Meter
                else if( converterFromString.equalsIgnoreCase("Cubic Centimeter")&&converterToString.equalsIgnoreCase("Cubic Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.000001;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Centimeter to Cubic Foot
                else if( converterFromString.equalsIgnoreCase("Cubic Centimeter")&&converterToString.equalsIgnoreCase("Cubic Foot") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.000035314667;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Centimeter to Cubic Inch
                else if( converterFromString.equalsIgnoreCase("Cubic Centimeter")&&converterToString.equalsIgnoreCase("Cubic Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.061023744;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Foot to Liter
                else if( converterFromString.equalsIgnoreCase("Cubic Foot")&&converterToString.equalsIgnoreCase("Liter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 28.3168464;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Foot  to Cubic Meter
                else if( converterFromString.equalsIgnoreCase("Cubic Foot")&&converterToString.equalsIgnoreCase("Cubic Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0283168464;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Foot  to Cubic Centimeter
                else if( converterFromString.equalsIgnoreCase("Cubic Foot")&&converterToString.equalsIgnoreCase("Cubic Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 28316.8464;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Foot  to Cubic Inch
                else if( converterFromString.equalsIgnoreCase("Cubic Foot")&&converterToString.equalsIgnoreCase("Cubic Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1728;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Inch to Liter
                else if( converterFromString.equalsIgnoreCase("Cubic Inch")&&converterToString.equalsIgnoreCase("Liter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.016387064;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Inch  to Cubic Meter
                else if( converterFromString.equalsIgnoreCase("Cubic Inch")&&converterToString.equalsIgnoreCase("Cubic Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.000016387064;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Inch  to Cubic Centimeter
                else if( converterFromString.equalsIgnoreCase("Cubic Inch")&&converterToString.equalsIgnoreCase("Cubic Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 16.387064;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Cubic Inch  to Cubic Foot
                else if( converterFromString.equalsIgnoreCase("Cubic Inch")&&converterToString.equalsIgnoreCase("Cubic Foot") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.000578703704;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
            case "Length":
                //both equal
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }	//Kilometer to Meter
                else if( converterFromString.equalsIgnoreCase("Kilometer")&&converterToString.equalsIgnoreCase("Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Kilometer to Centimeter
                else if( converterFromString.equalsIgnoreCase("Kilometer")&&converterToString.equalsIgnoreCase("Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 10000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Kilometer to Mile
                else if( converterFromString.equalsIgnoreCase("Kilometer")&&converterToString.equalsIgnoreCase("Mile") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.62137227;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Kilometer to Foot
                else if( converterFromString.equalsIgnoreCase("Kilometer")&&converterToString.equalsIgnoreCase("Foot"))
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 3280.8399;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Kilometer to Inch
                else if( converterFromString.equalsIgnoreCase("Kilometer")&&converterToString.equalsIgnoreCase("Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 39370.147;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Meter to Kilometer
                else if( converterFromString.equalsIgnoreCase("Meter")&&converterToString.equalsIgnoreCase("Kilometer") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.001;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Meter to Centimeter
                else if( converterFromString.equalsIgnoreCase("Meter")&&converterToString.equalsIgnoreCase("Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Meter to Mile
                else if( converterFromString.equalsIgnoreCase("Meter")&&converterToString.equalsIgnoreCase("Mile") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.00062137119;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Meter to Foot
                else if( converterFromString.equalsIgnoreCase("Meter")&&converterToString.equalsIgnoreCase("Foot"))
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 3.28083399;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Meter to Inch
                else if( converterFromString.equalsIgnoreCase("Meter")&&converterToString.equalsIgnoreCase("Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 39.370079;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Centimeter to Kilometer
                else if( converterFromString.equalsIgnoreCase("Centimeter")&&converterToString.equalsIgnoreCase("Kilometer") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.00001;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Centimeter to Meter
                else if( converterFromString.equalsIgnoreCase("Centimeter")&&converterToString.equalsIgnoreCase("Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.01;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Centimeter to Mile
                else if( converterFromString.equalsIgnoreCase("Centimeter")&&converterToString.equalsIgnoreCase("Mile") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0000062137119;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Centimeter to Foot
                else if( converterFromString.equalsIgnoreCase("Centimeter")&&converterToString.equalsIgnoreCase("Foot"))
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.032808399;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Centimeter to Inch
                else if( converterFromString.equalsIgnoreCase("Centimeter")&&converterToString.equalsIgnoreCase("Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.39370079;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Mile to Kilometer
                else if( converterFromString.equalsIgnoreCase("Mile")&&converterToString.equalsIgnoreCase("Kilometer") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1.60934401;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Mile to Meter
                else if( converterFromString.equalsIgnoreCase("Mile")&&converterToString.equalsIgnoreCase("Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1609.34401;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Mile to Centimeter
                else if( converterFromString.equalsIgnoreCase("Mile")&&converterToString.equalsIgnoreCase("Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 160934.401;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Mile to Foot
                else if( converterFromString.equalsIgnoreCase("Mile")&&converterToString.equalsIgnoreCase("Foot"))
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 5280;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Mile to Inch
                else if( converterFromString.equalsIgnoreCase("Mile")&&converterToString.equalsIgnoreCase("Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 63360;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Foot to Kilometer
                else if( converterFromString.equalsIgnoreCase("Foot")&&converterToString.equalsIgnoreCase("Kilometer") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.00003048;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Foot to Meter
                else if( converterFromString.equalsIgnoreCase("Foot")&&converterToString.equalsIgnoreCase("Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.3048;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Foot to Centimeter
                else if( converterFromString.equalsIgnoreCase("Foot")&&converterToString.equalsIgnoreCase("Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 30.48;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Foot to Mile
                else if( converterFromString.equalsIgnoreCase("Foot")&&converterToString.equalsIgnoreCase("Mile"))
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.000189393939;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Foot to Inch
                else if( converterFromString.equalsIgnoreCase("Foot")&&converterToString.equalsIgnoreCase("Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 12;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Inch to Kilometer
                else if( converterFromString.equalsIgnoreCase("Inch")&&converterToString.equalsIgnoreCase("Kilometer") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0000253999998;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Inch to Meter
                else if( converterFromString.equalsIgnoreCase("Inch")&&converterToString.equalsIgnoreCase("Meter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.02533999998;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Inch to Centimeter
                else if( converterFromString.equalsIgnoreCase("Inch")&&converterToString.equalsIgnoreCase("Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 2.53999998;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Inch to Mile
                else if( converterFromString.equalsIgnoreCase("Inch")&&converterToString.equalsIgnoreCase("Mile"))
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0000157828283;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Inch to Foot
                else if( converterFromString.equalsIgnoreCase("Inch")&&converterToString.equalsIgnoreCase("Foot") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0833333333;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
            case "Pressure":
                //both same
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Physical Atmosphere to bar
                else if( converterFromString.equalsIgnoreCase("Physical Atmosphere")&&converterToString.equalsIgnoreCase("bar") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1.01325;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Physical Atmosphere to Kilo Pascal
                else if( converterFromString.equalsIgnoreCase("Physical Atmosphere")&&converterToString.equalsIgnoreCase("Kilo Pascal") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 101.325;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Physical Atmosphere to mmHg
                else if( converterFromString.equalsIgnoreCase("Physical Atmosphere")&&converterToString.equalsIgnoreCase("mmHg") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 760;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //bar to Physical Atmosphere
                else if( converterFromString.equalsIgnoreCase("bar")&&converterToString.equalsIgnoreCase("Physical Atmosphere") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.98692327;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //bar to Kilo Pascal
                else if( converterFromString.equalsIgnoreCase("bar")&&converterToString.equalsIgnoreCase("Kilo Pascal") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 100;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //bar to mmHg
                else if( converterFromString.equalsIgnoreCase("bar")&&converterToString.equalsIgnoreCase("mmHg") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 750.06158;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Kilo Pascal to Physical Atmosphere
                else if( converterFromString.equalsIgnoreCase("Kilo Pascal")&&converterToString.equalsIgnoreCase("Physical Atmosphere") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0098692327;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Kilo Pascal to bar
                else if( converterFromString.equalsIgnoreCase("Kilo Pascal")&&converterToString.equalsIgnoreCase("bar") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.01;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Kilo Pascal to mmHg
                else if( converterFromString.equalsIgnoreCase("Kilo Pascal")&&converterToString.equalsIgnoreCase("mmHg") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 7.5006158;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //mmHg to Physical Atmosphere
                else if( converterFromString.equalsIgnoreCase("mmHg")&&converterToString.equalsIgnoreCase("Physical Atmosphere") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.0013157897;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //mmHg to bar
                else if( converterFromString.equalsIgnoreCase("mmHg")&&converterToString.equalsIgnoreCase("bar") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.00133322387;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //mmHg to Kilo Pascal
                else if( converterFromString.equalsIgnoreCase("mmHg")&&converterToString.equalsIgnoreCase("Kilo Pascal") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.13332387;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }

            case "Area":
                //both same
                if( converterFromString.equalsIgnoreCase(converterToString) )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput = converterInput * 1;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }

                //Square Meter to Square Centimeter
                else if( converterFromString.equalsIgnoreCase("Square Meter")&&converterToString.equalsIgnoreCase("Square Centimeter") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 10000;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Square Meter to Square Mile
                else if( converterFromString.equalsIgnoreCase("Square Meter")&&converterToString.equalsIgnoreCase("Square Mile") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 0.00000038610216;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Square Meter to Square Inch
                else if( converterFromString.equalsIgnoreCase("Square Meter")&&converterToString.equalsIgnoreCase("Square Inch") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 1550.0031;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
                //Square Meter to Square Foot
                else if( converterFromString.equalsIgnoreCase("Square Meter")&&converterToString.equalsIgnoreCase("Square Foot") )
                {

                    converterInput = Double.parseDouble(converterInputString);
                    converterOutput =  converterInput * 10.76391;
                    converterOutputString = ""+converterOutput;
                    return(converterOutputString);
                }
        }
        return "";
    }
}
