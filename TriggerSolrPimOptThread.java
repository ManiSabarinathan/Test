
import java.io.IOException;
import java.util.Iterator;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.web.client.RestTemplate;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;



public class TriggerSolrPimOptThread implements Runnable {
	 static String sCurrentLine;
	 static final RestTemplate restTemplate = new RestTemplate();
	 String newUrl="";
	 static PrintStream ps_out;
	 static PrintStream ps_no_data_out;
     
     static final HttpEntity<String> request;
     String wpid="";
	 	 
	  public TriggerSolrPimOptThread(String wpid, String url){
		  this.wpid=wpid;  
		  this.newUrl=url;
	        
	   }
	  
	 static {
		 final String plainCreds = "xxx:xxxx";
			final byte[] plainCredsBytes = plainCreds.getBytes();
			final byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
			final String base64Creds = new String(base64CredsBytes);
			final HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);
			request = new HttpEntity<String>(headers);
			try {
				ps_out  = new PrintStream(new FileOutputStream("C:\\smani\\PIM_STATUS.csv"));
				ps_no_data_out = new PrintStream(new FileOutputStream("C:\\smani\\PIM_STATUS_NO_DATA.csv"));
			} catch (FileNotFoundException ee) {
				ee.printStackTrace();
			}
	 }
	 
	 @Override
	    public void run() {
			processCommand(wpid, newUrl);	
	    }
			
	
	 public void processCommand(String wpid, String newUrl)  {
		 try {
			ResponseEntity<String> response = restTemplate.exchange(newUrl, HttpMethod.GET, request, String.class);
			String solrResponse = response.getBody();
			amethod(wpid,solrResponse);
		 }catch(Exception ee) {
			 System.out.println(ee);
		 }
	}

	
	public void amethod(String wpid, String solrResponse) {			
		String outString=solrResponse.split("id,wpid,state,msg,modified_time,num_of_retries")[1].trim();
		if(outString.length() > 0) {
			String splitdata[]=outString.split(",");
			String id=splitdata[0];
			String wpidd=splitdata[1];
			String state=splitdata[2];
			String msg=splitdata[3];
			String modified_date=splitdata[4];
			String num_of_retries=splitdata[5];
			ps_out.println();
			ps_out.print(wpidd+","+id+","+state+","+msg+","+modified_date+","+num_of_retries+",");
			
		}
		else {
			ps_no_data_out.println();
			ps_no_data_out.print(wpid+","+"NA"+","+"No Data in PIM Audit Table"+","+"NA"+","+"NA");
			
		}
	}
	
	}
