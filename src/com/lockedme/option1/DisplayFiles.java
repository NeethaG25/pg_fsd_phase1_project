package com.lockedme.option1;

import java.io.File;
import java.util.Arrays;

public class DisplayFiles {
	
	public void filesInAscOrder(File dir) {
		
		String[] files = dir.list();
		Arrays.sort(files);
		System.out.println("List of files in Ascending Order : "+Arrays.toString(files));
		
	}

}
