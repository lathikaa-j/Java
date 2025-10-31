import java.util.*;
class Practice
{
    public static void main(String args[])
    {
        Comparator<Integer> com = (i,j) -> i%10>j%10?1:-1;
        List<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(94);
        nums.add(01);
        nums.add(47);
        Collections.sort(nums,com);
        System.out.println(nums); 
    }
}
