
import java.util.Random;

public class PSO
	{
		Fitness fitness = new Fitness();

		public Random random;
		public double random_v;

		public int num; // number of particles
		public double c1; // cognitive coefficient
		public double c2; // social cognition coefficient
		public double w; // inertia weight
		public int iter; // iteration times
		public int dim; // dimension of one particle

		public double[][] position = new double[num][dim];
		public double[][] speed = new double[num][dim];

		double rand(double low, double uper)
			{
				random = new Random();
				random_v = random.nextDouble() * (uper - low) + low;
				return random_v;
			}

			{
				for (int i = 0; i < num; i++)
					{
						for (int j = 0; j < dim; j++)
							{
								position[i][j] = random.nextDouble();
							}

					}
			}
			{
				for (int i = 0; i < num; i++)
					{
						for (int j = 0; j < dim; j++)
							{
								speed[i][j] = random.nextDouble();
							}

					}
			}

	}
