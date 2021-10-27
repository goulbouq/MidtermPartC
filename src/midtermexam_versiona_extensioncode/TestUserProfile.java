/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author qgoul
 */
public class TestUserProfile {
    public static void main (String[] args){
        
        Scanner lebron = new Scanner(System.in);
        System.out.println("Please enter your username");
        String name = lebron.nextLine();
        System.out.println("Choose your favourite genre from one of the following:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        for (String i: genres){
        System.out.println(i);
        }
        
        String genre = lebron.nextLine();
        UserProfile prof = new UserProfile(name, genre);
        System.out.println("Congrats your new profile has been made username: " + prof.getUserID() + " favourite genre: " + prof.getGenre());
       
    }
}
