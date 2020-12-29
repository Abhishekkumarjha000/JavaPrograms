package testCodingTest;

import java.io.IOException;
import java.net.http.HttpClient.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;




@SuppressWarnings("deprecation")
public class JavaTest extends Exception {
	
	
	JavaTest(String msg){
	      super(msg);
	   }
	
	
	@Test
	public void  forJavaBasicTest()
	{
		List<String> myarrayList= new ArrayList<String>();
		
		String str1="This is the story about the boy in london.";
		
		/*
		 * print the number of times the word "the" present in str1
		 * 
		 */
		int count=0;
		String[] arr = str1.split(" ");
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].equals("the")) {
				count++;
				
			}
		}
		System.out.println(count);
		
		
		//----------------------------------------------------------------------------------
	
		String str2=" cAllFortheDay";
		String str3="CALLFortheDay      ";
		/*
		 * Assert that str2 and str3 are equal or not regardless to the spaces and the case
		 */
		
		String str22=str2.replaceAll("\\s", "").toLowerCase();
		String str33=str3.replaceAll("\\s", "").toLowerCase();
		
		Assert.assertEquals(str22, str33);
		
		//-----------------------------------------------------------------------------------------
		
		
		String str4="10 ";
		String str5=" 20";
		String str44=str4.replaceAll("\\s", "");
		String str55=str5.replaceAll("\\s", "");
		
		
		/*
		 * Treat the str4 and str5 as Integers , and print the result of adding them together
		 */	
		
		int s4=Integer.parseInt(str44);
		int s5=Integer.parseInt(str55);
		System.out.println(s4+s5);
	}
	
	
	//------------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------
	@Test
	public void  forArrayListTest()
	{
		List<String> myarrayList= new ArrayList<String>();
		
		
		/*
		 * 1. Include the following  items in the 'myarrayList'
		 *    - "1"
		 *    - "2"
		 *    - "3"
		 *    - "four"
		 *    - "7"
		 */
		
		myarrayList.add("1");
		myarrayList.add("2");
		myarrayList.add("3");
		myarrayList.add("four");
		myarrayList.add("7");
		
		
		
		
		/*
		 * 2. Using enhanced for loop Print the elements available the 'myarrayList'
		 */
			
		
		for(String addedlist:myarrayList) {
			System.out.println(addedlist);
			
		}
		
		
		/*
		 * 3. Print the size of 'myarrayList' 
		 */
		
		System.out.println(myarrayList.size());
		
		/*
		 * 4. Loop through the 'myarrayList' 
		 * Find the 'Opera' in the ArrayList, if not found print 'Opera is not present in the arrayList' in console
		 */
		
		if(!myarrayList.contains("Opera")) {
			System.out.println("Opera is not present in the arrayList");
		}
		
		/*
		 * 4. Find the sum of the numbers stored in the arraylist
		 */
		
		
		
	}
	
	@Test
	public void  forHashSetTest()
	{	
		/*
		 * Create the new HashSet to store the String variables
		 */
		Set<String> se=new HashSet<String>();
		
		
		
		/*
		 * Add the following items to the hashset
		 * 
		 *   1. Windows
		 *   2. Os X
		 *   3. Ubuntu
		 *   4. Windows
		 */
		se.add("Windows");
		se.add("Os X");
		se.add("Ubuntu");
		se.add("Windows");
		
		
		/*
		 * print the size of the hashSet
		 */
		
		System.out.println("size of set is "+se.size());
		
		/*
		 * Iterate the elements in the hashmap and print them in console
		 */
		
		// the above comment should be hashset and not hashmap-------------------note-- note-----
		for(String ele:se) {
			System.out.println(ele);
		}
		
		/*
		 * remove 'Windows' from hashSet. And print the size of the hashSet
		 */
		
		
		
	}
	
	@Test
	public void  forHashMapTest()
	{	
		/*
		 * Create the new Hashmap to store the Integer, String pairs
		 */
		Map<Integer, String> hm=new HashMap<Integer, String>();
		
		/*
		 * Add the following pairs into HashMap
		 * 
		 *   key : 1  value : Windows
		 *   key : 2  value : Ubuntu
		 *   key : 3  value : OsX 
		 *   key : 4  value : NewOperatingSystem 
		 *   key : 4  value : NewOperatingSystem11 

		 */
		hm.put(1, "Windows");
		hm.put(2, "Ubuntu");
		hm.put(3, "OsX");
		hm.put(4, "NewOperatingSystem");
		hm.put(4, "NewOperatingSystem11");
		
		
		
		
		
		/*
		 * Print the size of the Hashmap
		 */
		System.out.println("size of hasmap:"+hm.size());
		
		/*
		 * print the keys stored in the hashmap
		 */
		for (Integer key : hm.keySet()) {
            System.out.println(key);
        }
		
		/*
		 * remove the pairs from the hashmap which contains the value "OperatingSystem"
		 */
		String valueToBeRemoved="OperatingSystem";
		Iterator<Map.Entry<Integer, String> > 
        iterator = hm.entrySet().iterator(); 
		while (iterator.hasNext()) { 
			  
            
            Map.Entry<Integer, String> 
                entry 
                = iterator.next(); 
  
            
            if (valueToBeRemoved.equals(entry.getValue())) { 
  
                
                iterator.remove(); 
            } 
        } 
  
        
        System.out.println("Modified HashMap: "
                           + hm); 
    } 
	
	
	@Test
	public void  forExceptionsTest() 
	{	
		
		String url=null;
		/*
		 * 1. Compare the Given above string with any other valid string
		 */
		
		String a="abhishek";
		
		try {
			url.compareTo(a);	
			
		}catch(NullPointerException n){
			n.printStackTrace();
			
		}
		
		
		
		
		 /* 
		 * 2. Handle the Specific Exception
		 */

		
		
		
		/*
		 * 3. Throw the exception manually and handle it appropriately
		 */
		 String msg = "this is softcrylic exception";
		 
		 try {
			 JavaTest ex=new JavaTest(msg);
				throw ex;
				
			 
		 }catch(JavaTest j) {
			 j.printStackTrace();
		 }	
		
		
	}
	
	@Test
	public void  forRestApiTest() throws IOException
	{	
		String url="";
		
		// URL - http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo
		url="http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo";
		// Create the GET request.  Hint: Use can use HttpGet method
	
	CloseableHttpClient httpclient = HttpClients.createDefault();
	
	HttpGet httpget=new HttpGet(url);
		
		//Set the contentType as application/json
	httpget.setHeader("contenet-type", "application/json");
			
		//Execute the GET request
			CloseableHttpResponse closablehttpresponse = httpclient.execute(httpget);
		
		//  Print the status code of the response
	
			int status_code = closablehttpresponse.getStatusLine().getStatusCode();
			System.out.println("Response code:"+status_code);
		// Get the response message and parse it as an JSON
				
		String myresponse=EntityUtils.toString(closablehttpresponse.getEntity(),"UTF-8");
		
		JSONObject jsonobject=new JSONObject(myresponse);
		System.out.println(jsonobject);
		
		// parse and print the "countrycode" and "name" fields using JSONArray and JSONObject
		
		
			//auth not 
		
		
		
		
		
	}
		
	}


	



