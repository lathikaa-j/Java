abstract class Computer
{
    public abstract void  OS();
    
    public void watchVids()
    {
        System.out.println("I am watching lectures ");
    }

}

class Laptop extends Computer
{
    public void OS()
    {
        System.out.println("In OS ");
    }

    public void playMusic()
    {
        System.out.println("Playing music.. ");
    }

}

class Practice
{
    public static void main(String args[])
    {
        Laptop obj = new Laptop();
        obj.watchVids();
        obj.playMusic();
        obj.watchVids();
        obj.OS();
    }
}
