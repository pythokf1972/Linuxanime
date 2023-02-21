# Linuxanime
an anime player that can be accessed via linux terminal


Installation:
so first off,this works on all linux distros with firefox
now in order to install the first command we need to run is ofc to clone this repo
but before that make sure u have git installed,if u dont then install it using
sudo apt install git

after that we need to clone using

`git clone https://github.com/pythokf1972/Linuxanime`

then after this step, we go ahead and move to the Linuxanime directory
`cd Linuxanime`
then we give setup.sh execute privellage and run it
`chmod +x setup.sh`
and then run it as root
`sudo bash setup.sh`
we would notice that a few things are installing which is the java programming language compiler
and then after that is finished the program asked u for input for the path of the Linuxanime folder so enter it


after all of that is done u can find some command in required.txt
u have to copy the first command and execute it in terminal
`echo "alias Lanime='sudo java -cp /lib/linuxanime main'" >> ~/.bashrc`



and then the second one
`source ~/.bashrc`

and there u have it everything is good and ready to go u can now start the program by running the command
Lanime

u would notice that there is sort of like input and there are two commands for this program
Search 
which searches for an anime using keywords note that the keywords must be next to search 
example: Search naruto

and we have the Play command which plays an anime
example: Play naruto





Package guide:


this can aslo be accessed via java by copying and pasting the /Linuxanime/Linuxanime folder
and there is one class which is scraper
here is a code snippet of the functions and class in action


import Linuxanime.Scraper;
{
class main
{
    public static void main(String args[])
    {
      Scraper s = new Scraper();
      s.search("keywords");
      s.play(name,episode);
    
    
}
}



the search() function:used in order to search for anime accepts keywords as parameters
the play() function:used in order to play anime requires both anime name and episode number as parameter and both are strings
