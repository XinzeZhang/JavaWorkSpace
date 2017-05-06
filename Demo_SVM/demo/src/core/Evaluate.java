package core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Evaluate
	{
		public static void main(String[] args) throws FileNotFoundException, IOException
			{
				// TODO code application logic here
				FileInputStream fis_x = new FileInputStream("D:\\Downloads\\testvalue13\\lable.txt");
				Scanner scanner_x = new Scanner(fis_x);
				FileInputStream fis_y = new FileInputStream("D:\\Downloads\\testvalue13\\out_r.txt");
				Scanner scanner_y = new Scanner(fis_y);
				double TP = 0;
				double TN = 0;
				double FP = 0;
				double FN = 0;
				while (scanner_x.hasNext() && scanner_y.hasNext())
					{
						double x1 = scanner_x.nextDouble();
						double y1 = scanner_y.nextDouble();

						/*
						 * String[] tempArray_x =new String[] {""}; tempArray_x
						 * = scanner_x.nextLine().trim().split(" ");
						 * //System.out.println("set_x: "+Arrays.toString(
						 * tempArray_x));
						 * 
						 * String[] tempArray_y = new String[] {""}; tempArray_y
						 * = scanner_y.nextLine().trim().split(" ");
						 * //System.out.println("set_y: "+Arrays.toString(
						 * tempArray_y));
						 * 
						 * String x=""; String y=""; double t=0; for (int i=0;
						 * i<tempArray_x.length; i++) { x=tempArray_x[i]; } int
						 * x1=Integer.parseInt(x);
						 * //System.out.print("x:"+x+"\r\n"); for (int j=0;
						 * j<tempArray_y.length; j++) { y=tempArray_y[j];} int
						 * y1=Integer.parseInt(y);
						 */
						// System.out.print("y:"+y+"\r\n");

						// if(x1==1)TP=TP+1;
						// if(x.equals(y))TP=TP+1;
						if ((x1 == y1) && (x1 == 1))
							TP = TP + 1;
						if ((x1 == y1) && (x1 == -1))
							TN = TN + 1;
						if ((x1 == -1) && (y1 == 1))
							{
								FP = FP + 1;
								// System.out.print("(x1==0)&&(y1==1)"+FP+"\r\n");
							}
						if ((x1 == 1) && (y1 == -1))
							FN = FN + 1;

					}
				System.out.print("TP:" + TP + "\r\n");
				System.out.print("TN:" + TN + "\r\n");
				System.out.print("FP:" + FP + "\r\n");
				System.out.print("FN:" + FN + "\r\n");
				double A0 = (TP + TN) / 238;
				double P0 = TP / (TP + FP);
				double R0 = TP / (TP + FN);
				double F0 = 2 * P0 * R0 / (P0 + R0);
				System.out.print("准确率A0=" + A0);
				System.out.print("\r\n");
				System.out.print("精确率P0=" + P0);
				System.out.print("\r\n");
				System.out.print("召回率R0=" + R0);
				System.out.print("\r\n");
				System.out.print("F0=" + F0);
				System.out.print("\r\n");

				scanner_x.close();
				scanner_y.close();
			}
	}
