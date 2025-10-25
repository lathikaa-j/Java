import java.io.InputStreamReader;
import java.io.IOException;
class Practice
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseint(bf.readline());
        System.out.println(num);
        bf.close();
    }

}
