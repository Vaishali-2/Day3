//write a program which accept marks from user and calculate percentage.
//INPUT:745
//OUTPUT:74.5%

import java.io.*;
class Percentage
{
void percentage(float a,float b)
{
float per=((a/b)*100);
System.out.println(per+"%");
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your marks");
	int a=Integer.parseInt(br.readLine());
	System.out.println("Enter total marks");
	int b=Integer.parseInt(br.readLine());
	Percentage e=new Percentage();
        e.percentage(a,b);
	}
}
