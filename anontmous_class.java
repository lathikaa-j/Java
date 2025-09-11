class A
{   public void show()
    {
        System.out.println("In class A");
    }
}



class Practice
{   
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In new class ");
            }
        };
        obj.show();
        
    }
    
}
