import java.util.*;
class arr{
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("array size: ");
    int l=sc.nextInt();
    int arr[]=new int[l];
    System.out.println("array elements: ");
    for(int i=0; i<l; i++)
        arr[i]=sc.nextInt();
    System.out.print("sum: ");
    int s=sc.nextInt();
    int start=0, sum,t=0, end=0;
    for (int i=0; i<l; i++)
    {
        start=i;
        sum=0;
        for(int j=i; j<l; j++)
        {
            sum+=arr[j];
            if(sum==s)
            {
                end=j;
                t++;
                //System.out.println("%d %d\n", start , end);
                break;
            }
        }if(t==1)
            break;
    } System.out.println(start +" "+ end);
}
}