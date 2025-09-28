enum Laptop
{
    Macbook(85000)  , Dell(75000) , HP(70000) , ASUS(80000);

    private int price;
    private Laptop(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price= price;
    }

}


class Practice
{
    public static void main(String args[])
    {
        
        for ( Laptop lap: Laptop.values())
        {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
