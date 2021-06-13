import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

public class Application {

public static void main(String[] args) {
	FileOperations obj = new FileOperations();
	Scanner sc = new Scanner(System.in);
	String userInput2, userInput, userInput3;

block:		
while(true) {			
	
	obj.mainMenu();
	
	
	try {
		userInput = sc.nextLine();
		
		if (userInput.matches("[1]"))
		{
			 System.out.println("Files Present in the application");
			 obj.displayFiles();
			 System.out.println("Want to go to the main menu(y/n): ");
			 userInput3 = sc.nextLine();
			 if(userInput3.matches("[yY]"))continue block;
			 else if(userInput3.matches("[nN]")) {
				System.exit(0);
			 }else System.out.println("Invalid input\n");
		}
		else if (userInput.matches("[2]")) {
			
			obj.subMenu();


         do {
			userInput2 = sc.nextLine();
			
			if(userInput2.matches("[1]")) {
			 
			do {
			System.out.println("Enter name of the file to be added: ");
			 String str1 = sc.nextLine();
			 obj.setFileName(str1);
			 obj.addFile(str1);
			 System.out.println("Want to enter more files(y/n): ");
			 userInput3 = sc.nextLine();
			}while(userInput3.matches("[yY]"));
			
			obj.subMenu();
			
			}
			 
			else if (userInput2.matches("[2]")) {
			
				do {
				System.out.println("Enter name of the file to be deleted: ");
			 String str2 = sc.nextLine();
			 obj.setFileName(str2);
			 obj.deleteFile(str2);
			 System.out.println("Want to delete more files(y/n): ");
			 userInput3 = sc.nextLine();
			}while(userInput3.matches("[yY]"));
//				System.exit(0);
				obj.subMenu();
				}
			 
			else if (userInput2.matches("[3]")) {
				do{
					System.out.println("Enter the file to search for: ");
				
			 String str3 = sc.nextLine();
			 obj.setFileName(str3);
			 obj.searchFile(str3);
			 System.out.println("Want to search more files(y/n): ");
			 userInput3 = sc.nextLine();
			}while(userInput3.matches("[yY]"));
				obj.subMenu();
			}
			
			
			   else if (userInput2.matches("[4]")) { 
				continue block;
			}
			else
			{System.out.println("Invalid input\n" + "Enter Again\n");
			
			}
			
			}while(true);
         
		}
		else if (userInput.matches("[3]")) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid input\n" + "Enter Again\n");
			System.out.println();
			
		}
	} catch (Exception e) {
		System.out.println("Entered invalid input");
	} finally {
		
	}
	
	
}
}
}

		





















