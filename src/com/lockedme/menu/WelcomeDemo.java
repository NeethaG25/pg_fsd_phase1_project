package com.lockedme.menu;

import java.io.File;
import java.util.Scanner;

import com.lockedme.option1.DisplayFiles;
import com.lockedme.option2.FileOperations;

public class WelcomeDemo {
	
	static String root = "/home/kneetha76yahoo/Desktop/Git/phase1_project/files_folder";
	static File dir = new File(root);
		
	public static void displayMainMenu() {
	    System.out.println ( "1) Option 1\n2) Option 2\n3) Option 3" );
	    System.out.print ( "Selection: " );
	  }
	
	public static void displaySubMenu() {
	    System.out.println ( "1) Option 1\n2) Option 2\n3) Option 3\n4) Option 4" );
	    System.out.print ( "Selection: " );
	  }

	public static void main(String[] args) {
		
		DisplayFiles dirfiles = new DisplayFiles();
		FileOperations file = new FileOperations();
		int mainMenuChoice, subMenuChoice, filename;
		
		Scanner in = new Scanner ( System.in );
		displayMainMenu();
		mainMenuChoice = in.nextInt();
		
		while (mainMenuChoice < 1 || mainMenuChoice > 3) {
	        System.out.print("\nError! Incorrect choice.\n");
	        displayMainMenu();
	        mainMenuChoice = in.nextInt();
	    }
		do {
			switch (mainMenuChoice) {
		      case 1:
		        System.out.println ( "You picked option 1" );
		        dirfiles.filesInAscOrder(dir);
		        break;
		      case 2:
		        System.out.println ( "You picked option 2" );
		        displaySubMenu();
		        subMenuChoice = in.nextInt();
		        while (subMenuChoice < 1 || subMenuChoice > 3) {
			        System.out.print("\nError! Incorrect choice.\n");
			        displayMainMenu();
			        subMenuChoice = in.nextInt();
			    }
		        switch (subMenuChoice) {
		        case 1:
		          System.out.println ( "You picked option 1" );
		          System.out.println("Please enter the file to be added : ");
		          filename = in.nextInt();
		          file.addFile(dir, root, String.valueOf(filename));
		          break;
		        case 2:
		          System.out.println ( "You picked option 2" );
		          System.out.println("Please enter the file to be deleted : ");
		          filename = in.nextInt();
		          file.deteleFile(dir, root, String.valueOf(filename));
		          break;
		        case 3:
		          System.out.println ( "You picked option 3" );
		          System.out.println("Please enter the file you would like to search : ");
		          filename = in.nextInt();
		          file.searchFile(dir, root, String.valueOf(filename));
		          break;
		        case 4:
		          System.out.println ( "You picked option 4\nNavigating back to the Main Menu" );
		          displayMainMenu();
			      mainMenuChoice = in.nextInt();
		          break;
		        default:
		          System.err.println ( "Unrecognized option" );
		          break;
		      }
		        break;
		      case 3:
		        System.out.println ( "You picked option 3" );
		        System.exit(0);
		        break;
		      default:
		        System.err.println ( "Unrecognized option" );
		        break;
		    }
		} while (mainMenuChoice != 3);

	}

}
