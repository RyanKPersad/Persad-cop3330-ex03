package org.example;
import java.util.Scanner;
/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println( "Enter the quotes" );
        String Quotes =  myObj.nextLine();
        System.out.println( "Who said it?" );
        String author =  myObj.nextLine();
        System.out.println( author + " said," +"\"" + Quotes +"\"" );
    }
}
