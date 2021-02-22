package com.lockedme.file;

import java.io.File;

public class FileObj {
	
	//static String root = "/home/kneetha76yahoo/Desktop/Git/phase1_project/files_folder";
	private String root = ".\\files_folder";
	private File dir = new File(root);
	private String filename;
	
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	public File getDir() {
		return dir;
	}
	public void setDir(File dir) {
		this.dir = dir;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "FileObj [filename=" + filename + "]";
	}

}
