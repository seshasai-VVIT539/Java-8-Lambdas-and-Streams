import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class StringPalindrome
{
	public static boolean isPalindrome(String input)
	{
		return input.equalsIgnoreCase(new StringBuilder().append(input).reverse().toString());
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<String> strings = new ArrayList<String>();
		List<String> result;
		Predicate<String> predicate=StringPalindrome::isPalindrome;
		int noOfStrings;
		
		System.out.print("Enter no of strings : ");
		noOfStrings = sc.nextInt();
		
		System.out.println("Enter strings");
		for(int iter=1;iter<=noOfStrings;iter++)
		{
			strings.add(sc.next());
		}
		
		result=strings.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(result);
	}
}