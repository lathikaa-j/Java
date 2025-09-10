
class Practice
{
    public static void main(String args[])
    {
        int a= 9;
        Integer num = a; // autoboxing

        int b= num.intValue(); // unboxing
        System.out.println(num);

        String s= "4";
        int num1 = Integer.parseInt(s); // converts string to integer
        System.out.println(num1*2);
    }

}
