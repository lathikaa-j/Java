class demo
{
    public static void main(String args[])
    {
        int nums[][] = new int[3][];
        nums[0]= new int[4];
        nums[1]= new int[1];
        nums[2]= new int[3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                 nums[i][j]= (int) (Math.random() * 10);
            }
        }

        for(int n[]: nums)
        {
            for(int m: n)
            {
                 System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
