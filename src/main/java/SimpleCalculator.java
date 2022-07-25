
public class SimpleCalculator {
	
	public int add(int first, int second)  {
		return first + second;
	}

	public int subtract(int first, int second)  {
		return first - second;
	}
	
	public int multiply(int first, int second)  {
		return first * second;
	}
	
	public int divide(int first, int second)  {
		int answer = 0;
		
		if(second !=0)  {
		answer = first / second;
		}
		return answer;
	}
	
	public int exponent(int first, int second)  {
		return (int) Math.pow(first, second);
	}
}
