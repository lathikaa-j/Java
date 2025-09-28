interface A
{
    void show(int i);
}

class Practice
{
    public static void main(String args[])
    {
        A obj= (i) -> System.out.println("In Show " +  i);
        
        obj.show(13);
    }
}
