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
	    System.out.println ( "1) Option 1\n2) Option 2\n3) Option 3" );
	    System.out.print ( "Selection: " );
	  }

	public static void main(String[] args) {
		
		DisplayFiles dirfiles = new DisplayFiles();
		FileOperations file = new FileOperations();
		
		Scanner in = new Scanner ( System.in );
		displayMainMenu();
		int filename = in.nextInt();
		
		dirfiles.filesInAscOrder(dir);
		
		//file.addFile(dir, root, String.valueOf(filename));
		//file.deteleFile(dir, root, filename.toString());
		//file.searchFile(dir, root, filename.toString());

	}

}
