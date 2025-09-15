interface A
{   
    int roll_no =16;        // variables are static and final
    String str= "It's Lathikaa";
    void show();
    void config();

}
class B implements A
{
    public void show()
    {
        System.out.println("In Show");
    }

     public void config()
    {
        System.out.println("In Config");
    }
}


class Practice
{
    public static void main(String args[])
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.roll_no + " " + A.str );
    }
}
