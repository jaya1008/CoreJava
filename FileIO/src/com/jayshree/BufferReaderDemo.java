package com.jayshree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=======================================");
        System.out.println("You can use BufferedReader to read a file");
        System.out.println("=======================================");
        FileReader fileReader;
        FileWriter fileWriter;
        BufferedWriter bwriter;
        try {
            fileReader = new FileReader("E:\\Demo\\HelloWorld.java");
            BufferedReader buffReader = new BufferedReader(fileReader);
            
            fileWriter =new FileWriter("fileCopy.txt");
            bwriter =new BufferedWriter(fileWriter);

         //   System.out.println("File contains following lines");
            String line = buffReader.readLine();

            while (line != null) {
               // System.out.println(line);
            	bwriter.write(line);
                line = buffReader.readLine();
            }

            buffReader.close();
            fileReader.close();

            bwriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
