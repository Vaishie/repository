//"  Hey there !! I   am                    insane, are  you  ? "
//"Hey there!! I am insane, are you?"
import java.util.Scanner;
class gap
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a sentence: ");
    String s=sc.nextLine().trim();
    String ns="";
    int l=s.length();
    for(int i=0; i<l; i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            ns+=ch;
            else
            {
                ns+=" ";
                while((i+1)<l && s.charAt(i+1)==' ')
                 i++;
            }
        }
    String nns[]=ns.split(" ");
    for(int i=0; i<nns.length-1; i++)
        {
         char ch=nns[i].charAt(0);
         char ch2=nns[i+1].charAt(0);
            if(Character.isLetter(ch))
                if(ch2=='?' || ch2=='!' || ch2=='.' || ch2==',' || ch2==':' || ch2==';')
                 System.out.print(nns[i]+nns[i+1]+" ");
             else
                  System.out.print(nns[i]+" ");
        }
    }
}