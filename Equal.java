/*writ program that accepts two numbers and checks whether they are equal or not 
input 10 10
output equal*/

import java.io.*;
class Equal
{
int equal(int a,int b)
{
if(a==b)
return 1;
else 
return 0;
}
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	Equal e=new Equal();
	int ans=e.equal(a,b);
	if(ans==1)
	System.out.println("Equal");
	else
	System.out.println("Not Equal");
	}
}