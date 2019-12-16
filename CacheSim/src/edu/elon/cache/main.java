package edu.elon.cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	
	public static int b;
	public static int a;
	public static int S;
	public static int B;
	public static int s;
	public static int E;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<args.length;i++) {
			System.out.printf("args[%d] = %s\n", i, args[i]);
			
			//declare s,e,b,S,B
			s = Integer.parseInt(args[2]);
			E = Integer.parseInt(args[3]);
			b = Integer.parseInt(args[4]);
			S = (int) Math.pow(2,s);
			B = (int) Math.pow(2, b);
			
		}
		System.out.printf("S = %d\n", S);
		
		//create S number of CacheSet objects
		int size = 0;
		for(int i = 0; i <S; i++) {
			size++;
		}
		CacheSet [] csArray = new CacheSet[size];
		System.out.printf("size %d\n", size);
		//
		
		//read trace file
		File file = new File(args[5]);
		 try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				//String [] parts = line.split(",")
				System.out.printf("line %s", line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	
	}
	
	
}