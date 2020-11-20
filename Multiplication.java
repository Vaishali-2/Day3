/*write a program which accepts two numbers and print multiplication of that numbers.
INPUT: 10 3
OUTPUT: 30*/

import java.io.*;
class Multiplication
{
void multiplication(int a,int b)
{
System.out.println("Multiplication is:"+(a*b));
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	Multiplication e=new Multiplication();
	e.multiplication(a,b);
	}
}