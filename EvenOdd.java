/*write a program that accepts one number from the user and checks that number is EVEN or ODD.
INPUTL: 101
OUTPUT: ODD*/

import java.io.*;
class EvenOdd
{
int evenOdd(int a)
{
if(a%2==0)
return 1;
else 
return 0;
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	EvenOdd e=new EvenOdd();
	int ans=e.evenOdd(a);
	if(ans==1)
	System.out.println("EVEN");
	else
	System.out.println("ODD");
	}
}