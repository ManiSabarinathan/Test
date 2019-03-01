# Test

ExecutorService class:
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

Step-1:
ExecutorService executor = Executors.newFixedThreadPool(150);
executor.execute(runnable)  // runnable -- Class which extends Runnable interface

Step-2: Invoke a service through (org.springframework.web.client.RestTemplate)
ResponseEntity<String> response = restTemplate.exchange(newUrl, HttpMethod.GET, requestHeader, String.class);
  -- API to trigger
  -- Method type (HttpMethod.GET)
  -- RequestHeader for the API
  -- Response Type 
