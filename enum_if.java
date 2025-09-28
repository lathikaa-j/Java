enum Status
{
    Running, Pending , Success , Failed;
}


class Practice
{
    public static void main(String args[])
    {
        Status s= Status.Success;
        if(s== Status.Running)
        {
            System.out.println("All good");
        }
        else if(s== Status.Pending)
        {
            System.out.println("Please wait");
        }
        else if(s== Status.Success)
        {
            System.out.println("Completed");
        }
       else
        {
            System.out.println("Try again");
        }
    }
}
