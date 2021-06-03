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

        System.out.print( "Enter the quote " );
        //Input
        String Quotes =  myObj.nextLine();

        //Input
        System.out.print( "Who said it? " );
        String author =  myObj.nextLine();

        //Output
        String print = String.format("%s says,\"%s\".",author,Quotes);
        System.out.println(print);
    }
}
