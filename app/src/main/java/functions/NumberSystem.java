package functions;

public class NumberSystem
{
    //This function will convert other number systems to decimal number system
    public String convertToDecimalNumberSystem(String number,String numberSystemType)
    {
        String s=numberSystemType;
        String s1=number;

        if(s.equalsIgnoreCase("binary"))
        {
            return ""+Integer.parseInt(s1,2);
        }
        else if(s.equalsIgnoreCase("octal"))
        {
            return ""+Integer.parseInt(s1,8);
        }
        else if(s.equalsIgnoreCase("hexadecimal"))
        {
            return ""+Integer.parseInt(s1,16);
        }
        return  "";
    }

    //This function will perform mathematical operation on a same number system
    //dependent on " convertToDecimalNumberSystem " function

    public String doMathematicalOperationOnNBasedNumberSystem(String input1,String input2,String numberSystemType,String operationType)
    {
        String s1 = input1;
        String s2 = input2;
        String s3 = numberSystemType;
        String s4 = operationType;
        int checkerFlag =0;
        if(s1.equalsIgnoreCase("")||s2.equalsIgnoreCase(""))
        {
            checkerFlag=1;
        }
        if(checkerFlag==0)
        {
            if(s4.equalsIgnoreCase("add"))
            {
                if(s3.equalsIgnoreCase("decimal"))
                {
                    try
                    {
                        double x1 = Double.parseDouble(input1);
                        double x2 = Double.parseDouble(input2);
                        double x3 = x1+x2;
                        return(Double.toString(x3));
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("binary"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"binary"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"binary"));
                        int z3 = z1+z2;
                        String finalString = Integer.toBinaryString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("octal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"octal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"octal"));
                        int z3 = z1+z2;
                        String finalString = Integer.toOctalString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("hexadecimal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"hexadecimal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"hexadecimal"));
                        int z3 = z1+z2;
                        String finalString = Integer.toHexString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
            }
            if(s4.equalsIgnoreCase("substract"))
            {
                if(s3.equalsIgnoreCase("decimal"))
                {
                    try
                    {
                        double x1 = Double.parseDouble(input1);
                        double x2 = Double.parseDouble(input2);
                        double x3 = x1-x2;
                        return(Double.toString(x3));
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("binary"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"binary"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"binary"));
                        int z3 = z1-z2;
                        String finalString = Integer.toBinaryString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("octal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"octal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"octal"));
                        int z3 = z1-z2;
                        String finalString = Integer.toOctalString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("hexadecimal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"hexadecimal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"hexadecimal"));
                        int z3 = z1-z2;
                        String finalString = Integer.toHexString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
            }
            if(s4.equalsIgnoreCase("multiply"))
            {
                if(s3.equalsIgnoreCase("decimal"))
                {
                    try
                    {
                        double x1 = Double.parseDouble(input1);
                        double x2 = Double.parseDouble(input2);
                        double x3 = x1*x2;
                        return(Double.toString(x3));
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("binary"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"binary"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"binary"));
                        int z3 = z1*z2;
                        String finalString = Integer.toBinaryString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("octal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"octal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"octal"));
                        int z3 = z1*z2;
                        String finalString = Integer.toOctalString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("hexadecimal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"hexadecimal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"hexadecimal"));
                        int z3 = z1*z2;
                        String finalString = Integer.toHexString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
            }
            if(s4.equalsIgnoreCase("divide"))
            {
                if(s3.equalsIgnoreCase("decimal"))
                {
                    try
                    {
                        double x1 = Double.parseDouble(input1);
                        double x2 = Double.parseDouble(input2);
                        double x3 = x1/x2;
                        return(Double.toString(x3));
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("binary"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"binary"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"binary"));
                        int z3 = z1/z2;
                        String finalString = Integer.toBinaryString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("octal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"octal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"octal"));
                        int z3 = z1/z2;
                        String finalString = Integer.toOctalString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
                else if(s3.equalsIgnoreCase("hexadecimal"))
                {
                    try
                    {
                        int z1=Integer.parseInt(convertToDecimalNumberSystem(s1,"hexadecimal"));
                        int z2=Integer.parseInt(convertToDecimalNumberSystem(s2,"hexadecimal"));
                        int z3 = z1/z2;
                        String finalString = Integer.toHexString(z3);
                        return(finalString);
                    }
                    catch(Exception e)
                    {

                    }
                }
            }
        }
        return "";
    }
}
