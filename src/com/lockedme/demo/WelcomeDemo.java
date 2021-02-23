package com.lockedme.demo;

import java.util.Scanner;

import com.lockedme.file.FileObj;
import com.lockedme.menu.Menu;
import com.lockedme.menu.MenuImpl;
import com.lockedme.option1.DisplayFiles;
import com.lockedme.option1.DisplayFilesImpl;
import com.lockedme.option2.FileOperations;
import com.lockedme.option2.FileOperationsImpl;

public class WelcomeDemo {
	
	public static void main(String[] args) {
		
		FileObj fileObj = new FileObj();
		Menu menu = new MenuImpl();		
		DisplayFiles dirfiles = new DisplayFilesImpl();
		FileOperations file = new FileOperationsImpl();
		int mainMenuChoice, subMenuChoice; 
		
		Scanner in = new Scanner ( System.in );
		menu.displayProjectDetails();
		menu.displayMainMenu();
		mainMenuChoice = in.nextInt();	
		
		while (mainMenuChoice < 1 || mainMenuChoice > 3) {
	        System.out.print("\nError! Incorrect choice.\n");
	        menu.displayMainMenu();
	        mainMenuChoice = in.nextInt();
	    }
		
		do {

			switch (mainMenuChoice) {
		      case 1:
		        System.out.println ( "You picked option 1" );
		        dirfiles.filesInAscOrder(fileObj.getDir());
		        mainMenuChoice = 3;
		        break;
		      case 2:
		        System.out.println ( "You picked option 2" );
		        menu.displaySubMenu();
		        subMenuChoice = in.nextInt();
		        while (subMenuChoice < 1 || subMenuChoice > 4) {
			        System.out.print("\nError! Incorrect choice.\n");
			        menu.displayMainMenu();
			        subMenuChoice = in.nextInt();
			    }
		        switch (subMenuChoice) {
		        case 1:
		          System.out.println ( "You picked option 1" );
		          in.nextLine();
		          System.out.println("Please enter the file to be added : ");
		          fileObj.setFilename(in.nextLine()+".txt");
		          file.addFile(fileObj);
		          mainMenuChoice = 3;
		          break;
		        case 2:
		          System.out.println ( "You picked option 2" );
		          in.nextLine();
		          System.out.println("Please enter the file to be deleted : ");
		          fileObj.setFilename(in.nextLine()+".txt");
		          file.deteleFile(fileObj);
		          mainMenuChoice = 3;
		          break;
		        case 3:
		          System.out.println ( "You picked option 3" );
		          in.nextLine();
		          System.out.println("Please enter the file you would like to search : ");
		          fileObj.setFilename(in.nextLine()+".txt");
		          file.searchFile(fileObj);
		          mainMenuChoice = 3;
		          break;
		        case 4:
		          System.out.println ( "You picked option 4\nNavigating back to the Main Menu" );
		          System.out.println ( "***********************************************************************************************" );
		          menu.displayMainMenu();
			      mainMenuChoice = in.nextInt();
			      System.out.println("mainMenuChoice "+mainMenuChoice);
		          break;
		        default:
		          System.err.println ( "Unrecognized option" );
		          break;
		      }
		        break;
		      case 3:
		        System.out.println ( "You picked option 3, exiting the Application" );
		        System.exit(0);
		        break;
		      default:
		        System.err.println ( "Unrecognized option" );
		        break;
		    }
		} while (mainMenuChoice != 3);
		
		in.close();

	}
	

}
