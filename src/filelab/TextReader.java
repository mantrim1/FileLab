/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filelab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mark
 */
public class TextReader {
    public static void main(String[] args) {
        
    
        File textFile = new File(File.separatorChar+"temp"+File.separatorChar+"lab1"+File.separatorChar+"myfile.txt");
        BufferedReader in = null;
//        List<ArrayList<String>> listOfContacts = new ArrayList<>();
         List<String[]> listOfContacts = new ArrayList<>();
        try {  
	   in = new BufferedReader(new FileReader(textFile));
	   String line = in.readLine();
           int i =0;
	   while(line != null){
//                ArrayList<String> temp = new ArrayList<>();
               String[] temp = new String[6];
		  while(!line.equals(">")){
                      switch(i){
                          case 0:
                              String temp2[]=line.split(" ");
                              temp[0]=temp2[0];
                              temp[1]=temp2[1];
                              break;
                          case 1:
                              temp[2]=line;
                              break;
                          case 2:
                              String temp3[]=line.split(",");
                              temp[3]=temp3[0];
                              String temp4[]=temp3[1].split(" ");
                              temp[4]=temp4[1];
                              temp[5]=temp4[2];
                              break;
                      }
//                      if(line.contains(",")){
//                          line=line.replace(line.charAt(line.indexOf(",")),' ');
//                      }
//                     String temp2[]=line.split(" ");
//                     for(int c=0; c<temp2.length;c++){
//                       temp.add(temp2[c]);  
//                     }
                     
                     i++;
                     line = in.readLine();  
                  }
                  i=0;
                  listOfContacts.add(temp);
		  line = in.readLine();  
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Error reading file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        String[] printOut = null;
         Iterator<String[]> it = listOfContacts.iterator();
        while( it.hasNext() ) {
            printOut = it.next();
            System.out.println("First Name: "+printOut[0]);
            System.out.println("Last Name: "+printOut[1]);
            System.out.println("Address: "+printOut[2]);
            System.out.println("City: "+printOut[3]);
            System.out.println("State: "+printOut[4]);
            System.out.println("Zip: "+printOut[5]);
            System.out.println("");
        }
            
        
          boolean append = true;   

	  
	  
	  		
          try{
	  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(textFile, append)));
          
	  out.println("DELETE ME Doe");
          out.println("W235 N675 Cool Drive");
          out.println("Muskego, Wi 53248");
          out.println(">");
          out.println("Ian Johnson");
          out.println("N675 E Grey Drive");
          out.println("Madison, Wi 53878");
          out.println(">");
	  out.close();  
          }catch(IOException e){
                System.out.println("Error reading file");
        
	  
	 
          } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    
        Iterator<String[]> it2 = listOfContacts.iterator();
            while( it2.hasNext() ) {
        {
            printOut = it2.next();
            System.out.println("First Name: "+printOut[0]);
            System.out.println("Last Name: "+printOut[1]);
            System.out.println("Address: "+printOut[2]);
            System.out.println("City: "+printOut[3]);
            System.out.println("State: "+printOut[4]);
            System.out.println("Zip: "+printOut[5]);
            System.out.println("");
        }
            }
//          for(ArrayList a: listOfContacts ) {
//              
//              System.out.println("First Name: "+a.get(0));
//            System.out.println("Last Name: "+a.get(1));
//            System.out.println("Address: "+a.get(2));
//            System.out.println("City: "+a.get(3));
//            System.out.println("State: "+a.get(4));
//            System.out.println("Zip: "+a.get(5));
//            System.out.println("");
//        }
    }
}
