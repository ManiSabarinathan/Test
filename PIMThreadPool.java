
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PIMThreadPool {


	 static String sCurrentLine;
	 static String solrEndPoint_pim = "http://gemc-solr.glb.prod.walmart.com/solr/pimadapter_prod.audit_log/select?q=wpid:";
	 
	 static final RestTemplate restTemplate = new RestTemplate();
	 static String newUrl="";
	 static PrintStream out;

    public static void main(String[] args) throws Exception {
     System.out.println("Start Time:: "+ new Date());
      ExecutorService executor = Executors.newFixedThreadPool(150);
      String fileName = JOptionPane.showInputDialog(null, "Enter a fileName");
      BufferedReader br = null;
	  br = new BufferedReader(new FileReader(fileName));
		while ((sCurrentLine = br.readLine()) != null) {
			newUrl = solrEndPoint_pim+sCurrentLine+"&fl=id,wpid,state,msg,modified_time,num_of_retries&wt=csv&indent=true";
			System.out.println("SOLR Query: "+newUrl);	
            Runnable worker = new TriggerSolrPimOptThread(sCurrentLine,newUrl);
            executor.execute(worker);
       }
      executor.shutdown();

      while (!executor.isTerminated()) {

      }
      System.out.println(new Date());
      System.out.println("Finished all threads");
      System.out.println("End Time:: "+ new Date());
  }

}
