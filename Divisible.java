//write a program which accepts two numbers and check whether 1st number is divisible by 2nd number or not.
//INPUT: 40 4
//OUTPUT:DIVISIBLE

import java.io.*;
class Divisible
{
void divisible(int a,int b)
{
	if(a%b==0)
	System.out.println("DIVISIBLE");
	//else
	//System.out.println("Min is:"+a);
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	Divisible e=new Divisible();
	e.divisible(a,b);
	}
}