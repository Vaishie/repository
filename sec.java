import java.util.Scanner;
class sec
{
    public static void main(String[] args) 
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a new string");
        String s=ob.nextLine();
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++)
        { char ch=s.charAt(i);
             if(ch>=65 && ch<=90) c1++;
             if(ch>=97 && ch<=122) c2++;
        }
        if(c1>0 && c2==0)  System.out.println("U");
        if(c2>0 && c1==0)  System.out.println("L");
        if(c1>0 && c2>0)  System.out.println("T");
    }
}