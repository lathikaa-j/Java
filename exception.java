class Practice
{
    public static void main(String args[])
    {
        int i=0;
        int j=4;

        try
        {
            System.out.println(j/i);
        }

        catch(Exception e)
        {
            System.out.println("Arithmetic error , cannot be divided by 0");
        }
        
        System.out.println("Bye");
    }
}
