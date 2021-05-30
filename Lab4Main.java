//Lab4
public class Lab4Main
{
	public static void main(String[] args)
	{
		task1 thread = new task1();
		try
		{
			thread.sleep(1000);
			thread.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

