class Human
{
    private int age=14;
    private String name= "Leela";

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}


class demo
{
    public static void main( String args[])
    {
        Human h1= new Human();
        System.out.println(h1.getName() + ":" + h1.getAge());
    }
}
