enum Status
{
    Running, Pending , Success , Failed;
}


class Practice
{
    public static void main(String args[])
    {
        Status s= Status.Pending;
        switch(s)
        {
            case Running :
                System.out.println("All good");
                break;
            case Pending :
                System.out.println("Please wait");
                break;
            case Failed :
                System.out.println("Try again");
                break;
            default :
                System.out.println("Completed");
                break;
                
        }
    }
}
