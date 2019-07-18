

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthDayMatchTest {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
       int arr[] = new int[s.size()];
       int jj=0;
       Iterator it = s.iterator();
       while(it.hasNext()) {
         int v = (Integer) it.next();
         arr[jj] = v;
         jj++;
       }
        int count=0;
        int sum=0;
        if(arr.length == 1 && m == 1) {
        	System.out.println("Array length is 1 ");
            return 1;
        }
        else {
            for(int i=0;i<=arr.length-m;i++) {
                if(arr[i]!=d) {
                    for(int k=0;k<m;k++) {
                        sum = sum+arr[i+k];
                        if(sum==d) {
                            count++;
                            sum=0;
                        }                
                    }
                    sum=0;
                }
            }            
            return count;
        } 

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\smani\\out.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
