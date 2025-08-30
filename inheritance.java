public class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

public class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }

    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}



class Demo
{
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        int r1= obj.add(8,9);
        int r2= obj.sub(5,6);
        int r3= obj.multi(1,0);
        int r4= obj.div(9,4);


        System.out.println(r1 + " " + r2 + " " + r3+ " " + r4);
    }
}

