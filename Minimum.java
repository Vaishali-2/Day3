//write a program which accept two numbers and prints minimum number.
//INPUT: 12 14
//OUTPUT: 12

import java.io.*;
class Minimum
{
void minimum(int a,int b)
{
	if(a<b)
	System.out.println("Min is:"+a);
	//else
	//System.out.println("Min is:"+a);
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	Minimum e=new Minimum();
	e.minimum(a,b);
	}
}