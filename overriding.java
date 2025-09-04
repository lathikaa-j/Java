class A
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

class B extends A
{
    public int add(int n1, int n2)
    {
        return n1+n2+2;
    }
}

class Demo
{
    public static void main(String args[])
    {
        B obj= new B();
        int r = obj.add(3,6);
        System.out.println(r);

    }
}
