import java.util.*;
class sum_index
{ public static void main(String [] args)
  { Scanner sc=new Scanner(System.in);
    System.out.print("Enter no. of elements : "); 
    int l1=sc.nextInt();
    int a[]=new int[l1];
    int l=a.length;
    System.out.println("Enter elements"); 
    for(int i=0;i<l;i++)
    { a[i]=sc.nextInt();
    }
    System.out.println("Enter sum : ");
    int s=sc.nextInt();
    int start=0, sum, end=0, t=0;
    for(int i=0;i<l;i++)
    { start=i; sum=0;
      for(int j=i;j<l;j++)
      { sum+=a[j];
        if(sum==s)
        { end=j; t++;
          //System.out.println(start+""+end);
          break;
        }
      }
      if(t==1)  break;
    }
    System.out.println((start+1) +" "+ (end+1));
}
}