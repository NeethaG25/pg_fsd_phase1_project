package com.lockedme.menu;

public class MenuImpl implements Menu {
	
	@Override
	public void displayMainMenu() {
	    System.out.println ( "\t\t\t\t\tMain Menu" );
	    System.out.println ( "***********************************************************************************************" );
	    System.out.println ( "\nOption 1 - Please Select Option 1 to retrieve the List of Files in Ascending Order" );
	    System.out.println ( "Option 2 - Please select Option 2 for various File Operations like Add, Delete and Search" );
	    System.out.println ( "Option 3 - Please select Option 3 to Close the Application" );
	    System.out.print ( "Selection: " );
	  }
	
	@Override
	public void displaySubMenu() {
		System.out.println ( "***********************************************************************************************" );
	    System.out.println ( "\t\t\t\tOption 2 : Sub Menu" );
	    System.out.println ( "***********************************************************************************************" );
		System.out.println ( "\nOption 1 - Please Select Option 1 to Add a File" );
	    System.out.println ( "Option 2 - Please select Option 2 to Delete a File" );
	    System.out.println ( "Option 3 - Please select Option 3 to Search a File" );
	    System.out.println ( "Option 3 - Please select Option 4 to Go Back to the Main Menu" );
	    System.out.print ( "Selection: " );
	  }

	@Override
	public void displayProjectDetails() {
		System.out.println ( "***********************************************************************************************" );
	    System.out.println ( "\t\t\t\t\tLockedMe.com" );
	    System.out.println ( "***********************************************************************************************" );
	    System.out.println("\t\t\t\tDeveloped by : Neetha Gadhwala");
	    System.out.println ( "***********************************************************************************************" );
	}
	

}
