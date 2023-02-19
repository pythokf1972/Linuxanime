import Linuxanime.Scraper;
import java.util.Scanner;
class main{
 public static void main(String args[])throws Exception
 {
   	 Scraper p = new Scraper();
   	 Scanner s = new Scanner(System.in);
	 System.out.println(" ___       ___  ________   ___  ___     ___    ___      ________  ________   ___  _____ ______   _______          \n"
	 		+ "|\\  \\     |\\  \\|\\   ___  \\|\\  \\|\\  \\   |\\  \\  /  /|    |\\   __  \\|\\   ___  \\|\\  \\|\\   _ \\  _   \\|\\  ___ \\         \n"
	 		+ "\\ \\  \\    \\ \\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\  \\ \\  \\/  / /    \\ \\  \\|\\  \\ \\  \\\\ \\  \\ \\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|        \n"
	 		+ " \\ \\  \\    \\ \\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\  \\ \\    / /      \\ \\   __  \\ \\  \\\\ \\  \\ \\  \\ \\  \\\\|__| \\  \\ \\  \\_|/__      \n"
	 		+ "  \\ \\  \\____\\ \\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\  /     \\/        \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\     \n"
	 		+ "   \\ \\_______\\ \\__\\ \\__\\\\ \\__\\ \\_______\\/  /\\   \\         \\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\__\\ \\__\\    \\ \\__\\ \\_______\\    \n"
	 		+ "    \\|_______|\\|__|\\|__| \\|__|\\|_______/__/ /\\ __\\         \\|__|\\|__|\\|__| \\|__|\\|__|\\|__|     \\|__|\\|_______|    \n"
	 		+ "                                       |__|/ \\|__|     ");
	 while(true)
	 {
	 System.out.print(">>>");
	 String command = s.nextLine();
	 
	 if(command.contains("Search"))
	 {
		
            String names = p.Search(command);
            System.out.println("Search results:" + '\n'+names);
	 }
	 if(command.contains("Play"))
	 {
		 String name = command.replace("Play ", "");
		 System.out.print("Which episode?");
		 String episode = s.nextLine();
		 int result = p.play(name,episode);
		 if(result==1)
		 {
		 System.out.println("Enter 'n' to play next episode and 'e' to exit or ur episode number");
		 while(true)
		 {
			System.out.print("Episode:");
		    String nextep = s.nextLine();
		    if(nextep.equals("n"))
		    {
		    	episode = String.valueOf(Integer.parseInt(episode)+1);
		    	p.play(name,episode);
		    }
		    if(nextep.equals("e"))
		    {
		    	break;
		    }
		    if(!nextep.equals("e"))
		    {
		    	if(!nextep.equals("n"))
		    	{
		    		
		    	
		    	p.play(name,nextep);
		    	}
		    }
		 }
	 }
	 }
	 }
	 }
	 }
	 
 
 

