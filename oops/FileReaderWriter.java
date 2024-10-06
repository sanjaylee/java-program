package oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("----------------------file write using FileWriter class ----------------------------");
		try {
		FileWriter fw=new FileWriter("F:\\sa\\sanjay.txt");
		fw.write("sanjay ana arthi 1ln");			
	     fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("success");
		
		
		System.out.println("----------------------file write using BufferedWriter class ----------------------------");
	try {
		     BufferedWriter reader=new BufferedWriter(new FileWriter("F:\\sa\\sanj.txt"));
			reader.write("sanjay love with arthi but she is love another boy or not love him");
		reader.write("sanjay arthi ");
	     reader.write("love you ");
			reader.close();	
		}catch(Exception e) {
			System.out.println(e);
		}
System.out.println("success");
		
	System.out.println("----------------------file write using Scanner class ----------------------------");

		try {
			File file=new File("F:\\sa\\sanjay.txt");
			Scanner sa=new Scanner(file);
			while(sa.hasNextLine()) {
				System.out.println(sa.nextLine());
			}
			sa.close();
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		
System.out.println("----------------------file reader using FileReader class ----------------------------");
		try {
		FileReader re=new FileReader("F:\\sa\\sanjay.txt");
		   int charco = 0;
		int i;
		while((i=re.read())!=-1) {
			System.out.print((char)i);
			charco++;
		}
		System.out.println(charco);
		re.close();
		}catch(Exception e) {
			System.err.println(e);
		}
		

		System.out.println("----------------------file reader using BufferedReader class ----------------------------");
		try {
			BufferedReader br=new BufferedReader(new FileReader("F:\\sa\\sanj.txt"));
			int r;
			while((r=br.read())!=-1) {
				System.out.print((char)r);
			}
			br.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("----------------------file reader using Scanner class ----------------------------");
		try {
			File fil=new File("F:\\sa\\sanjay.txt");
			Scanner saa=new Scanner(fil);
			while(saa.hasNextLine()) {
				String data=saa.nextLine();
				System.out.println(data);
			}
			saa.close();
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
