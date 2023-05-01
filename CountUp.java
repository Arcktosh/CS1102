//Below prints the number from 1-10 and a given phrase.

public class CountUp {   //to count up from 1 to 10 and shout out a word

	public static void main (String[] agrs)  { //missed the p for public

		//using while loop to count from 1-10

		int i=1;

		while (i<11)

		      {

		        System.out.println(i);

		                  i++;

		      }

		System.out.println("Yay, I know how to count!");



		//using for loop to count 1-10

		for (int j=1; j<11; j++ )

		{

		System.out.println(j);

		}

		System.out.println("Yay, I know how to count!");



		//using do...while loop to count from 1-10

		int x=1;

		do {

		System.out.println(x);

		x++;

		  } while (x<11);

		  

		System.out.println("Yay, I know how to count!");

		}

}
