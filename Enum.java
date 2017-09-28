class A
{
	public enum Season
	{
	winter,summer,spring};
	
	public static void main(String args[])
	{
		for(Season S:Season.values())
		{
			System.out.println(S);
		}
	}
}