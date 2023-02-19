package Linuxanime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class Scraper {


 
 public static String Search(String command)
{
	 try
	 {
	 String url = "https://gogoanime.quest/search?keyword="+(command.replaceAll("Search", "")).toLowerCase();
		
		URL r = new URL(url);
	    BufferedReader br = new BufferedReader(new InputStreamReader(r.openStream()));
	    String read = br.readLine();
	    String html = "";
	    while(read!=null)
	    {
	    	html+=read;
	    	read = br.readLine();
	    	
	    }

	  Pattern pattern = Pattern.compile("<p class=\"name\">(.*?)</p>");
   Matcher matcher = pattern.matcher(html.toString());
   String namelist = "";
   while (matcher.find()) {
       String animePtag = matcher.group(1);
       int start = animePtag.indexOf("title=\"") +"title=\"".length();
       int end = animePtag.indexOf("\"", start);
String name = animePtag.substring(start,end);
namelist+= name+'\n';
       
   }
   br.close();
   return namelist;
	 }catch(Exception e1)
	 {
		 System.out.println("An error has occured.:(");
		 return "0";	 
   
}
}

static public int play(String animen,String episode)throws Exception
{
	//<iframe src="//gogo-play.tv
	try
	{
	String name = animen.replace(":",  "").replace(" ", "-").toLowerCase();
	String url = "https://gogoanime.quest/episode/" + name + "-episode-" + episode;
	URL r = new URL(url);
	BufferedReader bf = new BufferedReader(new InputStreamReader(r.openStream()));
	String read = bf.readLine();
    String html = "";
    while(read!=null)
    {
    	html+=read;
    	read = bf.readLine();
    }
    
    String prefix = "<iframe src=\"";
    String iframeRegex = "<iframe\\s+src=\"([^\"]+)\".*?</iframe>";
    Pattern pattern = Pattern.compile(iframeRegex);
    Matcher matcher = pattern.matcher(html);
    String link = "";
    while (matcher.find()) {
     String iframe = matcher.group(1);
     link += "http:" + iframe;
    }
    Runtime run  = Runtime.getRuntime();
    run.exec("firefox " + link);
    System.out.println("Playing " + name + " episode " + episode + "!" );
    bf.close();
	return 1;
	}
	catch(Exception e2)
	{
		System.out.println("An error has occured.:(");
		return 0;
	}
}
}
