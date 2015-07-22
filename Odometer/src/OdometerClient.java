import java.util.ArrayList;
import java.util.Scanner;

class Odometer
{
	
	private ArrayList<Integer> valueList = new ArrayList<Integer>();
	private static int NUM_LENGTH;
	private static int INIT_VALUE;
	
	public Odometer(String inputValue) {
		NUM_LENGTH = inputValue.length();
		INIT_VALUE = findInitialValue(NUM_LENGTH);
	}

	public static int findInitialValue(int length)
	{
		int init = 0;
		int count = 1;
		for(int i = length-1; i>=0; i--)
		{
			init += Math.pow(10, i) * (count++);
		}
		return init;
	}

	public void printInitialValue()
	{
		System.out.println(INIT_VALUE);
	}

	public static int getIncrement(String value)
	{
		
		
		return 0;
		
	}

}
public class OdometerClient
{	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		String inputValue = s.next();
		Odometer odometerObject = new Odometer(inputValue);
		odometerObject.printInitialValue();
	}
}
