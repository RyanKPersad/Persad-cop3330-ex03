package org.example;
import java.util.Scanner;
/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Initializes Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println( "Enter the quotes" );
        //Input
        String Quotes =  myObj.nextLine();
        //Input
        System.out.println( "Who said it?" );
        String author =  myObj.nextLine();
        //Output
        System.out.println( author + " said," +"\"" + Quotes +"\"" );
    }
}
