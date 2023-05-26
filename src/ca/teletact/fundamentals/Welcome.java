/**
 * Welcome.java
 * 
 * This program displays a greeting for the reader
 * @version 1.0 2023-05-10
 * @author Siv Maharaj
 * 
 * credit - Cay Horstman Core Java Volume 1
 */

package ca.teletact.fundamentals;

public class Welcome {

    public static void main(String[] args) {
        String greeting = new String("Welcome to Core Java");
        System.out.println(greeting);
        for(int i=0; i < greeting.length(); i++)
          System.out.print("=");
        System.out.println();
    }
    
}
