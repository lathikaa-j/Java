interface Computer
{
    void code();
}

class Developer
{
    public void code()
    {
        System.out.println("coding...");
    }
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("compile , run..");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("compile , run , faster..");
    }
}
class Practice
{
    public static void main(String args[])
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        lap.code();
    }
}
