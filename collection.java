import java.util.*;
import java.util.ArrayList;
class Practice
{
    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(9);
        nums.add(0);
        nums.add(4);
        System.out.println(nums);

        for(int n: nums)
        {
            System.out.println(n);
        }

        System.out.println(nums.get(2));
    }
}
