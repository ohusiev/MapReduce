/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textfieleintegers;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Oleksandr
 */
public class Map {
    private ArrayList<String> arrList = new ArrayList<String>();
    public void map(){
     try{
        FileReader reader=new FileReader("D:\\workshop.txt");
        Scanner s =new Scanner(reader);
        while (s.hasNextLine()){
            String line = s.nextLine();
            String[] words=line.split("\\s");
            for(int i =0;i<words.length;i++){
                String word = words[i];
                if (! word.isEmpty()){
                    //if statement as simple option to introduce additional condition to save a link
                    //if(!word.contains("http:")){
                    //replaceAll("\\p{Punct}",""); //emty counted in FileWriter output
                    word = word.replaceAll("[',','.','!','?', ')','(','\','\"']","");
                    //}
                    //word = word.replace(","");
                    //word = word.replace(",","");
                    arrList.add(word);
                }
            }
        }reader.close();   
    }catch(IOException e){
         System.out.println("Some error occured!");
        }
     //Collections.sort(getList()); //sort in alphabetical order
    }
    public ArrayList<String> getList(){
        return arrList;
    }
}
