import java.util.Scanner;
class gap2
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a sentence: ");
    String s=sc.nextLine().trim();
    String ns[]=s.split(" ");
    for(int i=0; i<ns.length; i++)
    System.out.print(ns[i]+" ");
    }
}