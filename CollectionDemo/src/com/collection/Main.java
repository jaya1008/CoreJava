package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        int count=0,sum=0,average=0;
        ArrayList<Integer> Acount = new ArrayList<Integer>();
        try {
                for(Integer num : array){
                    if(num % 2 != 0){              
                        count++;
                        }
                        else{
                            Acount.add(count);
                            count=0;
                        }    
                }
            }catch(Exception e){System.out.println(e);}     
        Acount.add(count);
        for(int i = 0; i < Acount.size(); i++)
            sum+= Acount.get(i);
        
        average=sum/Acount.size();
        return average;
    }
    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}