package core;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.io.PrintWriter;

public class Main
	{
		public static void main(String[] args) throws IOException
			{

				String[] arg = { "D:\\Downloads\\testvalue13\\data_train.txt", "D:\\Downloads\\testvalue13\\model_r.txt"
						// "D:\\Documents\\JavaWorkSpace\\trainfile\\traindata.txt",
						// "D:\\Documents\\JavaWorkSpace\\trainfile\\model_r.copy.txt"
				};
				String[] parg = { "D:\\Downloads\\testvalue13\\data_test.txt",
						"D:\\Downloads\\testvalue13\\model_r.txt", "D:\\Downloads\\testvalue13\\out_r.txt"

						// "D:\\Documents\\JavaWorkSpace\\trainfile\\testdata.txt",
						// "D:\\Documents\\JavaWorkSpace\\trainfile\\model_r.copy.txt",
						// "D:\\Documents\\JavaWorkSpace\\trainfile\\out_r.cuixiaolan.txt"
				};
				System.out.println("........SVM..........");
				svm_train t = new svm_train();
				svm_predict p = new svm_predict();
				t.main(arg);
				p.main(parg);
				System.out.println("........SVM..........");
				//
				// //txt clean//
				//
				//
				//// File filetemp = new
				// File("D:\\Downloads\\testvalue13\\data_train.txt");
				//// File temp = File.createTempFile("filetemp", ".txt",
				// filetemp.getParentFile());
				//// String charset = "UTF-8";
				//// String delete = "\t";
				//// BufferedReader reader = new BufferedReader(new
				// InputStreamReader(new FileInputStream(filetemp), charset));
				//// PrintWriter writer = new PrintWriter(new
				// OutputStreamWriter(new FileOutputStream(temp),charset));
				//// for(String line; (line = reader.readLine())!=null;)
				//// {
				//// line=line.replaceAll(delete, " ");
				//// line.trim();
				//// writer.println(line);
				//// };
				//// reader.close();
				//// writer.close();
				//// temp.renameTo(filetemp);
			}
	}

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
