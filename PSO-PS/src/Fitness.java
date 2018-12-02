
public class Fitness
	{
		// this is the problem to be solved
		// to find an x and a y that minimize the function below:
		// f(x, y) = (2.8125 - x + x * y^4)^2 + (2.25 - x + x * y^2)^2 + (1.5 -
		// x + x*y)^2
		// where 1 <= x <= 4, and -1 <= y <= 1

		// you can modify the function depends on your needs
		// if your problem space is greater than 2-dimensional space
		// you need to introduce a new variable (other than x and y)
		public double result;

		public double evaluate(double d1, double d2)
			{
				result = Math.pow(2.8125 - d1 + d1 * Math.pow(d2, 4), 2)
						+ Math.pow(2.25 - d1 + d1 * Math.pow(d2, 2), 2) + Math.pow(1.5 - d1 + d1 * d2, 2);
				
				return result;

			}
		//
	}
