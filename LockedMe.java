package ProjectSimplilearn;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe {
	public static void main(String[]args)
	{
		String fileName;
		int ch=0;                 //To store the choice of the user
		

		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------");
		System.out.println("**********PROJECT ONE*************");
		System.out.println("---------------------------------------------------------------");
		System.out.println("*** CREATED BY :- ROHAN SINGH***");
		System.out.println("-------------------------------------------------------------");
		while(ch!=3)                     //To run in loop infinitely unless user chooses to exit
		{
			System.out.println("ENTER 1 TO RETRIEVE FILES IN ASCENDING ORDER ");
			System.out.println("ENTER 2 TO PERFORM BUSINESS LEVEL OPERATIONS");
			System.out.println("ENTER 3 TO EXIT");
			System.out.println("ENTER YOUR CHOICE");
		try {                                                
			ch = Integer.parseInt(sc.next());                //taking input from user
	         
		    }
		catch(Exception e) {                                //if invalid input provided
			System.out.println("Invalid Input");
			ch=0;
		}
		finally {                                       //to execute always
			switch(ch)                            //To switch to the operation user wants
			{
			case 1:                                          //Returning files in ascending order
				File directory = new File("C:\\Users\\504716\\Desktop\\Imp");                  //Path of folder to choose files from
				String files[]=directory.list();
				Arrays.sort(files);                              //Sorting files in ascending order
				 System.out.println("List of files :");
						  for (int i = 0; i < files.length; i++) {               //Printing the files
						 System.out.println(files[i]);
						  }
						   System.out.println();
			break;
			
			
			case 2:	                                //To perform some operations 
			   while(true)
			{
				System.out.println("ENTER 1 TO CREATE A NEW FILE");
				System.out.println("ENTER 2 TO REMOVE A FILE");
				System.out.println("ENTER 3 TO SEARCH FOR A FILE");
				System.out.println("ENTER 4 TO RETURN TO MAIN MENU");
				System.out.println("ENTER YOUR CHOICE");
				int ch2=0;
				try {                                                 //should be valid argument 
				ch2 =Integer.parseInt(sc.next());                      //Choice entered by the user
				}
				
				catch(Exception e)                    //if invalid argument entered then application gives invalid message
				{
					System.out.println("Invalid argument \nTry Again");
					ch2=0;
				}
				
				finally {                                //will always run
				if(ch2==1)                         //To create a new file
				{
					System.out.println("ENTER A FILE NAME TO CREATE A NEW FILE");
					fileName=sc.next();
					File file = new File("C:\\Users\\504716\\Desktop\\Imp"+fileName+".txt");      //Choosing path to store the file

						if (file.exists()) {                               //If file with same name exit don't create it
							System.out.println("file already exists");
							 } 
						else {
							 try {
							 file.createNewFile();                             //creating a new file if it doesn't exit
							 System.out.println("File created Successfully\n");
							 }
							 catch (IOException e) {
							 System.out.println("Please, enter a valid file name");
							 e.printStackTrace();					}
			}
			
					}
				else if (ch2==2) {                                 //To delete a file
					   System.out.println("Enter the file name which you want to delete");
					    fileName = sc.next();

					    File file = new File("C:\\Users\\504716\\Desktop\\Imp"+fileName+".txt");   //Path to choose file from
					    if (file.delete()) {                                                       //If file exist delete it
							 System.out.println("File deleted successfully");
							 }
							 else {                                                           //If file doesn't exist return some message
							 System.out.println("Failed to delete the file");
							 System.out.println("File Not Found");
							
							 }
							
				}
				else if (ch2==3) {                       //To search for a file
					 System.out.println("Enter the file  name with .txt extention to search");
							 fileName = sc.next();
							 File dir = new File("C:\\Users\\504716\\Desktop\\Imp");             //Path from where file needs to be searched
							  int flag = 0;
							 String files1[] = dir.list();                //Storing all files name in files1 string array
							  for (String file : files1) {                     //checking if required file exist
							  if (file.equals(fileName)) {
							 System.out.println("File " + fileName + " found");
							  flag++;
							  break;
							  }
							  }
							  if (flag == 0) {                        //if file to be searched not found
								  System.out.println("File Not Found");
										 
							  }
				}
				 else if (ch2==4) {                       //To return to main menu if user enters 4
					  break;
					  } 
				 else {
					  System.out.println("ENTER CHOICE BETWEEN 1 TO 4 ONLY \n");          //if user enters anything other than 1-4
					  }
				}
				 	  }
			   break;
			   
			   
			   
			case 3:                                                         //When user enters 3 we exit the application
				System.out.println("EXIT COMMAND INITIATED");
				System.out.println("THANK YOU");
				System.out.println("EXITING");
				break;
			  default:                                              //If user enters anything other than 1,2,3 this default goes in main menu
					  System.out.println("Wrong input \nTry again\n");
					  }
			
		}
				}
		

		}
	}
	



