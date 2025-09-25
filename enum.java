enum Status
{
    Running, Pending , Success , Failed;
}


class Practice
{
    public static void main(String args[])
    {
        Status [] ss= Status.values();
        for (Status s: ss)
        {
             System.out.println(s);
        }
       
    }
}
