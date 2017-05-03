import java.util.Arrays;
import java.util.Scanner;
public class HCF {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter number of elements");
int n=s.nextInt();
int[] a=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
Arrays.sort(a);
int c=0;
for(int i=a[n-1];i>=1;i--)
{
	for(int j=0;j<n;j++)
	{
		if(a[j]%i==0)
		{
			c++;
		}
	}
	if(c==n)
	{
		System.out.println("Highest common factor is "+i);
		break;
	}
	else
	{
		c=0;
	}
}
	}

}
