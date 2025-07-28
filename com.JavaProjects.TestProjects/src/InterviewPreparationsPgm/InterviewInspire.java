package InterviewPreparationsPgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
You are given coins of different denominations and a total amount of money amount.
Write a function to compute the fewest number of coins that you need to make up that amount.
If that amount of money cannot be made up by any combination of the coins, return -1.
Example 1:
Input: coins = [1, 2, 5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
 
Example 2:
Input: coins = [2], amount = 3
Output: -1
 
Note:
You may assume that you have an infinite number of each kind of coin.
**/
public class InterviewInspire
{
	ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(3,5));
	Integer amount = 14;
	

	 List<Integer> sortedCoinList = coinList.stream()
             .sorted(Comparator.reverseOrder()) // Sort in natural order
             .collect(Collectors.toList());
	 
	ArrayList<Integer> result = new ArrayList<Integer>();
	
	public void getListOfCoins()
	{
		Integer calcAmt = amount;
		for(Integer coinValue : sortedCoinList)
		{
			while (calcAmt >= coinValue)
			{
				if ((calcAmt - coinValue) >= 0)
				{
					calcAmt = calcAmt - coinValue;
					if (result == null || !result.contains(coinValue))
					{
						result.add(coinValue);
					}
				} else
				{
					break;
				}
			}
		}
		if(calcAmt != 0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(result);
		}
	}
}
