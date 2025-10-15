class Practice
{
    public static void main(String args[])
    {
        int i=1;
        int j=4;
        int array[] = new int [5];
        String s= null;

        try
        {   
            System.out.println(s.length());
            System.out.println(j/i);
            System.out.println(array[5]);
            
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic error , cannot be divided by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Cannot access index out of the boundary");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong " + e);
        }


        
        System.out.println("Bye");
    }
}
