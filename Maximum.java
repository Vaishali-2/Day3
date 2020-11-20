
//write a program which accept two numbers and prints maximum number.
//INPUT: 12 14
//OUTPUT: 14

import java.io.*;
class Maximum
{
void maximum(int a,int b)
{
	if(a>b)
	System.out.println("Max is:"+a);
	//else
	//System.out.println("Min is:"+a);
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	Maximum e=new Maximum();
	e.maximum(a,b);
	}
}