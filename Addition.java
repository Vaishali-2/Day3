/*write a program which accepts two numbers and print addition between that numbers.
INPUT: 10 3
OUTPUT: 13*/

import java.io.*;
class Addition
{
void addition(int a,int b)
{
System.out.println("Addition is:"+(a+b));
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	Addition e=new Addition();
	e.addition(a,b);
	}
}