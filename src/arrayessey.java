import java.util.Arrays;

public class  arrayessey {
    public static void main(String[] args)
    {
        int essey[]=new int[10];
        for (int i=0;i< essey.length;i++)
        {

            essey[i]=10-i;

        }
        System.out.println(Arrays.toString(essey));
    }
}
