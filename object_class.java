class Laptop
{
    int price;
    String model;

    public String toString()
    {
        return model + ":" + price;
    }

    public boolean equals(Laptop that)
    {
        return this.model.equals(that.model) & this.price == that.price;
    }
}

class Practice
{
    public static void main(String args[])
    {
       Laptop obj= new Laptop();
       obj.price= 100000;
       obj.model= "Dell";

       Laptop obj1= new Laptop();
       obj1.price= 100000;
       obj1.model= "Dell";

       boolean r= obj.equals(obj1);
       System.out.println(obj.toString());
       System.out.println(r);


    }
        
}
