package com.lockedme.option2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.lockedme.file.FileObj;

public class FileOperationsImpl implements FileOperations {
		
	@Override
	public void addFile(FileObj fileObj) {
	
		File file = new File(fileObj.getRoot()+ File.separator + fileObj.getFilename());
			
		if(!fileExists(fileObj)) {
			try (FileOutputStream fos= new FileOutputStream(file, false);
					BufferedOutputStream bos = new BufferedOutputStream(fos);){
				file.createNewFile();				
				String message = "Hello from "+fileObj.getFilename();
				byte b[] = message.getBytes();
				bos.write(b);
				System.out.println("File created successfully");

			} catch (IOException e) {
				System.out.println("File is not added as the Path specified does not exist");}

		} else {
			System.out.println("File already exists");
		}
	}
	
	@Override
	public void deteleFile(FileObj fileObj) {
		
		File file = new File(fileObj.getRoot()+ File.separator + fileObj.getFilename());

		if(fileExistsCaseSensitive(fileObj)) {
			file.delete();
	        System.out.println("File deleted successfully");
		} else {
			System.out.println("File does not exist");
		}
		
	}
	
	@Override
	public void searchFile(FileObj fileObj) {
		
		File file = new File(fileObj.getRoot()+ File.separator + fileObj.getFilename());
		
		if(fileExistsCaseSensitive(fileObj)) {
	        System.out.println("File was found, reading the contents of the file");
	        try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);){
				String s = null;
				while((s=br.readLine())!=null){
					System.out.println(s);
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Not able to create a file as the Path specified doea not exist");
			}
		} else {
			System.out.println("File does not exist");
		}
		
	}
	
	//Case Insensitivity for Adding file name
	//If one.txt is present, ONE.txt filename will return true and not be added
	@Override
	public boolean fileExists(FileObj fileObj){
	    String[] files = fileObj.getDir().list();
	    boolean fileExists = false;
	    if(files!=null) {
		    for(String file : files) {
		        if(file.toString().equalsIgnoreCase(fileObj.getFilename().toString())) {
		        	fileExists = true;
		        	break;
		        } else {
			    	fileExists = false;
			    }
		    } 
	    }
	    return fileExists;
	}
	
	//Case Sensitivity for Adding file name
		//If one.txt is present, One.txt filename will return false
		@Override
		public boolean fileExistsCaseSensitive(FileObj fileObj){
		    String[] files = fileObj.getDir().list();
		    boolean fileExists = false;
		    if(files!=null) {
			    for(String file : files) {
			        if(file.equals(fileObj.getFilename())) {
			        	fileExists = true;
			        	break;
			        } else {
				    	fileExists = false;
				    }
			    } 
		    }
		    return fileExists;
		}
}
