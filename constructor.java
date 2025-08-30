class Human
{
    private int age;
    private String name;

    public Human()
    {
        age = 18;
        name = "charan";
    }

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
        Human h2= new Human();

        System.out.println(h1.getName() + ":" + h1.getAge());
    }
}
