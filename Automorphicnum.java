import java.util.*;
class Automorphicnum
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
int n= sc.nextInt();
int r=0,temp;
temp=n*n;
while(temp!=0)
{
r=temp%100;
temp=0;
}
if(r==n)
System.out.println("Automorphic number");
else
System.out.println(" not Automorphic number");
}}