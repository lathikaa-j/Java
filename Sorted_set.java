import java.util.*;
class Practice
{
    public static void main(String args[])
    {
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(76);
        nums.add(60);
        nums.add(13);
        nums.add(60);
        nums.add(34);
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());
    }
}
