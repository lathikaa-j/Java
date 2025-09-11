class A
{   public void show()
    {
        System.out.println("In class A");
    }


    class B
    {
        public void show1()
      {
        System.out.println("In class B");
      }
    }

    static class C
    {
        public void show2()
      {
        System.out.println("In class C");
      }
    }
}



class Practice
{   
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();

        A.B obj1= obj.new B();
        obj1.show1();

        A.C obj2 = new A.C();
        obj2.show2();
    }
    
}
