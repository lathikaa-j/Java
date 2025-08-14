class stationary
{
    int pen;
    static String type;
    String colour;

    public void show()
    {
        System.out.println(pen + " : " + type + " : " + colour);
    }
   
    
}


class demo
{
    public static void main(String args[])
    {
        stationary o1 = new stationary();
        o1.pen = 3;
        stationary.type = "gel";
        o1.colour = "blue";

        stationary o2 = new stationary();
        o2.pen = 14;
        stationary.type = "ball";
        o2.colour = "red";

        stationary.type = "ink";
        o1.show();
        o2.show();

    }
    
}
