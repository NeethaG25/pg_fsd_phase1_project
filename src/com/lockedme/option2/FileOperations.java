package com.lockedme.option2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
		
	public void addFile(File dir, String root, String filename) {
	
		File file = new File(root+ File.separator + filename);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		if(!fileExists(dir, filename)) {
			try {
				file.createNewFile();

				fos= new FileOutputStream(file, false);
				bos = new BufferedOutputStream(fos);
				String message = "Hello from "+filename;
				byte b[] = message.getBytes();
				bos.write(b);
				System.out.println("File created successfully");

			} catch (IOException e) {
				e.printStackTrace();}
			finally {
				try {
					bos.flush();
					fos.close();
					bos.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} else {
			System.out.println("File already exists");
		}


	}
	
	//Case Insensitivity for Adding file name
	//If one.txt is present, one.TXT filename will return true and not be added
	public boolean fileExists(File dir, String filename){
	    String[] files = dir.list();
	    for(String file : files)
	        if(file.equalsIgnoreCase(filename))
	            return true;
	    return false;
	}
	
	//Case Sensitivity for Adding file name
		//If one.txt is present, one.TXT filename will return true and not be added
		public boolean fileExistsCaseSensitive(File dir, String filename){
		    String[] files = dir.list();
		    for(String file : files)
		        if(file.equals(filename))
		            return true;
		    return false;
		}
	
	public void deteleFile(File dir, String root, String filename) {
		
		File file = new File(root+ File.separator + filename);

		if(fileExistsCaseSensitive(dir, filename)) {
			file.delete();
	        System.out.println("File deleted successfully");
		} else {
			System.out.println("File does not exist");
		}
		
	}
	
	public void searchFile(File dir, String root, String filename) {
		
		File file = new File(root+ File.separator + filename);
		
		if(fileExistsCaseSensitive(dir, filename)) {
	        System.out.println("File was found, reading the contents of the file");
	        try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);){
				String s = null;
				while((s=br.readLine())!=null){
					System.out.println(s);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("File does not exist");
		}
		
	}
}
