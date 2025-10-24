class A 
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("developer");
    }
}



class Practice
{
    public static void main(String args[])
    {
        A obj = new A();
        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("No class is found " + e);
        }
        
    }
}
