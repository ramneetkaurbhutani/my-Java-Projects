import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileOperations implements Operations {
	private List listOfFiles1;
	private String fileName;
	

	public String getFileName() {
		return fileName;
		
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	public boolean fileNameValidity(String fileName)  {
		boolean result = Pattern.matches("[a-zA-Z]{1}[a-zA-Z0-9._-]*", this.fileName);
		return result;
	}
//--------------------------------------------------------------------------------------------	
	public void displayFiles() {
		try {
			File displayFiles = new File("C:\\simplilearn\\class codes");
			String[] listOfFiles = displayFiles.list();
			Arrays.sort(listOfFiles , (f1 , f2) -> f1.compareTo(f2));
		    System.out.println("---------------------------------------------------");
		    this.listOfFiles1 = Arrays.asList(listOfFiles);
			System.out.println(listOfFiles1);
//			for (int i = 0; i < listOfFiles.length; i++) {
//			System.out.println(listOfFiles[i]);
//			}
		    }
			catch (Exception e) {
				e.printStackTrace();
			}
	}
//------------------------------------------------------------------------------------	
	public void addFile(String fileName) {
		boolean r = fileNameValidity(this.fileName);
		if (r == true) {
		
			 this.fileName = "C:\\simplilearn\\class codes\\" + this.fileName;
			File addFile = new File(this.fileName);
			
			try {
				
				boolean result;
				
				result = addFile.createNewFile();
				
				if(result == true ){
					System.out.println("File is created\n");
				}
				else {
					System.out.println("File already exists\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		else {
			System.out.println("Invalid File Name\n");
		}
	}
	
	//-----------------------------------------------------------------------------
	
	public void deleteFile(String fileName) {
		boolean r = fileNameValidity(this.fileName);
		if (r == true) {
			
			int count = 0;
			File displayFiles = new File("C:\\simplilearn\\class codes" );
			String[] listOfFiles = displayFiles.list();
			
			for(int a =0; a < listOfFiles.length; a++) {
				if(listOfFiles[a].equals(this.fileName)) {
					++count;
					break;
				} 
			}
			
			if(count != 0) {
				 this.fileName = "C:\\simplilearn\\class codes\\" + this.fileName;
					File deleteFile = new File(this.fileName);
					
					
					boolean result = deleteFile.delete();
					
					if (result == true) {
						System.out.println("File is deleted successfully\n");
					}}
			else {
						System.out.println("File does not exists\n");
					}
		}
		else {
			System.out.println("Invalid File Name\n");
		}
	}
	
	//--------------------------------------------------------------------------------------
	
	public void searchFile(String fileName) {
		boolean r = fileNameValidity(this.fileName);
		if (r == true) {
	
        // USING LINEAR SEARCH
			
			int count = 0;
			File searchFiles = new File("C:\\simplilearn\\class codes" );
			String[] listOfFiles = searchFiles.list();
			for(int i =0; i < listOfFiles.length; i++) {
				if(listOfFiles[i].equals(this.fileName)) {
					System.out.println("File is found\n");
					++count;
					break;
				} 
			}
			if(count == 0)
				System.out.println("File not found\n");
			}
		
		else 
		{System.out.println("Invalid File Name\n");
		}
		
		
		}
		

// USING FILE SEARCH METHOD
			
//String filename1 = "C:\\simplilearn\\class codes\\" + this.fileName;			
//			
//			File searchFile = new File(filename1);
//			boolean result = searchFile.exists();
//			if (result == true) {
//				System.out.println("File is found\n");
//			}
//			else {
//				System.out.println("File not found\n");
//			}
//		}
//		else {
//			System.out.println("Invalid File Name\n");
//		}
//	}
//	
	//----------------------------------------------------------------------------------
	
	public void mainMenu() {
		System.out.println("Welcome to LockedMe.com");
		System.out.println();
		System.out.println("Developed by Ramneet Kaur Bhutani");
		System.out.println();
		System.out.println("Add, Delete and Search the files in this application");
		System.out.println();
		System.out.println("Enter: ");
		System.out.println("1 - To know the files present in this application");
		System.out.println("2 - To perform any of the above listed task");
		System.out.println("3 - Close the application ");
	}
	
	public void subMenu() {
		System.out.println("Enter: ");
		System.out.println("1 - Add a File");
		System.out.println("2 - Delete a File");
		System.out.println("3 - Search a File");
		System.out.println("4 - Navigate back to main menu");
		
	}

}

