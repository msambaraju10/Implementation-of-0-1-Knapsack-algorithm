import java.util.*;
public class Test
{
public static void main(String argv[])
{
 try
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("\nEnter Weights :");
   String ws=sc.nextLine();
   System.out.print("\nEnter Values:");
   String vs=sc.nextLine();
   System.out.print("\nBag Capacity :");
   int wt=sc.nextInt();
   String sw[]=ws.split(",");
   String sv[]=vs.split(",");
   int w[]=new int[sw.length+1];
   int v[]=new int[sv.length+1];
   int i;
   for(i=1;i<sw.length;i++)
   {
    w[i]=Integer.parseInt(sw[i]);
    v[i]=Integer.parseInt(sv[i]);
   }
   int n=sw.length;
   Knapsack ks = new Knapsack();
   ArrayList<Integer> al= ks.solve(w, v, wt, n);
   String s="";
   int outputvalue=0;
   for(Integer index:al)
   {
    s+=(index+1)+", ";
    outputvalue+=v[index];
   }
    System.out.print("\nItems Selected :"+s);
    System.out.print("\nValue :"+outputvalue);
   }
   catch(Exception ee)
   {
    System.out.print("\nError :"+ee);
   }
 }
}