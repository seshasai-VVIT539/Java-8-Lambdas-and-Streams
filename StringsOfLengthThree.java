import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;
public class StringsOfLengthThree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int noOfStrings,iter;
		List<String> strings=new ArrayList<String>();
		List<String> result;
		
		System.out.print("Enter no of strings : ");
		noOfStrings=sc.nextInt();
		
		System.out.println("Enter strings");
		for(iter=1;iter<=noOfStrings;iter++)
		{
			strings.add(sc.next());
		}
		
		result=getStringsOfLengthThree(strings);
		
		System.out.println(result);
	}
	public static List<String> getStringsOfLengthThree(List<String> strings)
	{
		Predicate<String> predicate = (str)->str.length()==3&&str.startsWith("a");
		List<String> result;
		result=strings.stream().filter(predicate).collect(Collectors.toList());
		return result;
	}
}