import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AvgOfIntegers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int noOfIntegers,avgOfIntegers;
		ArrayList<Integer> integers=new ArrayList<Integer>();
		System.out.print("Enter number of elements:");
		noOfIntegers=sc.nextInt();
		System.out.println("Enter elements");
		for(int iter=1;iter<=noOfIntegers;iter++)
		{
			integers.add(sc.nextInt());
		}
		avgOfIntegers=avgOfListOfIntegers(integers,( a, b)->a+b);
		System.out.println("Average of given integers is : "+avgOfIntegers);
	}
	public static int avgOfListOfIntegers(ArrayList<Integer> integers,BiFunction<Integer,Integer,Integer> biFunction)
	{
		int sum=0,average;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		average=findDiv.apply(sum,integers.size());
		return average;
	}
}