/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textfieleintegers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Oleksandr
 */
public class Reduce {
    private Hashtable<String, Integer> hash =new Hashtable<String, Integer>(); 
    public static void main(String[] args){
        Map mapper = new Map();
        Reduce reducer = new Reduce();
        mapper.map();
        reducer.reduce(mapper.getList());
    }
    public void reduce(ArrayList<String> arr){
        for(int i = 0;i<arr.size();i++){
            String word = arr.get(i);
            if (hash.containsKey(word)){
                int a = hash.get(word);
                a++; 
                hash.put(word, a);
            }else{
                hash.put(word,1);
            }
        }
        //FILE WHICH CONTAINS TOCKEN AND COUNT
        try{
        FileWriter writer = new FileWriter("D:\\MapReduceOutput.txt");
        //or
        //BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\workshopTockenCount.txt"));
        Iterator<String> hashIter = hash.keySet().iterator();
        while (hashIter.hasNext()){
            String key = hashIter.next();
            String tockenCount= key + " : "+ hash.get(key)+"\n";
            writer.write(tockenCount);
            //writer.newLine();
            }
        writer.close();
        }catch (IOException e){
            System.out.println("Error occured");
        }
    }
    public Hashtable<String, Integer> getHash(){
        return hash;
    }
}
