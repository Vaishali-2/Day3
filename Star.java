//write a program that prints * five times
//OUTPUT: * * * * *

import java.io.*;
class Star
{
void star(int a)
{
	for(int i=1;i<=a;i++)
	 System.out.print("*"+"\t");
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	Star e=new Star();
	e.star(a);
	}
}