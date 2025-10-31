import java.util.*;
import java.util.stream.*;
class Practice
{
    public static void main(String args[])
    {
        List<Integer> nums = Arrays.asList(1,3,4,8,5,6);
        int result = nums.stream()
                         .filter(n-> n%2==0)
                         .map(n-> n*3)
                         .reduce(0,(c,e)-> c+e);
        System.out.println(result);
    }
}
