package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write("C:/Users/Administrator/Desktop/reData.txt","hello");
	}

	private static void write(String path, String content) {
		// TODO Auto-generated method stub
		String s=new String();
		String s1=new String();
		
		try {
			File  f=new File(path);
			if(f.exists())
			{
				System.out.println("file exist!");
			}
			else
			{
				System.out.println("file not exist, creating....");
				if(f.createNewFile())
				{
					System.out.println("create file successfully!");
				}
				else
				{
					System.out.println("create file failed!");
				}
			}
			BufferedReader  input=new BufferedReader(new FileReader(f));
			while((s=input.readLine())!=null)
			{
				s1+=s+"/n";
			}
			System.out.println("file context:"+s1);
			input.close();
			s1+=content;
			BufferedWriter output=new BufferedWriter(new FileWriter(f));
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
