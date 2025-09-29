interface A
{
    int add(int i, int j);
}

class Practice
{
    public static void main(String args[])
    {
        A obj= (i,j) -> i+j;
        int result = obj.add(16,8);
        System.out.println(result);
    }
}
