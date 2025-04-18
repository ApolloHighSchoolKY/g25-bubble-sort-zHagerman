import java.util.Arrays;
public class BubbleSort
{

  public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
	int passes = myNums.length-1;
	int comparisons;
	int tempNum;
	int x;
	int y;
	

		//Loop once for each pass, where passes is one less than the number of items.
		while(passes > 1)
		{
		
		for(int i = 0; i < myNums.length-1; i++)
		{
			x = myNums[i];
			y = myNums[i+1];
			if(myNums[i] > myNums[i+1])
			{
				tempNum = y;
				myNums[i+1] = x;
				myNums[i] = tempNum;
			}
			else
			{
				tempNum = x;
				
			}
			
		}
		passes--;
		}
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				//If they are out of order, swap the values
			//End Loop for comparisons
    
			//The next pass will use one less comparison
    
		//End Loop for passes
		System.out.println(Arrays.toString(myNums));


  }
}
