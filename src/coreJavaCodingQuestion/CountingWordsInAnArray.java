package coreJavaCodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingWordsInAnArray {
    public static void main(String[] args) {
        
        List<String> words= Arrays.asList("i","have","a","sentence","with","technical","words"); 
        
        //this is an important topic so dont forget that  
        System.out.println( words.stream().collect(Collectors.groupingBy(String::length)));
        
        
        
        
        
        
        //secound approach is doing the same but this tym we will use an hashmap  
        
        
        
        Map<Integer ,List<String>> map =  new HashMap<Integer, List<String>>() ; 
        
        for (String word : words) {
        	int length = word.length() ; 
        	List<String> list =  map.getOrDefault(length, new ArrayList<>()) ; 
        	
        	list.add(word) ; 
        	map.put(length,list) ; 
        	
        	
        	
        	
        }
        
        System.out.println(map);
        
        
        
       
        
       }
}