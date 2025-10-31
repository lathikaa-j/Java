import java.util.*;
import java.util.stream.*;
class Practice
{
    public static void main(String args[])
    {
        List<Integer> nums = Arrays.asList(1,3,4,8,5,6);
        Stream<Integer> sortedValues = nums.stream()
                                           .filter(n-> n%2==0)
                                           .sorted();
       sortedValues.forEach(n-> System.out.println(n));
    }
}
