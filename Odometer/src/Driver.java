import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
public static void main(String[] args){
	Odometer odometer=new Odometer();
	Scanner readerObject = new Scanner(System.in);
	String numberString = readerObject.next();
	ArrayList<Integer> listOfNumbers=odometer.findNumbers(numberString.length());
	//Iterator<Integer> iterator = listOfNumbers.iterator();
	//while(iterator.hasNext()){
	//	System.out.println(iterator.next());
	//}
	System.out.println(odometer.nextValue(new Integer(numberString)));
}
}