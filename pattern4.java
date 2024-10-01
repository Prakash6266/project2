class pattern4
{
	public static void main(String ar[])
	{
	int n=4;	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((i+j)%n+1);
			}
			System.out.println();
		}
	}
}