class Practice
{
    public static void main(String args[])
    {
        int i=9;
        int j=4;


        try
        {   
            j=j/i;
            if(j==0 )
             throw new ArithmeticException("Try another value");
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic error , cannot be divided by 0" + e);
        }
        
        catch(Exception e)
        {
            System.out.println("Something went wrong " + e);
        }
        
        System.out.println("Bye");
    }
}
