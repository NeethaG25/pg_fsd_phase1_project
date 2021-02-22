package com.lockedme.option2;

import com.lockedme.file.FileObj;

public interface FileOperations {

	void addFile(FileObj fileObj);

	void deteleFile(FileObj fileObj);

	void searchFile(FileObj fileObj);

	//Case Insensitivity for Adding file name
	//If one.txt is present, ONE.txt filename will return true and not be added
	boolean fileExists(FileObj fileObj);

	//Case Sensitivity for Adding file name
	//If one.txt is present, One.txt filename will return false
	boolean fileExistsCaseSensitive(FileObj fileObj);

}