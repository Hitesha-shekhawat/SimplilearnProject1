package  mypackage;
import java.util.Scanner;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
class displayDetails
{

public static void displayMenu()
{
System.out.println("Welcome to LockerMe.com");	
System.out.println("\nDeveloper Details:\n");
System.out.println("Developer Name :Hitesha Shekhawat\n");
System.out.println("Designation: Full Stack JAVA Developer");

}
}

class fileOperations {
    
		 public static void newFile() throws IOException
		    {
	   String strFilePath = "", strFileName = "";
	   FileOutputStream fos = null;
		        try {
		  
		            BufferedReader br = new BufferedReader(
		                new InputStreamReader(System.in));
		            System.out.println("Enter the file name:");
		  
		            strFileName = br.readLine();
		            System.out.println("Enter the file path:");
		  
		            strFilePath = br.readLine();
		            Thread.sleep(1000);    

		            System.out.println("File added");
		  
		             fos = new FileOutputStream(
		                strFilePath + "" + strFileName + ".txt");
		            
		        }
		  
		        // Try-Catch Block
		        catch (Exception ex1) {
		        }
		        finally
		        {
		        	fos.close();
		        }
		    }
	

	public static void deletefile()throws IOException {
		try {
			String strFileNameDl = "", strFilePathDl = "";
		

		BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
  
            strFileNameDl = br.readLine();
          
            System.out.println("Enter the file path:");
            strFilePathDl = br.readLine();
            
            
            File file = new File(strFilePathDl + strFileNameDl);
            System.out.println(file.exists());
            System.out.println(strFilePathDl + strFileNameDl);
         
            
            if(file.exists()) {
            	
            	new File(strFilePathDl  + strFileNameDl).delete();	
            Thread.sleep(1000);
            	 System.out.println("Deleted");
            }else {
            	
            	 System.out.println("file not found ");
            }
	    	
			

      
		
		 		}
	catch(Exception ex1) {
	}


	}
		
		public static void search()
		{
			try {
				String str1 = null, str2 = null;
			

			BufferedReader br = new BufferedReader(
	                new InputStreamReader(System.in));
	            System.out.println("Enter the file name:");
	  
	            str1 = br.readLine();
	          
	            System.out.println("Enter the file path:");
	            str2 = br.readLine();
	            
	            
	            File file = new File(str2 + "\\" +str1);
	           // System.out.println(file.exists());
	            
	         
	            
	            if(file.exists()) {
	            	
	         
	            Thread.sleep(1000);
	            	 System.out.println("Found");
	            }else {
		            Thread.sleep(1000);

	            	 System.out.println("file not found ");
	            }
		    	
			
			}catch(Exception e){
				}
			}
		
public static void getFiles() throws IOException
{
	String path=null;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
      
        System.out.println("Enter the file path:");
        path = br.readLine();
        

	
	File[] listOfFiles=new File(path).listFiles();
	if(listOfFiles.length==0)
	{
		System.out.println("Directory is Empty");
	}
	else
	{
		for(var l:listOfFiles)
		{
			System.out.println(l.getName());
		}
	}
	


}
public static void ascendingOrder()
{
	File dir=new File("D:\\");
	{
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the file path: ");
        String dirPath = scanner.nextLine(); // Takes the directory path as the user input

        File folder = new File(dirPath);
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();

            Arrays.sort(fileList);

            System.out.println("\nTotal number of items present in the directory: " + fileList.length );


            // Lists only files since we have applied file filter
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

            // Creating a filter to return only files.
            FileFilter fileFilter = new FileFilter()
            {
                @Override
                public boolean accept(File file) {
                    return !file.isDirectory();
                }
            };

            fileList = folder.listFiles(fileFilter);

            // Sort files by name
            Arrays.sort(fileList, new Comparator<Object>()
            {
                @Override
                public int compare(Object f1, Object f2) {
                    return ((File) f1).getName().compareTo(((File) f2).getName());
                }
            });

            //Prints the files in file name ascending order
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

}
	}}}

public class MainClass {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
displayDetails dd=new displayDetails();
fileOperations file=new fileOperations();

	dd.displayMenu();
	while(true)
	{
		System.out.println("\t1. Get file names in ascending order");
		System.out.println("\t2. To perform operations on file");
		System.out.println("\t3. Close Application");
		System.out.println("Enter your choice:");

		Scanner sc=new Scanner(System.in);
 int option=sc.nextInt();
if(option==1)
	
{
	file.ascendingOrder();
}
else
	if(option==2)
	{
		System.out.println("\n---Select Any one operation");
		System.out.println("\t1. Add a new file");
		System.out.println("\t2. Delete a file");
		System.out.println("\t3.Search a file");
		System.out.println("\t4. Go back");
		System.out.println("Enter your choice:");
		int input=sc.nextInt();
		switch(input)
		{
		case 1: file.newFile();
		break;
		case 2: file.deletefile();
		break;
		case 3: file.search();
		break;
		case 4: System.out.println("Back to main page");
		}
		}
	
	else
		if(option==3)
			{System.out.println("Exit");
			System.exit(0);
			}
		else {
			System.out.println("Kindly enter valid input");
		}}}}