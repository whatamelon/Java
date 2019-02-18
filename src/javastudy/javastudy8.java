package javastudy;

public class javastudy8 {

public static void main(String[] args)
{
	int[] numberA = {1,2,3,4,5,6,7,8,9,10};
	int[] numberB = numberA;
	
    for (int i = 0; i < numberA.length; i++)
    {             numberA[i] = 100; 
	
    }
	for (int i = 0; i < numberA.length; i++)
	{
		System.out.println(numberA[i]);
	}
	
	System.out.println("******************");
	
	for (int i = 0; i < numberB.length; i++)
	{
		System.out.println(numberB[i]);
	}
}
}