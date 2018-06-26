package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		FileReader frr;
		try {
			frr = new FileReader("menu.txt");
			BufferedReader brr = new BufferedReader(frr);
			String line,ts;
			String[] tA = new String[4];
			ArrayList z = new ArrayList();
			int i = 0;
			while((line = brr.readLine())!= null){
				ts = line;
				tA = ts.split(",");
				for(i=0;i< tA.length; i++)
	            {          
	               z.add(tA[i]);
	            }
			}
			int k = z.size()/4;
			int count = 0;
			String[][]trans = new String [k][4];
			for(int x=0; x<7; x++)
	        {
	            for(int y=0; y<4; y++)
	            {
	                trans[x][y]=(String) z.get(count);
	                count++;
	            }
	        }
			
			for(int u = 0; u < 7; u++){
				String a = "";
				
					a =  trans[u][0];
					String v =  trans[u][1];
					
				
				
				System.out.println(a+")" + v);
			}
			System.out.println("0)" + "結算");
			System.out.println("q)" + "離開(結束程式)");
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=====================");
			}
}
