package pt.c06patterns.factory.s02;

public class Crab implements Aquatic
{
    /*
       o o
       | |  
     /-----\
     |     |
     \-----/
     / / \ \
     */
    
    
    public String aquaticImage()
    {
        return "  o o\n" +
               "  | |\n" +  
               "/-----\\\n" +
               "|     |\n" +
               "\\-----/\n" +
               "/ / \\ \\\n";
    }
}
