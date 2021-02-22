package com.lockedme.option1;

import java.io.File;
import java.util.Arrays;

public class DisplayFilesImpl implements DisplayFiles {
	
	@Override
	public void filesInAscOrder(File dir) {
		
		String[] files = dir.list();
		if(files!=null) {
			Arrays.sort(files);
			System.out.println("List of files in Ascending Order : "+Arrays.toString(files));
		} else {
			System.out.println("There are no files in the Directory");
		}
	}

}
