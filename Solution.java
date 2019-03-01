import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        //Iterate both List 
        //List is an ordered collection, hence its good to compare both elements in the list
        List countList = new ArrayList(); 
        int aCount=0;
        int bCount=0;
        int j=0;
        int i=0;
        System.out.println("a.size is ==> " + a.size());
        System.out.println("b.size is ==> " + b.size());
       while(i<a.size()){
    	   System.out.println("Loop-i :" + i);
    	   
    	   while(j < b.size()) {
        	  System.out.println("Loop-j :" + j);
       	   	  if(a.get(i) == b.get(j)) {
       	   		  i++;
       	   		  j++;
       	   		  break;
       	   	  }
       	   	  
        	  if(a.get(i)>b.get(j)) {
	              aCount+=1;
	              System.out.println("aCount ==> " +aCount);
	              i++;
	              j++;
	              break;
              }
        	  else {
	              bCount+=1;
	              System.out.println("bCount ==> " +bCount);
	              i++;
	              j++;	
	              break;
            }
          }
       }
       System.out.println("aCountFinal==> " + aCount);
       System.out.println("bCountFinal==> " + bCount);
       countList.add(aCount);
       countList.add(bCount);
        return countList;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\smani\\output.txt"));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
