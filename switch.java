Way 1-
class demo
{
    public static void main(String args[])
    {
        String n = "f";
        switch(n)
        {
            case "a","e","i","o","u" -> System.out.print("vowel");
            default -> System.out.print("consonant");
        }
    }
}


Way 2-
  class demo
{
    public static void main(String args[])
    {
        String n = "f";
        String result = "";
        result = switch(n)
        {
            case "a","e","i","o","u" : yield "vowel";
            default : yield "consonant";
        };
        System.out.print(result);
    }
}
